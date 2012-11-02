/**
 * Hobb's algorithm for resolving pronoun co-references
 * @author Kathryn Rodgers & James Mitchell
 *
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

import edu.stanford.nlp.parser.lexparser.LexicalizedParser;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.trees.Trees;

import opennlp.tools.cmdline.parser.ParserTool;
import opennlp.tools.parser.*;
import opennlp.tools.util.Span;
public class Hobb {

	/**
	 * Runs Hobb's algorithm 
	 * @param NP	The noun phrase containing the pronoun
	 * @param context	The sentence containing NP and previous sentences
	 * @return  true if a coreferent NP is found
	 */
	public boolean runHobbs(String NP, String context)
	{
		//Split sentences
		String sentence = "The castle in Camelot remained the residence of the king until 536 when he moved it to London.";
		//Do full parse of sentences
		parserUtil pu = new parserUtil();
		Tree parse = pu.fullParse(sentence);
		//Get the NP in order
		ArrayList<NounPhrase> npList = new ArrayList<NounPhrase>();
		/**
		 * noun groups are searched in the following order: 
			In current sentence, R->L, starting from L of PRO
			In previous sentence, L->R
			In S-2, L->R
			In current sentence, L->R, starting from R of PRO
		 */
		npList.indexOf(new NounPhrase(NP));
		
		return false;
	}
	/**
	 * Creates a full parse of the sentence
	 */
	public void fullParseStanford(String sentence)
	{
		//Print out all the Noun Phrases
//		for(Tree t: parsed)
//		{
//			if(t.label().value().equals("NP"))
//				System.out.println(t.getLeaves());
//					
//		}
		
		
		
	}
	
	/** Takes an array and creates a string
	 * So {the,dog,ran} would be "the dog ran "
	 */
	private String arrayToString(String[] strings) {
		String result = "";
		for(String s : strings)
		{
			result += s + " ";
		}
		return result;
	}

	// 

}
