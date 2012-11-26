import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

import edu.stanford.nlp.dcoref.Dictionaries;
import edu.stanford.nlp.ie.crf.CRFClassifier;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.util.StringUtils;


public class coreference {
	public static Integer idCounter = 0;
	private static Dictionaries d = new Dictionaries();
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * VARIABLES
		 * Lists corefs --> resolved/ not
		 * List NP
		 * Temp buffer --> stuff to process
		 * List Sentences
		 * current label to give
		 * 
		 */
		String curDir = System.getProperty("user.dir");
		//String serializedClassifier = curDir+ "/classifiers/english.all.3class.distsim.crf.ser.gz";
		String serializedClassifier = curDir+ "/classifiers/english.conll.4class.distsim.crf.ser.gz";
		
		ArrayList<String> sentences = new ArrayList<String>();
		CRFClassifier classifier = CRFClassifier.getClassifierNoExceptions(serializedClassifier);
		PreProcessing processor = new PreProcessing();
		ArrayList<NounPhrase> nounPhrasesList = new ArrayList<NounPhrase>();
		HashMap<String, NounPhrase> nounPhraseMap = new HashMap<String,NounPhrase>();
		//Read in Arguments
		if(args.length != 2)
		{
			//System.out.println("Usage: coreference <listfile> <responsedir>");
			return;
		}
		String listFileName = args[0];  // list of files to process; FOR DEBUGGING USE listFile.txt
		String dir = args[1];	// directory where to store response files; assumes the final / is included
		ArrayList<String> testFiles = getTestFiles(listFileName);
		//StringMatcher matcher = new StringMatcher();
		for(String fileName : testFiles)
		{
			//Read in the file as one big huge string
			String document = "";
			String[] corefSplit;
			File input = new File(fileName);
			try {
				BufferedReader bf = new BufferedReader(new FileReader(input));
				String line;
				while((line = bf.readLine()) != null)
				{
					document += line + " ";
				}
				bf.close();
				//Split on <COREF ..... COREF/>
				corefSplit = document.split("</COREF>");

			} catch (Exception e) {
				System.err.println("Filed reading input file: " + fileName);
				e.printStackTrace();
				return;
			}


			System.out.println("Processing file: " + fileName);
			/**
			 * remove <TXT> </TXT> tags
			 */
			corefSplit[0] = removeBegTXT(corefSplit[0]);
			corefSplit[corefSplit.length-1] = removeFinTXT(corefSplit[corefSplit.length-1]);
			

			//Iterate over the splitArray:

			/**
			 * This part is experimental.  
			 */
			for(int i = 0; i < Array.getLength(corefSplit); i++)
			{
				String currChunk = corefSplit[i];
				if(!currChunk.contains("<COREF ID="))
					continue;
				int startIdx = currChunk.indexOf(">");
				//preserve coref Id
				int idIndex= currChunk.indexOf("ID=\"")+4;
				String idNum = currChunk.substring(idIndex, currChunk.indexOf('"', idIndex));
				String currentCoref = currChunk.substring(startIdx);
				//preprocess
				currChunk = currChunk.substring(0, currChunk.indexOf("<COREF")).trim();
				//split sentences
				ArrayList<String> unProcSentences = processor.splitSentences(currChunk, curDir);
				//end preprocess
				
				/*
				 * process coreference into a nounphrase 
				 */
				NounPhrase corefNP;
				if((corefNP = NPcreateCorefNP(currentCoref, idNum, processor, classifier)) == null){
					continue;
				}
				//parse
				/*
				 * full parse chunk before the noun phrase, extract the NPs, populate new NPs' features, Add to nounphrase arraylist/hashmap
				 */
				ArrayList<NounPhrase> fullNPs = new ArrayList<NounPhrase>();//this is a temp list that contains all new noun phrases in the current chunk
				for(String sent : unProcSentences){
					//parse the sentence
					/**
					 * Sometimes the sentence contains more than one NP. 
					 * I hope you don't me rewriting this... :?
					 */
					ArrayList<NounPhrase> nounPhrase = new ArrayList<NounPhrase>();
					if((nounPhrase = extractNounPhrase(sent, classifier, processor)).size() != 0)
					{
						//if the extractNounphrase returns null then no noun phrase was found in the current tree and should not be added 
						for(NounPhrase n : nounPhrase)
							fullNPs.add(n);
					}
					/*fullNPs.addAll(extractSplitNounPhrases(sent, classifier, processor));*/
				}				
				//add all nounphrases from the chunk to hashmap of nounphrases
				for(NounPhrase np: fullNPs){
					nounPhraseMap.put(np.getPhrase(), np);
					nounPhrasesList.add(np);
				}
				
				//StringMatcher matcher = new StringMatcher(nounPhrasesNotMapRefactorMe, phrase);
				//matcher.setList(n);
				//matcher.setCoref(corefNP);
				
				
				//processor.test();
				int matchId = -1;
				matchId = StringMatcher.createScores(nounPhrasesList, corefNP);
				if(matchId > -1){
					StringMatcher.CreateMatch(matchId,nounPhrasesList, corefNP, idCounter);
					idCounter++;
				}
				
				Hobb h = new Hobb();
				if(corefNP.hasPronoun()&& (corefNP.getRef() != null))
				{
					h.runHobbs(corefNP, currChunk,  nounPhraseMap);
				}
				nounPhrasesList.add(corefNP);
				nounPhraseMap.put(corefNP.getPhrase(), corefNP);
				
			}
			StringMatcher.printMatchesToFile(StringUtils.getBaseName(fileName, ".crf"), dir, nounPhrasesList);
			idCounter = 1;
			nounPhrasesList.clear();
			nounPhraseMap.clear();
				
		}	

	}
	
	private static ArrayList<NounPhrase> extractNounPhrase(String sent, CRFClassifier classifier, PreProcessing processor) {
		ArrayList<Tree> npTrees = parserUtil.fullParse(sent);
		//the full parser will populate npTrees and the following will extract AND process(featurize) NP's
		ArrayList<NounPhrase> addCandidate = new ArrayList<NounPhrase>();
		NounPhrase np;
		for(Tree t : npTrees){
			//call the createNP method in PreProcessing.java file which will extract the Noun phrases
			//from the np tree and populate the features of each extracted nounphrase
			if((np = processor.createNP(t,classifier,d)) != null)
				addCandidate.add(np);
			
		}
		return addCandidate;
	}
	
	private static ArrayList<NounPhrase> extractSplitNounPhrases(String sent,
			CRFClassifier classifier, PreProcessing processor) {
		
		ArrayList<NounPhrase> returnCandidates = new ArrayList<NounPhrase>();
		ArrayList<Tree> npTrees = parserUtil.fullParse(sent);
		//the full parser will populate npTrees and the following will extract AND process(featurize) NP's
		for(Tree t : npTrees){
				for(Tree split : processor.splitNP(t)){
					//call the createNP method in PreProcessing.java file which will extract the Noun phrases
					//from the np tree and populate the features of each extracted nounphrase
					NounPhrase addCandidate = processor.createNP(split, classifier, d);
					if(addCandidate != null){
						returnCandidates.add(addCandidate);
					}
				}
		}
		return returnCandidates;
	}

	private static NounPhrase NPcreateCorefNP(String currentCoref, String idNum, PreProcessing processor, CRFClassifier classifier) {
		NounPhrase corefNP;//this is the nounphrase object that will contain the coref
		if(currentCoref.contains(">"))
			currentCoref = currentCoref.replace(">", "");
		//take the current coref and run a full parse on it
		ArrayList<Tree> corefNPTree = parserUtil.fullParse(currentCoref);
		/*
		 * This needs to be fixed. the following if statement check to see if the parsed
		 * coreference tree is empty which it should not be!!!
		 */
		if(corefNPTree.isEmpty()){
			//System.out.println("Failed to parse coref ID=" + idNum + " FileName: " + fileName);
			return null;
		}
		//Get the tree containing the noun phrase
		Tree corefTree = corefNPTree.get(0);
		//create
		corefNP = processor.createNP(corefTree, classifier, d);
		corefNP.setId(idNum);
		return corefNP;
	}

	/**
	 * Returns String from array
	 */
	private static String arrayToString(String[] sentence){
		String temp = "";
		for(int i = 0; i < sentence.length; i ++){
			temp += sentence[i] + " ";
		}
		return temp;
	}

	/**
	 * Gets a list of the files to be processed
	 * @param listFileName
	 * @return
	 */
	private static ArrayList<String> getTestFiles(String listFileName) {

		ArrayList<String> files = new ArrayList<String>();
		try {
			BufferedReader bf = new BufferedReader(new FileReader(new File(listFileName)));
			String line;
			while((line = bf.readLine()) != null)
			{
				files.add(line);
			}
		} catch (Exception e) {
			System.err.println("Problems reading in testfile");
			e.printStackTrace();
		}
		return files;
	}
	
	private static String removeBegTXT(String doc){
		if(doc.contains("<TXT>")){
			doc =  doc.substring(doc.indexOf(">")+1).trim();
		}
		return doc;
	}
	private static String removeFinTXT(String doc){
		if(doc.contains("</TXT>"))
			doc = doc.substring(0, doc.lastIndexOf("</"));
		return doc;
	}
	
	

}
