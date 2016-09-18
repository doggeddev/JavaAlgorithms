/* Used to test the Anagram class*/

public class AnagramTester {

	public static void main(String[] args) {
		//TODO add more detailed testing
		
		
		Anagram isAnagram = new Anagram("user", "sure");
		
		Anagram isAnagram1 = new Anagram("user", "surer");
		
		System.out.println(isAnagram.checkAnagram());
		System.out.println(isAnagram1.checkAnagram());
	}

}
