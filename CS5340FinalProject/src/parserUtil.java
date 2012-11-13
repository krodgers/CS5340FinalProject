import java.util.ArrayList;

import edu.stanford.nlp.parser.lexparser.LexicalizedParser;
import edu.stanford.nlp.parser.lexparser.Options;
import edu.stanford.nlp.trees.Tree;



public class parserUtil {

	static LexicalizedParser lp = LexicalizedParser.loadModel("edu/stanford/nlp/models/lexparser/englishPCFG.ser.gz");
	
	
	public parserUtil() {
		
	}

	private int minimum(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}

	public int computeLevenshteinDistance(CharSequence str1, CharSequence str2) {
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
		Options bob = new Options();
		Tree parsed = lp.apply(sentence);
		Tree domnp = null;
		for(Tree t: parsed.preOrderNodeList())	                
		{
			if(t.isPhrasal())
			{
				if((t.label().value().equals("NP") && domnp==null) || (t.label().value().equals("NP") && !domnp.dominates(t)))
				{
					domnp = t;
					nounPhrases.add(t);
				}
			}
   		}
		
		return nounPhrases;
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
}
