import java.io.File;
import java.util.ArrayList;

public class SentenceSplitTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PreProcessing processTest = new PreProcessing();
		
		File inputFile = new File("RawInput/3.crf");
		processTest.stripXML(inputFile);
		
		
		ArrayList<String[]> paragraphs = new ArrayList<String[]>();
		processTest.paragraphSplitterFileWriter(new File("tempXML.txt"));
		processTest.tokenize();
		processTest.posTag();
		processTest.partialParse();
		processTest.NERNouns();
		//paragraphs = processTest.fuseTagsForFunAndProfit();//possibly use for full parsing
	}

}
