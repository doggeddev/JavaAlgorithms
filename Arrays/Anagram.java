import java.util.Arrays;

/**
 * 
 */

/**
 * @author Richard Drexel
 * 
 * <p>Returns a boolean indicating whether two Strings being compared
 * are anagrams. A true value is returned if both Strings passed into
 * the constructor have the exact same letters. String length is limited
 * to 256 characters per String.</p>
 * 
 * @param a A word that is used for comparison against
 * @param b A second word that is being compared to the first
 * @return A boolean value indicating whether two words are an anagram
 * 
 */

//TODO add error handling
//TODO remove whitespace from strings

public class Anagram {
	
	private String anagram1 = null;
	private String anagram2 = null;
		
	
	public Anagram(String a, String b) {
		this.anagram1 = a;
		this.anagram2 = b;
	}

	public boolean checkAnagram(){
		
		if(this.anagram1 != null && this.anagram2 != null){
				char[] sortedA = new char[256];
				char[] sortedB = new char[256];
				
				sortedA = stringToArray(anagram1);
				sortedB = stringToArray(anagram2);
				
				return isAnagram(sortedA, sortedB);
				
			}
			return false;
		}
	
	
	
	
	private char[] stringToArray(String a){
		char[] strToCharArray;
		
		strToCharArray = a.toCharArray();
		Arrays.sort(strToCharArray);
				
		return strToCharArray;
	}
	
		
	private boolean isAnagram(char[] a, char[] b){
		
		if(Arrays.equals(a, b)){
			return true;
		}		
		
		return false;
				
	}
	public String getAnagram1() {
		return anagram1;
	}


	public String getAnagram2() {
		return anagram2;
	}

	
}
