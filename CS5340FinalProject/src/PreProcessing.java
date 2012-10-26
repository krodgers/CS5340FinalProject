import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import opennlp.tools.chunker.ChunkerME;
import opennlp.tools.chunker.ChunkerModel;
import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSTaggerME;
import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;
import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;
import opennlp.tools.util.InvalidFormatException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;


/**
 * Methods to for preprocessing input files
 * 
 * @author Kathryn Rodgers & James Mitchell
 *
 */
public class PreProcessing {
	
	private ArrayList<NounPhrase> corefs = new ArrayList<NounPhrase>();
	/**
	 * Strips the XML tags out of the file.  
	 * Creates a list of NounPhrases that are in the coref brackets
	 * @param file  the xml file
	 */
	public void stripXML(File file)
	{
		DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			builder = fact.newDocumentBuilder();
			Document input = builder.parse(file);
			input.getDocumentElement().normalize();
			NodeList corefNodes = input.getElementsByTagName("COREF");
			for(int x = 0; x < corefNodes.getLength(); x++)
			{
				NounPhrase temp = new NounPhrase(corefNodes.item(x).getTextContent());
				corefs.add(temp);
			}
			NodeList textNodes = input.getElementsByTagName("TXT");
			String s = textNodes.item(0).getTextContent();
			File tempXML = new File("tempXML.txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter(tempXML));
			bw.write(s);
			bw.close();
			
		} catch (Exception e) {
			System.err.println("Problems stripping XML");
			e.printStackTrace();
		}
	
		
	}
		private ArrayList<String> sentences;
		private NounPhrase[] nounPhrases;
		private ArrayList<String[]> tokenizedSentences;//the sentences tokenized
		private ArrayList<String[]> tokenPosTags;//tags directly mapped to the tokenizedSentence ArrayList
		//open nlp tools
		InputStream modelIn = null;//different models need to be loaded for each task
		
		
		public PreProcessing(){
			sentences = new ArrayList<String>(20);
			tokenizedSentences = new ArrayList<String[]>();
			tokenPosTags = new ArrayList<String[]>();
		}
		
		//begin sentence splitting code
		
