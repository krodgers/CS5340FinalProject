import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * This class is a collection of static methods that will take care of string matching
 * @author James
 *
 */
public class StringMatcher {


	/**
	 * This method will compare a coreference against a candidate NounPhrase. Specifically,
	 * this method will compare the coreference's Named entities against the candidate's named entities
	 *  Once a NounPhrase's classification and named entity phrase match exactly, this
	 * method will return 1. If no match is found, 0 will be returned.
	 * @param candidate possible match
	 * @param current coreference being matched
	 * @return 1 if a match is found 0 otherwise
	 */
	public static int matchNE(NounPhrase candidate, NounPhrase coref){
		ArrayList<NounPhrase.NamedEntity> candNEList = candidate.getNE();//get the current candidate's List of named entities
		ArrayList<NounPhrase.NamedEntity> corefNEList = coref.getNE();//get the coreference's list of named entities
		if(!candNEList.isEmpty() && !corefNEList.isEmpty()){ //check to make sure niether NE list is empty
			if(candNEList.size() == corefNEList.size()) //check to see if the coref and NE have the same ammount of NEs
				for(NounPhrase.NamedEntity ce: candNEList){
					for(NounPhrase.NamedEntity cre: corefNEList){
						//for each named entity in the coref and candidate's list. check to see if thier phrases match.
						if(ce.phrase.equals(cre.phrase) && ce.classification == cre.classification){
									return 2;
						}
					}
				}
			for(NounPhrase.NamedEntity ce: candNEList){
				for(NounPhrase.NamedEntity cre: corefNEList){
					//for each named entity in the coref and candidate's list. check to see if thier phrases match.
					if(ce.phrase.toLowerCase().trim().contains(cre.phrase.toLowerCase().trim()))
								return 1;
				}
			}
		}
		return 0;
	}

	public static int partialHeadMatch(NounPhrase candidate, NounPhrase coref){
		for(String c : candidate.getHeadPhrase().split(" "))
			for(String cr : coref.getHeadPhrase().split(" ")){
				if(c.toLowerCase().trim().equals(cr.toLowerCase().trim()))
					return 1;				
			}
		for(String c : candidate.getHeadPhrase().split(" "))
			for(String cr : coref.getHeadPhrase().split(" ")){
				String[] ca = c.split(" ");
				String[] cra = cr.split(" ");
				if(ca.length > 0 && cra.length > 0)
					if(ca[ca.length-1].equals(cra[cra.length-1]))
						return 1;
			}
		return 0;
	}

	/**
	 * This method will take a candidate Noun phrase and compare its head phrase with the coreference's
	 * Head phrase.
	 * @param candidate possible match 
	 * @param coref
	 * @return 1 if the head phrases match. 0 otherwise
	 */
	public static int fullStringMatchHeads(NounPhrase candidate, NounPhrase coref){
		String candHead = candidate.getHeadPhrase();
		String corefHead = coref.getHeadPhrase();
		if(candHead.equals(corefHead))
			return 2;
		if(candidate.getHeadPhrase().contains(coref.getHeadPhrase()))
			return 1;
		return 0;
	}

	public static int containsStringMatch(NounPhrase candidate, NounPhrase coref){
		String candPhrase = candidate.getPhrase();
		String corefPhrase = candidate.getPhrase();
		if(candPhrase.contains(corefPhrase))
			if(parserUtil.computeLevenshteinDistance(candPhrase, corefPhrase) < 4){
				return 2;
			}
			else
				return 1;
		else
			return 0;
	}

