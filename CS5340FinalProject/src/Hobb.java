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
		
		return false;
	}
	public void fullParseStanford(File input)
	{
		//Tokenize Sentences
		PreProcessing tokenizer = new PreProcessing();
		tokenizer.splitSentences(input);
//		tokenizer.tokenize();
		ArrayList<String> sents = tokenizer.getSentences();
		
		//Parse the thing
		LexicalizedParser lp = LexicalizedParser.loadModel("edu/stanford/nlp/models/lexparser/englishPCFG.ser.gz");
		
		
		Tree parsed = lp.apply(sents.get(0));
		//Tree parsed = lp.apply("The Los Angeles Count fire inspector Sam Padilla won the election.");
		System.out.println("PENN PRINT");
		parsed.pennPrint();
		System.out.println("XML PRINT");
		parsed.indentedXMLPrint();
		System.out.println();	
		
		//Print out all the Noun Phrases
		for(Tree t: parsed)
		{
			if(t.label().value().equals("NP"))
				System.out.println(t.getLeaves());
					
		}
		
		
		
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
