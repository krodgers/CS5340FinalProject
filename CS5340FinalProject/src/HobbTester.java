import java.io.File;


public class HobbTester {

	/**
	 * Tests the Hobb Class
	 * @param args
	 */
	public static void main(String[] args) {
		Hobb h = new Hobb();
		File input = new File("HobbsTestFile.txt");
		h.fullParseStanford(input);

	}

}
