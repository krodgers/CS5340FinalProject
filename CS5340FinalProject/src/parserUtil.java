import java.util.ArrayList;

import edu.stanford.nlp.parser.lexparser.LexicalizedParser;
import edu.stanford.nlp.trees.Tree;



public class ParserUtil {

	static LexicalizedParser lp = LexicalizedParser.loadModel("edu/stanford/nlp/models/lexparser/englishPCFG.ser.gz");;
	
	
	public ParserUtil() {
		
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
}
