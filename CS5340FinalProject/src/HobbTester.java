import java.io.File;
import java.util.HashMap;





public class HobbTester {
	
	/**
	 * Tests the Hobb Class
	 * @param args
	 */
	public static void main(String[] args) {
		Hobb h = new Hobb();
		/**
		 * Henry had twelve wives.  He was a very unhappy man.
		 */
		NounPhrase cof = new NounPhrase("He", "A");
		cof.setPlural(false);
		cof.setPronoun(true, "He");
		cof.setGender(NounPhrase.Gender.MALE);
		
		NounPhrase onp = new NounPhrase("Henry", "");
		onp.setPlural(false);
		onp.setPronoun(false, null);
		onp.setGender(NounPhrase.Gender.MALE);
		
		NounPhrase oonp = new NounPhrase("twelve wives", "");
		oonp.setPlural(true);
		oonp.setPronoun(false, null);
		oonp.setGender(NounPhrase.Gender.FEMALE);
		
		String cxt = "Henry had twelve wives. He";
		
		HashMap<String, NounPhrase> nphm = new HashMap<String, NounPhrase>();
		nphm.put(cof.getPhrase(), cof);
		nphm.put(onp.getPhrase(), onp);
		nphm.put(oonp.getPhrase(), oonp);
		
		h.runHobbs(cof, cxt, nphm);
		
		for(String s : nphm.keySet())
		{
			System.out.println(nphm.get(s).getPhrase() + "  " + nphm.get(s).getId());
		}

		
	}

}
