import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
import org.xml.sax.InputSource;

import rita.wordnet.RiWordnet;

import edu.mit.jwi.Dictionary;
import edu.mit.jwi.IDictionary;
import edu.mit.jwi.item.IIndexWord;
import edu.mit.jwi.item.ILexFile;
import edu.mit.jwi.item.ISynset;
import edu.mit.jwi.item.ISynsetID;
import edu.mit.jwi.item.IWord;
import edu.mit.jwi.item.IWordID;
import edu.mit.jwi.item.POS;
import edu.mit.jwi.item.Pointer;
import edu.stanford.nlp.ie.AbstractSequenceClassifier;
import edu.stanford.nlp.trees.CollinsHeadFinder;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.trees.TreeTransformer;
import edu.stanford.nlp.trees.Trees;
import edu.stanford.nlp.util.Filter;



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
				//NounPhrase temp = new NounPhrase(corefNodes.item(x).getTextContent());
				//corefs.add(temp);
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
			corefs = new ArrayList<NounPhrase>();
		}
		
		//begin sentence splitting code
		
		/**
		 * Splits sentences by writing paragraphs to file then writing to file;
		 * @param file
		 */
		public ArrayList<String> splitSentences(String currentChunk, String currentDir){
			SentenceModel model = null;
			SentenceDetectorME splitter = null;
			ArrayList<String> returnSentences = new ArrayList<String>();
			try{
				modelIn = new FileInputStream(currentDir + "/classifiers/en-sent.bin");
				model = new SentenceModel(modelIn);
				splitter = new SentenceDetectorME(model);
				
				//open the temp out file and parse the paragraphs one line at a time
				
				String line = currentChunk;
				String[] temp;
				
				line = line.trim();
				temp = splitter.sentDetect(line); //run the splitter which returns an array
				for(int i = 0; i < temp.length; i++)//add each split sentence to the list of sentences
					returnSentences.add(temp[i]);
			}
			catch(Exception e){
				e.printStackTrace();
				return null;
			}
			return returnSentences;
		}
		//end sentence splitting code
		/**
		 * Tokenizes the sentence arrayList. The result of
		 * the tokenizer is an array of the sentence split up into tokens
		 * this method puts those arrays into an arrayList of token arrays.
		 * could possibly read out to file if that is desired.
		 */
		public String[] tokenize(String currChunk){
			//set up tokenizer
			TokenizerME tokenizer;
			TokenizerModel model;
			try {
				modelIn = new FileInputStream("en-token.bin");
				model = new TokenizerModel(modelIn);//initialize model
				tokenizer = new TokenizerME(model);
				
				//Tokenize each sentence
				return tokenizer.tokenize(currChunk);
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		
		/**
		 * This method will POSTag the array list of tokenized sentences
		 * The result of the tagging will be an arrayList of posTags
		 * stored in
		 */
		public ArrayList<String[]> posTag(ArrayList<String[]> sentArrays){
			//set up tagger
			POSTaggerME tagger;
			POSModel model;
			try{
				modelIn = new FileInputStream("en-pos-maxent.bin");
				model = new POSModel(modelIn);
				tagger = new POSTaggerME(model);
				ArrayList<String[]>posTags = new ArrayList<String[]>();
				//tag each tokenized sentence array
				for(String[] sentArray : sentArrays){
					posTags.add(tagger.tag(sentArray));
				}
				return posTags;
				
			}catch(Exception e){
				e.printStackTrace();
				return null;
			}
			
		}
		
		/**
		 * NOT USED --combines the tokenized sentences with the tags in the form "word/tag".
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
		 * NOT USED--uses the open nlp chunker
		 * @param sentArr
		 * @param posArr
		 * @return
		 */
		public String[] partialParse(ArrayList<String[]> sentArr, ArrayList<String[]> posArr){
			ChunkerME chunker;
			ChunkerModel model;
			ArrayList<String[]> chunks = new ArrayList<String[]>();
			
			try {
				modelIn = new FileInputStream("/en-chunker.bin");
				model = new ChunkerModel(modelIn);
				chunker = new ChunkerME(model);
				
				for(int i = 0; i < sentArr.size(); i++){
						 chunks.add(chunker.chunk(sentArr.get(i), posArr.get(i)));
					}
			} catch (InvalidFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return chunksToNP(chunks, sentArr);
			
		}
		
		/**
		 * NOT USED--takes input from the opennlp chunker and turns it into a noun
		 * phrase 
		 * @param chunks
		 * @param tokSent
		 * @return
		 */
		private String[] chunksToNP(ArrayList<String[]> chunks, ArrayList<String[]> tokSent){
			ArrayList<String> NPs = new ArrayList<String>(chunks.size()*2);
			
			for(int i = 0; i < chunks.size(); i++){//cycle through each sentence
				int arrSize = chunks.get(i).length;//cycle through the sentences np chunks
				for(int j = 0; j < arrSize; j++){
					if(chunks.get(i)[j].equals("B-NP")){
						String theNP = tokSent.get(i)[j] + " ";
						j++;
						while(j < arrSize && !chunks.get(i)[j].contains("B-")){
							theNP += tokSent.get(i)[j] + " ";
							j++;
						}
						NPs.add(theNP);
					}
				}
			}
			String[] nounPhrases = new String[NPs.size()];
			return NPs.toArray(nounPhrases);
		}
		
		/**
		 * this method runs the stanford ner classifier
		 * @param nounPhrase the phrase to classify
		 * @param classifier the classifier to use
		 */
		public void FindNer(NounPhrase nounPhrase, AbstractSequenceClassifier classifier){
			String serializedClassifier = "";
			String classification = classifier.classifyWithInlineXML(nounPhrase.getPhrase());
			setNE(classification, nounPhrase);
		}

		/**
		 * This method takes a Named Entity classification(created by FindNER which uses Stanford NER)
		 * and extracts the noun phrases and puts them into the np sent in as a param.
		 * @param np
		 * @param classification
		 */
		private void  setNE(String classification, NounPhrase np){
					classification = "<TEXT>" + classification +"</TEXT>";
			        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			        try{
			        DocumentBuilder builder = factory.newDocumentBuilder();
			        classification = classification.replaceAll("&", "");
			        InputSource is = new InputSource(new StringReader(classification));
			        Document doc = builder.parse(is);
					//classification = classification.replaceAll("<", "&lt");
					//classification = classification.replaceAll(">", "&gt");
			        NodeList nodes = doc.getElementsByTagName("ORGANIZATION");
			        
			        for(int i = 0; i < nodes.getLength(); i++){
			        	String bob = nodes.item(0).getTextContent();
			        	np.addNamedEntity(nodes.item(i).getTextContent(), NounPhrase.Classification.ORGANIZATION);
			        	//System.out.println(bob + " Org");
			        } 
			        nodes = doc.getElementsByTagName("PERSON");
			        for(int i = 0; i < nodes.getLength(); i++){
			        	String bob = nodes.item(i).getTextContent();
			        	np.addNamedEntity(nodes.item(i).getTextContent(), NounPhrase.Classification.PERSON);
			        	//System.out.println(bob + " Pers");
			        }
			        nodes = doc.getElementsByTagName("LOCATION");
		        	 for(int i = 0; i < nodes.getLength(); i++){
			        	String bob = nodes.item(0).getTextContent();
			        	np.addNamedEntity(nodes.item(0).getTextContent(), NounPhrase.Classification.LOCATION);
			          	//System.out.println(bob + " Loc");
		        	 }
		        	 nodes = doc.getElementsByTagName("MISC");
		        	 for(int i = 0; i < nodes.getLength(); i++){
			        	String bob = nodes.item(0).getTextContent();
			        	np.addNamedEntity(nodes.item(0).getTextContent(), NounPhrase.Classification.MISC);
			          	//System.out.println(bob + " Loc");
		        	 }
		        	 nodes = doc.getElementsByTagName("DATE");
		        	 for(int i = 0; i < nodes.getLength(); i++){
			        	String bob = nodes.item(0).getTextContent();
			        	np.addNamedEntity(nodes.item(0).getTextContent(), NounPhrase.Classification.DATE);
			          	//System.out.println(bob + " Loc");
		        	 }
		        	 nodes = doc.getElementsByTagName("MONEY");
		        	 for(int i = 0; i < nodes.getLength(); i++){
			        	String bob = nodes.item(0).getTextContent();
			        	np.addNamedEntity(nodes.item(0).getTextContent(), NounPhrase.Classification.MONEY);
			          	//System.out.println(bob + " Loc");
		        	 }
		        	 nodes = doc.getElementsByTagName("PERCENT");
		        	 for(int i = 0; i < nodes.getLength(); i++){
			        	String bob = nodes.item(0).getTextContent();
			        	np.addNamedEntity(nodes.item(0).getTextContent(), NounPhrase.Classification.PERCENT);
			          	//System.out.println(bob + " Loc");
		        	 }
		        	 nodes = doc.getElementsByTagName("TIME");
		        	 for(int i = 0; i < nodes.getLength(); i++){
			        	String bob = nodes.item(0).getTextContent();
			        	np.addNamedEntity(nodes.item(0).getTextContent(), NounPhrase.Classification.TIME);
			          	//System.out.println(bob + " Loc");
		        	 }
			        
			        }catch(Exception e){e.printStackTrace();}
		}
		
		/**
		 * Checks to see if the nounphrase contains pronouns.
		 * Sets the nounPhrase's pronoun boolean to true if
		 * it's phrase contains a pronoun.
		 * See parserUtil.tagIsPronoun for tags that are considered
		 * prounouns.
		 * @param phrase
		 */
		private void setPronouns(NounPhrase phrase){
			ArrayList<String> posTags = phrase.getPosTags();
			for(int i = 0; i < posTags.size(); i++){
				if(parserUtil.tagIsProunoun(posTags.get(i))){
					phrase.setPronoun(true, phrase.getPhraseAsList().get(i));
					return;
				}
			}
		}
		
		/**
		 * This will determine if a nounphrase is plural or not.
		 * See parserUtil for tags that are considered plural
		 * @param phrase the phrase to check
		 */
		private void determineNumber(NounPhrase phrase) {
			//look at the pos tag of the head noun first
			if(phrase.getHeadPhrase() != null){
				int index = phrase.getHeadPhraseIndex();
				if(index > -1){
					String tag = phrase.getPosTags().get(index);
					//nns and nnps are the two plural noun phrase tags
					phrase.setPlural(parserUtil.tagIsPluralNoun(tag) ? true : false);
				}
			}
			//this part is probably not needed
			else{
				for(String tag: phrase.getPosTags()){
					phrase.setPlural(parserUtil.tagIsPluralNoun(tag) ? true : false);
				}
			}
			
		}

		/**
		 * Returns the member variable Sentences
		 * @return
		 */
		public ArrayList<String> getSentences() {
			return this.sentences;
		}
		
		/**
		 * This method will create a nounphrase from a npTree. Then, this
		 * method will call all methods requisite to populating the new noun
		 * phrase's properties.
		 * @param npTree
		 * @param classifier
		 * @return
		 */
		public NounPhrase createNP(Tree npTree, AbstractSequenceClassifier classifier){
			//extract pos tags
			NounPhrase temp = new NounPhrase();//a new nounphrase cadidate
			for(Tree t : npTree){
				if(t.isPreTerminal()){//checks if the noun phrase tree is the parent of some leaves
					for(Tree leaf :t.getLeaves()){//get all the leaves of the parent node
						if(!leaf.value().equals("-LRB-") && !leaf.value().equals("-RRB-"))
							temp.addToPhrase(leaf.value(), t.value());
					}
				}
			}	
			if(temp.getPhrase() == null)//if the noun phrase was not extracted properly then quietly escape
			{								//this happens when a noun phrase like "here" is extracted with
				return null;				//a non nounphrase label
			}
			//find head nouns
			CollinsHeadFinder headFinder = new CollinsHeadFinder();//Stanford nlp's head finder
			Tree head = headFinder.determineHead(npTree);//exctracts the head from the npTree argument
			String headPhrase = "";//need to reconstruct the head before putting it in the NP head variable
			//reconstruct the head phrase and add it to the temp noun phrase
			for(Tree t: head.getChildrenAsList()){
					for(Tree leaf : Trees.leaves(t)){
						headPhrase += leaf.value() + " ";
					}
					temp.addHeadPhrase(headPhrase);
			}
			//find NER
			FindNer(temp, classifier);
			//determine number
			determineNumber(temp);
			/*remove determiners
			find gender
			
			all need to be done*/
			//determineGender(temp);
			//check if the nounphrase contains a pronoun
			setPronouns(temp);
			setViewPoint(temp);
			return temp;
		}		
		
		

		private void setViewPoint(NounPhrase temp) {
			if(temp.hasPronoun()){
				ArrayList<String> headPhrase = temp.getPhraseAsList();
				
			}
			
			
		}

		public static ArrayList<Tree> splitNP(Tree npTree){
			//ArrayList<Tree> temp = new ArrayList<Tree>();
			ArrayList<Tree> returnTrees = new ArrayList<Tree>();
			for(Tree t: npTree){
				if(t.value().equals("S")){
					for(Tree s: t)
						if(s.isPrePreTerminal() && (s.value().equals("NP")))
							returnTrees.add(s);
				}
				else 
					if((t.isPrePreTerminal()) && (t.value().equals("NP") || t.value().equals("PP")))
						if(!returnTrees.contains(t))
							returnTrees.add(t);
			}
			return returnTrees;
		
		}

		public void test() {
			
			try{
				String wnhome = System.getenv("WNHOME");
				String path = wnhome + File.separator + "dict";
				URL url = new URL("file", null, path);
			//System.setProperty("wordnet.database.dir", url);
			IDictionary dict = new Dictionary(url);
			dict.open();
			IIndexWord idxWord = dict.getIndexWord("dog", POS.NOUN);
			IWordID wordID = idxWord.getWordIDs().get(0);
			IWord word = dict.getWord(wordID);
			System.out.println("Id = " + wordID);
			System.out.println("Lemma = " + word.getLemma());
			System.out.println("Gloss = " + word.getSynset().getGloss());
			//getHypernyms(dict);
			}catch(Exception e){e.printStackTrace();}
			
			
		}

	private void determineGender(NounPhrase phrase) {
		try {
			String wnhome = System.getenv("WNHOME");
			String path = wnhome + File.separator + "dict";
			URL url = new URL("file", null, path);
			// System.setProperty("wordnet.database.dir", url);
			IDictionary dict = new Dictionary(url);
			dict.open();

			
			String[] temp = phrase.getHeadPhrase().split(" ");
			for (String s : temp) {
				IIndexWord idxWord = dict.getIndexWord(s, POS.NOUN);
				if(idxWord == null)//not found
				{
					continue;
				}
				IWordID wordID = idxWord.getWordIDs().get(0); // 1st meaning
				IWord word = dict.getWord(wordID);
				ISynset synset = word.getSynset();

				// get the hypernyms

				ILexFile profile = synset.getLexicalFile();
				if(profile.getName().contains("person"))
					getHypernyms(dict, s);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
		public void getHypernyms(IDictionary dict, String s){
			
		// get the synset

		IIndexWord idxWord = dict.getIndexWord(s, POS.NOUN);
		if(idxWord == null)
			return;
		IWordID wordID = idxWord.getWordIDs().get(0); // 1st meaning

		IWord word = dict.getWord(wordID);
		ISynset synset = word.getSynset();

		// get the hypernyms
		
		List<ISynsetID> hypernyms =

		synset.getRelatedSynsets(Pointer.HYPERNYM);

		// print out each hypernym s id and synonyms

		List<IWord> words;

		for (ISynsetID sid : hypernyms) {

			words = dict.getSynset(sid).getWords();

			System.out.print(sid + " {");

			for (Iterator<IWord> i = words.iterator(); i.hasNext();) {

				System.out.print(i.next().getLemma());

				if (i.hasNext())

					System.out.print(", ");

			}

			System.out.println("}");

		}

	}
}