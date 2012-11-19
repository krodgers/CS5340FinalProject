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
import java.util.HashMap;
import java.util.Iterator;

import edu.stanford.nlp.parser.lexparser.LexicalizedParser;
import edu.stanford.nlp.trees.CollinsHeadFinder;
import edu.stanford.nlp.trees.HeadFinder;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.trees.Trees;

import opennlp.tools.cmdline.parser.ParserTool;
import opennlp.tools.parser.*;
import opennlp.tools.util.Span;
public class Hobb {

	/**
	 * Runs Hobb's
	 * @param corefNP     a NounPhrase of the current coref phrase
	 * @param context		the sentence up to and including the coref phrase
	 * @param NPList		the map of the featurized nounphrases
	 * @return
	 */
	public boolean runHobbs(NounPhrase corefNP, String context, HashMap<String, NounPhrase> NPList)
	{
		//Split sentences
		//String sentence = "The castle in Camelot remained the residence of the king until 536 when he moved it to London. The king of London is highly esteemed.";
		PreProcessing processor = new PreProcessing();
		ArrayList<String> sents = processor.splitSentences(context, System.getProperty("user.dir"));
		//Do full parse of sentences
		//Get the NP in order
		ArrayList<String> npList = new ArrayList<String>();
		ArrayList<Tree> parsedNP;

		
		// Parse the sentence
		parsedNP = parserUtil.fullParse(sents.get(sents.size() - 1));
		// Get the NPs out of the sentence
		for(Tree t : parsedNP)
		{
			npList.add(t.getLeaves().toString());
		}
		
		int stIdx = npList.indexOf(corefNP.getPhrase());
		boolean matched = false;
		// Start in same sentence as coref; search R-> L
		for(int i = stIdx - 1; i >= 0; i--)
		{
			matched = scoreNP(corefNP, NPList.get(npList.get(stIdx)));
			if(matched)
				return true;
		}

		// Iterate over the other sentences
		for(int x = sents.size() - 2; x >= 0; x--)
		{
			npList.clear();
			parsedNP = parserUtil.fullParse(sents.get(x));
			for(Tree t: parsedNP)
			{
				npList.add(t.getLeaves().toString());
			}
			for(int i = 0; i < npList.size(); i++)
			{
				matched = scoreNP(corefNP, NPList.get(npList.get(stIdx)));
				if(matched)
					return true;
			}
			
		}

		/**
		 * noun groups are searched in the following order: 
			In current sentence, R->L, starting from L of PRO
			In previous sentence, L->R
			In S-2, L->R
			In current sentence, L->R, starting from R of PRO
		 */
		
		
		return false;
	}
	//First Person
//	I, me, my, mine, myself
//	We, us, our, ours, ourselves
	
	//Second Person
//	You, you, your, yours, yourself
//	You, you, your, yours, yourselves
	
	//Third Person
//	He, him, his, his, himself
//	She, her, her, hers, herself
//	It, it, its, ---, itself
//	They, them, their, theirs, themselves

	private boolean scoreNP(NounPhrase coref, NounPhrase otherNP) {

		if((coref.getGender() == otherNP.getGender()) && (coref.isPlural() == otherNP.isPlural()))
		{
			if(otherNP.getId() == null)
			{
				otherNP.setId("X"+coreference.idCounter);
				coref.setRef("X"+coreference.idCounter);
				coreference.idCounter ++;
			}
			else
			{
				coref.setRef(otherNP.getId());
			}
			return true;
		}
			
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

