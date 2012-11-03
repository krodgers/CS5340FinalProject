import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
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
		ArrayList<String[]> sentences = new ArrayList<String[]>();
		PreProcessing processor = new PreProcessing();
		//Read in Arguments
		if(args.length != 2)
		{
			System.out.println("Usage: coreference <listfile> <responsedir>");
			return;
		}
		String listFileName = args[0];  // list of files to process; FOR DEBUGGING USE listFile.txt
		String dir = args[1];	// directory where to store response files; assumes the final / is included
		ArrayList<String> testFiles = getTestFiles(listFileName);

		for(String fileName : testFiles)
		{
			//Read in the file as one big huge string
			String filePrefix = fileName.substring(fileName.lastIndexOf("/")+1, fileName.length()-4); 
			
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
				bf.close();
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



			/**
			 * remove <TXT> </TXT> tags
			 */
			String replacement = corefSplit[0];
			if(replacement.contains("<TXT>")){
				replacement = replacement.substring(replacement.indexOf(">")+1).trim();
				corefSplit[0] = replacement;
			}
			replacement = corefSplit[corefSplit.length-1];
			if(replacement.contains("</TXT>")){
				replacement = replacement.substring(0, replacement.lastIndexOf("</"));
				corefSplit[corefSplit.length-1] = replacement;
			}

			//Iterate over the splitArray:
			/**
			 * This part is experimental.  
			 */
			for(int i = 0; i < Array.getLength(corefSplit); i++)
			{
				String currChunk = corefSplit[i];
				if(!currChunk.contains("<COREF ID="))
					continue;
				int startIdx = currChunk.indexOf(">");
				//String currentCoref = currChunk.substring(startIdx);
				//preserve coref Id
				int idIndex = currChunk.indexOf("ID=\"")+4;
				String idNum = currChunk.substring(idIndex, currChunk.indexOf('"', idIndex));
				String currentCoref = currChunk.substring(startIdx);
				//preprocess
				currChunk = currChunk.substring(0, currChunk.indexOf("<COREF")).trim();
				
				//split sentences
				ArrayList<String> tempArr = processor.splitSentences(currChunk);
				for(String s: tempArr){
				//tokenize
					String[] currChunkarr = processor.tokenize(currChunk);
					sentences.add(currChunkarr);
				}
				//parse
				
				//Find the index of <COREF> --> Sentence Splitter --> Parse/POS/Tokenize/etc all sentences
				try {
					sr.skip(currChunk.length());
					sr.mark(0); //marks where the next chunk should start

				} catch (Exception e) {
					System.err.println("Problems with String Reader");
					e.printStackTrace();
				}
				
				ArrayList<NounPhrase> NPList = new ArrayList<NounPhrase>();
				/**
				 * 
				 */
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
				 * Requires a full parse BUT CAN BE MODIFIED TO USE SHALLOW PARSE!
				 * Good for pronoun resolution
				 * 
				 */
				//Feature Scoring
				//Matching unmatched corefs to previous NP based on how closely features match (gender,number,person,semantics)


				//Print out results
				String outFile = dir + filePrefix + ".response";
				try {
					BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
					String res;
					for(NounPhrase n : NPList )
					{
						if(!n.getId().isEmpty())
						{
							if(!n.getRef().isEmpty())
								res = "<COREF ID = \"" + n.getId() + "\" REF = \"" + n.getRef() + "\"> " + n.getPhrase() + "</COREF> ";
							else
								res = "<COREF ID = \"" + n.getId() + "\"> " + n.getPhrase() + "</COREF> ";
							bw.write(res, 0, res.length());
						}	
					}
				} catch (Exception e) {
					System.err.println("Problems writing results.");
					e.printStackTrace();
				}
			}
			System.out.println("");
			for(String s: sentences){
				System.out.println(s);
			}
			System.out.println("");
		
		}	

	}

	/**
	 * Gets a list of the files to be processed
	 * @param listFileName
	 * @return
	 */
	private static ArrayList<String> getTestFiles(String listFileName) {

		ArrayList<String> files = new ArrayList<String>();
		try {
			BufferedReader bf = new BufferedReader(new FileReader(new File(listFileName)));
			String line;
			while((line = bf.readLine()) != null)
			{
				files.add(line);
			}
		} catch (Exception e) {
			System.err.println("Problems reading in testfile");
			e.printStackTrace();
		}
		return files;

	}
	
	

}
