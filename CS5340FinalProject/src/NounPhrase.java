import java.util.ArrayList;

public class NounPhrase {
	
	public enum Classification { NONE, PERSON, ORGANIZATION, LOCATION };
	public enum Gender {NONE, MALE, FEMALE};
	private String id;  // from <Coref id = ""
	//private String phrase; // <Coref > phrase </Coref>
	private String ref; // from <Coref ref = ""
	private Classification classification;  // NER classification
	private Gender gender;
	private Boolean plural;
	private int sentenceID;
	private ArrayList<String> posTags;
	private ArrayList<String> phrase;
	ArrayList<NamedEntity> namedEntities;
	
	
	public NounPhrase() {
		phrase = new ArrayList<String>();
		posTags = new ArrayList<String>();
		id = null;
		ref = null;
		classification = Classification.NONE;
		 gender  = Gender.NONE;
		 plural = null;
		 namedEntities = new ArrayList<NamedEntity>(5);
	}
//	public NounPhrase(String content, String ID) {
//		phrase.;
//		id = ID;
//		ref = null;
//		classification = Classification.NONE;
//		 gender  = Gender.NONE;
//		 plural = null;
//		 namedEntities = new ArrayList<NamedEntity>(5);
//	}
	
	public NounPhrase(String content, int sentID){
		this();
		sentenceID = sentID;		
	}
	
	public ArrayList<String> getPhrase(){
		return phrase;
	}
	
	public void addToPhrase(String phraseTok, String posTag){
		posTags.add(posTag);
		phrase.add(phraseTok);		
	}

	public void addNamedEntity(String entityPhrase, Classification organization) {
		namedEntities.add(new NamedEntity(entityPhrase, organization));
		
	}
	
	class NamedEntity{
		String phrase;
		Classification classification;
		NamedEntity(String phrase, Classification classif){
			this.phrase = phrase;
			classification = classif;
		}
	}

	/**
	 * Returns this NP's id
	 * 
	 */
	public String getId() {
		
		return this.id;
	}
	/**
	 * Returns this NP's ref
	 * 
	 */
	public String getRef() {
		
		return this.ref;
	}

	/**
	 * Implemented so as to be able to locate phrases in a list
	 */
	@Override
	public boolean equals(Object obj) {
		NounPhrase other = (NounPhrase) obj;
		return this.phrase.equals(other.phrase) /*&& this.id.equals(other.id)*/;
	}
	
}
