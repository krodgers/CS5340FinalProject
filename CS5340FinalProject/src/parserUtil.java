import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import edu.mit.jwi.Dictionary;
import edu.mit.jwi.IDictionary;
import edu.mit.jwi.item.IIndexWord;
import edu.mit.jwi.item.IPointer;
import edu.mit.jwi.item.ISynset;
import edu.mit.jwi.item.ISynsetID;
import edu.mit.jwi.item.IWord;
import edu.mit.jwi.item.IWordID;
import edu.mit.jwi.item.POS;
import edu.mit.jwi.item.Pointer;
import edu.mit.jwi.morph.SimpleStemmer;
import edu.stanford.nlp.parser.lexparser.LexicalizedParser;
import edu.stanford.nlp.parser.lexparser.Options;
import edu.stanford.nlp.trees.Tree;



public class parserUtil {

	static LexicalizedParser lp = LexicalizedParser.loadModel("edu/stanford/nlp/models/lexparser/englishPCFG.ser.gz");
	private enum PERSON {THIRD, NOTTHIRD, DONTKNOW};

	public parserUtil() {

	}

	private static int minimum(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}

	public static int computeLevenshteinDistance(CharSequence str1, CharSequence str2) {
		int[][] distance = new int[str1.length() + 1][str2.length() + 1];

		for (int i = 0; i <= str1.length(); i++)
			distance[i][0] = i;
		for (int j = 1; j <= str2.length(); j++)
			distance[0][j] = j;

		for (int i = 1; i <= str1.length(); i++)
			for (int j = 1; j <= str2.length(); j++)
				distance[i][j] = minimum(
						distance[i - 1][j] + 1,
						distance[i][j - 1] + 1,
						distance[i - 1][j - 1]
								+ ((str1.charAt(i - 1) == str2.charAt(j - 1)) ? 0
										: 1));

		return distance[str1.length()][str2.length()];
	}

	/**
	 * Does a full parse of the sentence
	 * Returns a list of Noun Phrase trees
	 */
	public static ArrayList<Tree> fullParse(String sentence)
	{
		ArrayList<Tree> nounPhrases = new ArrayList<Tree>();

		Tree parsed = lp.apply(sentence);
		Tree domnp = null;
		for(Tree t: parsed.preOrderNodeList())	                
		{
			if(t.isPhrasal())
			{
				if(((t.label().value().equals("NP") && domnp==null) || (t.label().value().equals("NP") && !domnp.dominates(t))) && !t.pennString().contains("VP"))
				{
					domnp = t;
					nounPhrases.add(t);
				}
			}
   		}

		return nounPhrases;
	}
	
	/**
	 * this will check if a phrase is definite or indefinite
	 * @param posTags
	 * @param phrase
	 * @return Definite if current phrase contains "the"; indefinite contains "a", "an"; else none 
	 */
	public static NounPhrase.Article CheckForArticle(ArrayList<String> posTags, ArrayList<String> phrase){
		for(int i = 0; i < posTags.size(); i++){
			String currPos = posTags.get(i);
			if(currPos.toLowerCase().equals("dt")){
				String currPhrase = phrase.get(i).trim().toLowerCase();
				if(currPhrase.equals("a")||currPhrase.equals("an"))
					return NounPhrase.Article.INDEFINITE;
				else if(currPhrase.equals("the"))
					return NounPhrase.Article.DEFINITE;
				else if(currPhrase.equals("that"))
					return NounPhrase.Article.DEMONSTRATIVE;
			}
		
		}
		return NounPhrase.Article.NONE;
	}

	/**
	 * checks if a tag is a nounphrase
	 * @param tag
	 * @return true if a nounphrase
	 */
	public static boolean tagIsProunoun(String tag){
		String temp = tag.toUpperCase();
		if(temp.equals("WP") || temp.equals("WP$") || temp.equals("PRP$") || temp.equals("PRP"))
			return true;
		return false;
	}
	/**
	 * checks if a tag indicates plurality
	 * @param tag
	 * @return true if the tag is plural, false otherwise
	 */
	public static boolean tagIsPluralNoun(String tag){
		if(tag.equals("NNS") || tag.equals("NNPS")){
			return true;
		}
		return false;
	}

	/**
	 * Does a full parse of the sentence
	 * Returns if the main verb is 3rd person, not 3rd person, or cannot be determined
	 */
	public static String parseVerbs(String sentence)
	{
		PERSON person = PERSON.DONTKNOW;
		Tree parsed = lp.apply(sentence);
		for(Tree t: parsed.preOrderNodeList())	                
		{
			if((t.label().value().equals("VBP")))
			{
				person = PERSON.NOTTHIRD;
			}
			if(t.label().value().equals("VBZ"))
			{
				person = PERSON.THIRD;
			}
		}
		return person.toString();
	}
	
	
	public static NounPhrase.Classification checkWordnetClass(String phrase) throws Exception {
		// construct the URL to the Wordnet dictionary directory
		IIndexWord idxWord = coreference.dict.getIndexWord(phrase, POS.NOUN);
		if(idxWord == null)
			return null;
		IWordID wordID = idxWord.getWordIDs().get(0);
		IWord word = coreference.dict.getWord(wordID);
		ISynset synset = word.getSynset();
		String lexName = synset.getLexicalFile().getName();
		String clss = lexName.substring(lexName.indexOf(".")+1).toUpperCase();
		if(phrase.equals("time") && clss.equals("EVENT"))
			clss = "TIME";
		return NounPhrase.Classification.valueOf(clss);
	}
}