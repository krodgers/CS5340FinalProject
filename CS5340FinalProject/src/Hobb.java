/**
 * Hobb's algorithm for resolving pronoun co-references
 * @author Kathryn Rodgers & James Mitchell
 *
 */

import java.util.ArrayList;
import java.util.HashMap;

import javax.annotation.processing.Processor;

import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.dcoref.Dictionaries;
public class Hobb {

	
	public Hobb()
	{
		coreference.d.animatePronouns.remove("they");
		coreference.d.animatePronouns.remove("them");
		coreference.d.animatePronouns.remove("theirs");
		coreference.d.animatePronouns.remove("their");
		
		
	}
	/**
	 * Runs Hobb's
	 * @param corefNP     a NounPhrase of the current coref phrase
	 * @param context		the sentence up to and including the coref phrase
	 * @param NPList		the map of the featurized nounphrases
	 * @return
	 */
	public boolean runHobbs(NounPhrase corefNP, String context, HashMap<String, NounPhrase> NPList) throws Exception
	{
		try{
		if(context.isEmpty())
			return false;
		//Split sentences
		//String sentence = "The castle in Camelot remained the residence of the king until 536 when he moved it to London. The king of London is highly esteemed.";
		PreProcessing processor = new PreProcessing();
		ArrayList<String> sents = processor.splitSentences(context, System.getProperty("user.dir"));
		//Do full parse of sentences
		//Get the NP in order
		ArrayList<String> npList = new ArrayList<String>();
		boolean matched = false;

		// Find Gender info about coref
		findGender(corefNP);
		findPlurality(corefNP);
		if(sents.size() > 1)
		{
			// Parse the sentence
			findNPS(sents.get(sents.size()-1), npList);
			// Start in same sentence as coref; search R-> L
			for(int i = npList.size() - 1; i >= 0; i--)
			{
				if(npList.get(i)== null)
					continue;
				findGender(NPList.get(npList.get(i)));
				
				matched = scoreNP(corefNP, NPList.get(npList.get(i)));
				if(matched)
					return true;
			}
			// Iterate over the other sentences
			for(int x = sents.size() - 2; x >= 0; x--)
			{
				npList.clear();
				findNPS(sents.get(x),npList);
				for(int i = 0; i < npList.size(); i++)
				{
					matched = scoreNP(corefNP, NPList.get(npList.get(i)));
					if(matched)
						return true;
				}
			}
		}
		else
		{
			// Iterate over the other sentences
			for(int x = sents.size() - 1; x >= 0; x--)
			{
				npList.clear();
				findNPS(sents.get(x),npList);
				for(int i = 0; i < npList.size(); i++)
				{
					matched = scoreNP(corefNP, NPList.get(npList.get(i)));
					if(matched)
						return true;
				}
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
		}catch(Exception e){
			throw e;
		}
	}
	
	
	private void findNPS(String sentence, ArrayList<String> npList) {
		PreProcessing process = new PreProcessing();
		// TODO Auto-generated method stub
		ArrayList<Tree> parsedNP;
		parsedNP = parserUtil.fullParse(sentence);
		// Get the NPs out of the sentence
		NounPhrase temp = null;
		for(Tree t : parsedNP)
		{		//call the createNP method in PreProcessing.java file which will extract the Noun phrases
				//from the np tree and populate the features of each extracted nounphrase
				
			if(t.value().equals("NP") && t.isPrePreTerminal())
				temp = process.createNP(t, coreference.classifiStat, coreference.d);
			else
				for(Tree child:t.getChildrenAsList())
					if(child.isPhrasal())
						temp = process.createNP(child, coreference.classifiStat, coreference.d);		
			
			if(temp != null)
				npList.add(temp.getPhrase());
		}
		
	}
	private void findPlurality(NounPhrase corefNP) {
		if(coreference.d.pluralPronouns.contains(corefNP.getHeadPhrase()))
			corefNP.setPlural(true);
		else
			corefNP.setPlural(false);
	}


	/**
	 * Assigns a gender to the noun phrase
	 * @param corefNP
	 */
	private void findGender(NounPhrase nounPhrase) {
		if(nounPhrase == null)
			return;
		if(coreference.d.femaleWords.contains(nounPhrase.getHeadPhrase()))
				nounPhrase.setGender(NounPhrase.Gender.FEMALE);
		else if(coreference.d.maleWords.contains(nounPhrase.getHeadPhrase()))
			nounPhrase.setGender(NounPhrase.Gender.MALE);
		else if(coreference.d.femalePronouns.contains(nounPhrase.getHeadPhrase()))
			nounPhrase.setGender(NounPhrase.Gender.FEMALE);
		else if(coreference.d.malePronouns.contains(nounPhrase.getHeadPhrase()))
		nounPhrase.setGender(NounPhrase.Gender.MALE);
		else
			nounPhrase.setGender(NounPhrase.Gender.NONE);
	}

	/**
	 * Creates a NP object
	 * @param npTree
	 * @return
	 */
	private NounPhrase createNP(Tree npTree) {
		NounPhrase temp = new NounPhrase();//a new nounphrase cadidate
		for(Tree t : npTree.getChildrenAsList()){
			//if(t.isPhrasal()){//checks if the noun phrase tree is the parent of some leaves
				for(Tree leaf :t.getLeaves()){//get all the leaves of the parent node
					if(!leaf.value().equals("-LRB-") && !leaf.value().equals("-RRB-"))
						temp.addToPhrase(leaf.value(), t.value());
				}
			//}
		}			return temp;
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
		if(coref == null || otherNP == null)
		{
			return false;
		}
		if((coref.getGender() == otherNP.getGender()) && (coref.isPlural() == otherNP.isPlural()))
		{
			if(coref.getPerson() != NounPhrase.Person.THIRD && (coref.getPerson() != otherNP.getPerson()))
				return false;
			if(coreference.d.animatePronouns.contains(coref.getHeadPhrase()) && coreference.d.inanimateWords.contains(otherNP.getHeadPhrase()))
				return false;
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
	
		
}


