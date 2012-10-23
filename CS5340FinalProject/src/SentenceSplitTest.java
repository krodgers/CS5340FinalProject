import java.io.File;
import java.util.ArrayList;

public class SentenceSplitTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PreProcessing processTest = new PreProcessing();
		ArrayList<String[]> paragraphs = new ArrayList<String[]>();
		processTest.paragraphSplitterFileWriter(new File("3.txt"));
		processTest.tokenize();
		processTest.posTag();
		paragraphs = processTest.fuseTagsForFunAndProfit();

	}

}
