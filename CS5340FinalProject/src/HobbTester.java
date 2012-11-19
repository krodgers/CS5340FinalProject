import java.io.File;


public class HobbTester {

	/**
	 * Tests the Hobb Class
	 * @param args
	 */
	public static void main(String[] args) {
		Hobb h = new Hobb();
		File input = new File("HobbsTestFile.txt");
	//	h.runHobbs("it", "The castle in Camelot remained the residence of the king until 536 when he moved it to London.");

		String per = parserUtil.parseVerbs("  Neither Mr. Ferris nor the board of directors has any desire to break the pilots' union. ");
		System.out.println("Result: " + per);
	}

}
