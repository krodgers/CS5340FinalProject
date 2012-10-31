import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.util.StringTokenizer;


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
		int x = 1;
		//String fileName = x + ".crf";
		String fileName = "HobbsTestFile.txt";
		String document = "";
		String[] corefSplit;
		StringReader sr;
		File input = new File(fileName);
		try {
			BufferedReader bf = new BufferedReader(new FileReader(input));
			String line;
			while((line = bf.readLine()) != null)
			{
				document += line;
			}
			//Split on <COREF ..... COREF/>
			corefSplit = document.split("</COREF>");
			sr = new StringReader(document);
			int j=0;
			for(int i = 0; i < Array.getLength(corefSplit); i++)
			{
				System.out.println(corefSplit[i] + "\n");
				System.out.println("Length of string: " + (j = corefSplit[i].length()));
				sr.skip(j+8);
				sr.mark(0);
				for(int k = 0; k < 10; k++)
				{
					int s = sr.read();
					System.out.print((char)s);
				}
				sr.reset();
				System.out.println();
			}
			
			
			System.out.println();
		} catch (Exception e) {
			System.err.println("Filed reading input file");
			e.printStackTrace();
			return;
		}
		
		
		
		//Iterate over the splitArray:
		for(int i = 0; i < Array.getLength(corefSplit); i++)
		{
			String currChunk = corefSplit[i];
			int startIdx = currChunk.indexOf(">");
			String currentCoref = currChunk.substring(startIdx);
			//Preprocess
			//Find the index of <COREF> --> Sentence Splitter --> Parse/POS/Tokenize/etc all sentences
			try {
				sr.skip(currChunk.length()-startIdx);
				sr.mark(0);
				
			} catch (Exception e) {
				System.err.println("Problems with String Reader");
				e.printStackTrace();
			}
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
			
		}
			
		//Print out results

	}

}
