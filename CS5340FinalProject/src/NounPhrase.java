import java.util.ArrayList;

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
	ArrayList<NamedEntity> namedEntities;
	
	
	public NounPhrase(String content) {
		phrase = content;
		id = null;
		ref = null;
		classification = Classification.NONE;
		 gender  = Gender.NONE;
		 plural = null;
		 namedEntities = new ArrayList<NamedEntity>(5);
	}
	public NounPhrase(String content, String ID) {
		phrase = content;
		id = ID;
		ref = null;
		classification = Classification.NONE;
		 gender  = Gender.NONE;
		 plural = null;
		 namedEntities = new ArrayList<NamedEntity>(5);
	}
	
	public NounPhrase(String content, int sentID){
		this(content);
		sentenceID = sentID;		
	}
	
	public String getPhrase(){
		return phrase;
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