		/**
		 * Splits sentences by writing paragraphs to file then writing to file;
		 * @param file
		 */
		public void splitSentences(File file){
			File tempOut = new File("temp.txt");
			SentenceModel model = null;
			SentenceDetectorME splitter = null;
			BufferedReader reader = null;
			try{
				modelIn = new FileInputStream("en-sent.bin");
				model = new SentenceModel(modelIn);
				splitter = new SentenceDetectorME(model);
				fileToParagraphs(file, tempOut);
				
				//open the temp out file and parse the paragraphs one line at a time
				reader = new BufferedReader(new FileReader(tempOut));
				String line;
				String[] temp;
				while((line = reader.readLine()) != null){
					temp = splitter.sentDetect(line); //run the splitter which returns an array
					for(int i = 0; i < temp.length; i++)//add each split sentence to the list of sentences
						sentences.add(temp[i]);
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
			finally{
				try{
					reader.close();
					tempOut.deleteOnExit();
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		
		/**
		 * File reads in a file and writes each paragraph on its own line
		 * @param paragraphs
		 * @param inFile
		 * @param outFile
		 */
		public void fileToParagraphs(File inFile, File outFile){
			BufferedReader reader = null; 
			BufferedWriter writer = null;
			try{
				reader = new BufferedReader(new FileReader(inFile));
				writer = new BufferedWriter(new FileWriter(outFile));
				String para = "";
				String currentSentence;
				//read in splitting into paragraphs
				while((currentSentence = reader.readLine()) != null){
					para += currentSentence;
					if(currentSentence.equals("") && !para.equals("")){
						writer.write(para + "\n");
						para = "";
					}
				}
			}catch(Exception e){
				
			}
				try{
					reader.close();
					writer.close();
				}catch(Exception e){
					e.printStackTrace();
			}
		}
		
		/**
		 * Splits sentences without writing to file
		 * @param file
		 */
		public void paragraphSplitterFileWriter(File file){
			SentenceModel model = null;
			SentenceDetectorME splitter = null;
			try{
				modelIn = new FileInputStream("en-sent.bin");
				model = new SentenceModel(modelIn);
				splitter = new SentenceDetectorME(model);
				fileToParagraphs(file);
				String[] temp;
				ArrayList<String> tempSent = new ArrayList<String>();
				for(String parag : sentences){
					temp = splitter.sentDetect(parag);
					for(int i = 0; i < temp.length; i++){
						tempSent.add(temp[i]);
					}
				}
				sentences = tempSent;
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		
		/**
		 * This method writes to the paragraphs parameter a list of paragraphs read in from
		 * the file.
		 * @param paragraphs place to put the paragraphs
		 * @param inFile The file to read in
		 */
		public void fileToParagraphs(File inFile){
			if(sentences == null){
				sentences = new ArrayList<String>();
			}
			BufferedReader reader = null; 
			try{
				reader = new BufferedReader(new FileReader(inFile));
				String para = "";
				String currentSentence;
				//read in splitting into paragraphs
				while((currentSentence = reader.readLine()) != null){
					para += currentSentence;
					if(currentSentence.equals("") && !para.equals("")){
						sentences.add(para);
						para = "";
					}
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}	
		
		
		//end sentence splitting code
		/**
		 * Tokenizes the sentence arrayList. The result of
		 * the tokenizer is an array of the sentence split up into tokens
		 * this method puts those arrays into an arrayList of token arrays.
		 * could possibly read out to file if that is desired.
		 */
		public void tokenize(){
			//set up tokenizer
			TokenizerME tokenizer;
			TokenizerModel model;
			try {
				modelIn = new FileInputStream("en-token.bin");
				model = new TokenizerModel(modelIn);//initialize model
				tokenizer = new TokenizerME(model);
				
				//Tokenize each sentence
				for(String sentence : sentences){
					tokenizedSentences.add(tokenizer.tokenize(sentence));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		/**
		 * This method will POSTag the array list of tokenized sentences
		 * The result of the tagging will be an arrayList of posTags
		 * stored in
		 */
		public void posTag(){
			//set up tagger
			POSTaggerME tagger;
			POSModel model;
			try{
				modelIn = new FileInputStream("en-pos-maxent.bin");
				model = new POSModel(modelIn);
				tagger = new POSTaggerME(model);
				
				//tag each tokenized sentence array
				for(String[] sentArray : tokenizedSentences){
					tokenPosTags.add(tagger.tag(sentArray));
				}
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		/**
		 * combines the tokenized sentences with the tags in the form "word/tag".
		 * @return an array list of fused tokens
		 */
		public ArrayList<String[]> fuseTagsForFunAndProfit(){
			if(tokenPosTags.isEmpty() || tokenizedSentences.isEmpty())
				return null;
			ArrayList<String[]> fused = new ArrayList<String[]>();
			//cycle through each sentence
			for(int i = 0; i < tokenizedSentences.size(); i++){
				String[] tempToken = new String[tokenizedSentences.get(i).length];// this array will contain fused tokens
				//cycle through each sentences tokens
				for(int j = 0; j < tokenizedSentences.get(i).length; j++){
					//fuse the tokens
					String fusedString = "";
					if(tokenPosTags.get(i)[j] != null && tokenizedSentences.get(i)[j] != null){
						fusedString = tokenizedSentences.get(i)[j];
						fusedString +=	"/" + tokenPosTags.get(i)[j];
							
					}
					tempToken[j] = fusedString;//add the fused string to the temp tokenized sentenc
				}
				fused.add(tempToken);
			}
			return fused;
		}
		
		/**
		 * Using open nlp's partial parser(chunker) we create the
		 * noun phrases!!!
		 */
		public void partialParse(){
			ChunkerME chunker;
			ChunkerModel model;
			ArrayList<String[]> chunks = new ArrayList<String[]>();
			
			try {
				modelIn = new FileInputStream("en-chunker.bin");
				model = new ChunkerModel(modelIn);
				chunker = new ChunkerME(model);
				
				
				for(int i = 0; i < tokenizedSentences.size(); i++){
						chunks.add(chunker.chunk(tokenizedSentences.get(i), tokenPosTags.get(i)));
					}
			} catch (InvalidFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			chunksToNP(chunks);
			
		}
		
		/**
		 * This is a private helper method for the partial parser.
		 * This method takes the results of the partial parser and makes
		 * noun phrases out of it!!!!
		 */
		private void chunksToNP(ArrayList<String[]> chunks){
			ArrayList<NounPhrase> NPs = new ArrayList<NounPhrase>(chunks.size()*2);
			
			for(int i = 0; i < chunks.size(); i++){//cycle through each sentence
				int arrSize = chunks.get(i).length;//cycle through the sentences np chunks
				for(int j = 0; j < arrSize; j++){
					if(chunks.get(i)[j].equals("B-NP")){
						String theNP = tokenizedSentences.get(i)[j] + " ";
						j++;
						while(j < arrSize && !chunks.get(i)[j].contains("B-")){
							theNP += tokenizedSentences.get(i)[j] + " ";
							j++;
						}
						NPs.add(new NounPhrase(theNP, i));
					}
				}
			}
			nounPhrases = new NounPhrase[NPs.size()];
			NPs.toArray(nounPhrases);
		}
	}

