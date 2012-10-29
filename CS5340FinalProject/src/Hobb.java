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

	public void fullParseOpenNLP()
	{
		//Tokenize Sentences
		PreProcessing tokenizer = new PreProcessing();
		File input = new File("tempXML.txt");
		tokenizer.splitSentences(input);
		tokenizer.tokenize();
		
		// Run full Parse
		ArrayList<String[]> tokenSents = tokenizer.getTokenizedSentences();
		try{
			InputStream modelIn = new FileInputStream("en-parser-chunking.bin");
			ParserModel psrModel = new ParserModel(modelIn);
			Parser parser = ParserFactory.create(psrModel);
			String line = arrayToString(tokenSents.get(3));
			Parse topParses[] = ParserTool.parseLine(line, parser, 1);
			
			Parse temp = Parse.parseParse(line);
			temp.show();
			temp.showCodeTree();
		
			for(Parse p : topParses)
			{
				p.show();
			}
		}
		catch(Exception e)
		{
			System.err.println("Problems with Full Parsing");
			e.printStackTrace();
		}
	}

	
	public void fullParseStanford(File input)
	{
		//Tokenize Sentences
		PreProcessing tokenizer = new PreProcessing();
		tokenizer.paragraphSplitterFileWriter(input);
		tokenizer.splitSentences(input);
		tokenizer.tokenize();
		ArrayList<String[]> tokenSents = tokenizer.getTokenizedSentences();
		
		//Parse the thing
		LexicalizedParser lp = LexicalizedParser.loadModel("edu/stanford/nlp/models/lexparser/englishPCFG.ser.gz");
		
		
		//Tree parsed = lp.apply(tokenSents.get(3));
		Tree parsed = lp.apply("The Los Angeles Count fire inspector Sam Padilla won the election.");
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