	public static int distance(NounPhrase candidate, NounPhrase coref){
		String candPhrase = candidate.getPhrase();
		String corefPhrase = candidate.getPhrase();
		if(parserUtil.computeLevenshteinDistance(candPhrase, corefPhrase) <= 8){
			return 2;
		}
		else
			return 0;
	}
	public static int pluralityMatch(NounPhrase candidate, NounPhrase coref){
		if((!candidate.isPlural() && !coref.isPlural()) || (candidate.isPlural() && coref.isPlural()))
			return 1;
		else
			return 0;
	}
	/**
	 * This method is a sort of driver for the string matching. This method takes the current
	 * coref and cycles through a list of nounphrases. Each nounphrase in the list has it's head
	 * and named entities compared to the current coreference. This method will keep track of the best
	 * possible match, replacing it with a match that beats the current best's score.
	 * @param list The list of nounphrase candidates
	 * @param coref the current coreference
	 * @return the index of the best matched candidates location in the Nounphrase list 
	 */
	public static int createScores(ArrayList<NounPhrase> list, NounPhrase coref){
		int bestIndex = -1;
		int bestScore = 0;
		//Start from the end of the list because that will contain the noun phrases that are closest to the coref
		for(int i = list.size()-1; i > -1; i--){
			int score = 0;
			NounPhrase candidate = list.get(i);
			score = fullStringMatchHeads(candidate, coref);
			score += matchNE(candidate, coref);
			score += containsStringMatch(candidate, coref);
			score += partialHeadMatch(candidate, coref);
			if(score > bestScore){
				bestIndex = i;
				bestScore = score;
			}
		}
		if(bestScore > 0){
			//System.out.println(coref.getPhrase() + " ID=" + coref.getId());
			NounPhrase winner = list.get(bestIndex);
			//System.out.println(winner.getPhrase() + (winner.getId() != null ? (" ID=" + winner.getId()) : ""));
			return bestIndex;
		}
		return -1;
	}
	/**
	 * this method is called by the main method and is used to create a match.
	 * if the candidate winner doesn't currently have an ID then this method will
	 * create one in the form of "X+idIndex" where the idIndex is an incrementing counter.
	 * if the current candidate does have an id, this method will simply set the coref's reference
	 * to the candidate's id.
	 * @param matchId the location of the candidate in the nounphrase list
	 * @param list
	 * @param coref
	 */
	public static void CreateMatch(int matchId, ArrayList<NounPhrase> list, NounPhrase coref, Integer idCounter) {
		//check to see if matched item is a previous coref

		NounPhrase match = list.get(matchId);

		if(list.get(matchId).getId() == null){
			//not coref
			//set ID
			String ref = "X" + idCounter;
			match.setId(ref);
			//set coref ref tag to the match's id
			coref.setRef(ref);
		}
		else{
			//match is a previous coref
			//just set the coref's ref to be the id of the old coref
			coref.setRef(match.getId());
		}

	}



	/**
	 * this method will cycle through a list of nounphrases and if it has a reference
	 * or Id the reference will be written to the file.
	 * @param filePrefix the filename without the .crf tag
	 * @param dir the directory to place the file
	 * @param list the list of candidates(which contain all coreferences)
	 */
	public static void printMatchesToFile(String filePrefix, String dir, ArrayList<NounPhrase> list){

		//Print out results
		String outFile = dir + filePrefix + ".response";
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
			bw.write("<TXT>");
			String res = "";
			for(NounPhrase n : list)
			{
				if(n.getId() != null)
				{

					if(n.getRef() != null)
						res = "<COREF ID=\"" + n.getId() + "\" REF=\"" + n.getRef() + "\"> " + n.getPhrase() + "</COREF>";
					else
						res = "<COREF ID=\"" + n.getId() + "\"> " + n.getPhrase() + "</COREF> ";
					bw.write(res, 0, res.length());
				}	

			}
			bw.write("</TXT>");
			bw.close();
		} catch (Exception e) {
			System.err.println("Problems writing results.");
			e.printStackTrace();
		}

		//System.out.println("");

		for(int i = 0; i < list.size(); i ++){
			String outString = "";
			NounPhrase temp = list.get(i);
			if(temp.getId() != null){
				outString += "<COREF ID=\"" + temp.getId();
				if(temp.getRef() != null)
					outString += "\" REF=\"" + temp.getRef();
				outString += "\">" + temp.getPhrase()+"</COREF>";
			}
			//if(!outString.equals(""))
				//System.out.println(outString);

		}

		//System.out.println("");
	}

}