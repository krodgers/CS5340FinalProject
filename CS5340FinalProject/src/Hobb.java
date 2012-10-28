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

import opennlp.tools.cmdline.parser.ParserTool;
import opennlp.tools.parser.*;
import opennlp.tools.util.Span;
public class Hobb {

	public void fullParseOpenNLP()
	{
		// Run full Parse
		PreProcessing tokenizer = new PreProcessing();
		File input = new File("tempXML.txt");
		tokenizer.splitSentences(input);
		tokenizer.tokenize();
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

	
	public void fullParseStanford()
	{
		
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
