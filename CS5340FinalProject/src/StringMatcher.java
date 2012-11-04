import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class StringMatcher {
	ArrayList<NounPhrase> list;
	NounPhrase coref;
	int idIndex;
	
	public StringMatcher(){
		list = null;
		this.coref = null;
		idIndex = 1;
	}
	
	
	public int matchNE(int crIndex){
		
		NounPhrase candidate = list.get(crIndex);
		ArrayList<NounPhrase.NamedEntity> candNEList = candidate.getNE();
		ArrayList<NounPhrase.NamedEntity> corefNEList = coref.getNE();
		if(!candNEList.isEmpty() && !corefNEList.isEmpty()){
			if(candNEList.size() == corefNEList.size())
				for(NounPhrase.NamedEntity ce: candNEList){
					for(NounPhrase.NamedEntity cre: corefNEList){
						if(ce.phrase.equals(cre.phrase) && ce.classification == cre.classification){
									return 1;
						}
					}
				}
		}
		return 0;
	}
	public int fullStringMatchHeads(int crIndex){
		String candHead = list.get(crIndex).getHeadPhrase();
		String corefHead = coref.getHeadPhrase();
		if(candHead.equals(corefHead))
			return 1;
		return 0;
	}
	
	public int createScores(){
		int bestIndex = -1;
		int bestScore = 0;
		for(int i = list.size()-1; i > -1; i--){
			int score = 0;
			score = fullStringMatchHeads(i);
			score += matchNE(i);
			if(score > bestScore){
				bestIndex = i;
				bestScore = score;
			}
		}
		if(bestScore > 0){
			System.out.println(coref.getPhrase() + " ID=" + coref.getId());
			NounPhrase winner = list.get(bestIndex);
			System.out.println(winner.getPhrase() + (winner.getId() != null ? (" ID=" + winner.getId()) : ""));
			return bestIndex;
		}
		return -1;
	}


	public void CreateMatch(int matchId) {
		//check to see if matched item is a previous coref
		
		NounPhrase match = list.get(matchId);
		if(match.getPhrase().contains("Eastern Airlines"))
			System.out.println("bob");
		if(list.get(matchId).getId() == null){
			//not coref
			//set ID
			String ref = "X" + idIndex++;
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
	
	public void printMatchesToFile(String filePrefix, String dir){
		
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
		
		System.out.println("");
		
		for(int i = 0; i < list.size(); i ++){
			String outString = "";
			NounPhrase temp = list.get(i);
			if(temp.getId() != null){
				outString += "<COREF ID=\"" + temp.getId();
				if(temp.getRef() != null)
					outString += "\" REF=\"" + temp.getRef();
				outString += "\">" + temp.getPhrase()+"</COREF>";
			}
			if(!outString.equals(""))
				System.out.println(outString);
			
		}
		
		System.out.println("");
	}


	public void setList(ArrayList<NounPhrase> npList) {
		list = npList;
		
	}


	public void setCoref(NounPhrase phrase) {
		coref = phrase;
		
	}


	public void resetIdCounter() {
		idIndex =1;
		
	}
}
