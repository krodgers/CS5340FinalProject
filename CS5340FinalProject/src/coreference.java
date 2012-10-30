
public class coreference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
		/**
		 * VARIABLES
		 * Lists corefs --> resolved/ not
		 * List NP
		 * Temp buffer --> stuff to process
		 * List Sentences
		 * current label to give
		 * 
		 */
		//Read in the file as one big huge string
		//Split on <COREF ..... COREF/>
		
		//Iterate over the splitArray:
			//Preprocess
				//Find the index of <COREF> --> Sentence Splitter --> Parse/POS/Tokenize/etc all sentences
					//Should return/end/result in list of NP candidates w/ features filled out
				//Proceed to match
			//String matching
				/**
				 * Only needs list of NPs
				 * 
				 */
				// Match Proper Nouns
				// Match Head Nouns
				// Match Full/Partial String
			//Add Sentence if not already there
			//Hobbs
				/**
				 * Requires a full parse
				 * Good for pronoun resolution
				 * 
				 */
			//Feature Scoring
				//Matching unmatched corefs to previous NP based on how closely features match (gender,number,person,semantics)
			
			
			
		//Print out results

	}

}
