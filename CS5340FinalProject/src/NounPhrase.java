
public class NounPhrase {
	
	public enum Classification { NONE, PERSON, ORGANIZATION, LOCATION };
	public enum Gender {NONE, MALE, FEMALE};
	private String id;  // from <Coref id = ""
	private String phrase; // <Coref > phrase </Coref>
	private String ref; // from <Coref ref = ""
	private Classification classification;  // NER classification
	private Gender gender;
	private Boolean plural;
	private int sentenceID;
	
	
	public NounPhrase(String content) {
		phrase = content;
		id = null;
		ref = null;
		classification = Classification.NONE;
		 gender  = Gender.NONE;
		 plural = null;
	}
	
	public NounPhrase(String content, int sentID){
		this(content);
		sentenceID = sentID;		
	}
}
