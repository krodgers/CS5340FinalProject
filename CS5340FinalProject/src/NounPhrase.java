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
	private boolean containsPronoun;
	private ArrayList<String> posTags;
	private ArrayList<String> phrase;
	private ArrayList<NamedEntity> namedEntities;
	private String headPhrase;
	
	
	public NounPhrase() {
		headPhrase = null;
		containsPronoun = false;
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
	
	public String getPhrase(){
		if(phrase.size()>0){
			String returnPhrase = phrase.get(0);
			for(int i = 1; i < phrase.size(); i++){
				returnPhrase += " " + phrase.get(i);
			}
			
			return returnPhrase.trim();
		}
		return null;
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

	public void addHeadPhrase(String headPhrase) {
		this.headPhrase = headPhrase.trim();
		
	}
	public String getHeadPhrase(){
		return headPhrase;
	}
	/**
	 * returns the arrayList of this NounPhrase's pos Tags
	 * @return
	 */
	public ArrayList<String> getPosTags(){
		return posTags;
	}
	
	public void setPronoun(Boolean isPronoun){
		containsPronoun = isPronoun;
	}
	public void setPlural(Boolean isPlural){
		plural = isPlural;
	}
	public int getHeadPhraseIndex(){
		if(headPhrase != null)
			for(int i = 0; i < phrase.size(); i++){
				if(phrase.get(i).equals(headPhrase))
					return i;
		}
		return -1;
	}
	
}
