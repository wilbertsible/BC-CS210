/*
 * CS210 Chapter 5 Exercise 24 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/02/07 - winter quarter
 *
 * This program check a string if it only consists of vowels. The method returns a boolean expression.  
 */

public class IsAllVowels1 {

	public static void main(String[] args) {
		System.out.println(isAllVowels("aioueoui")); // Calls the method and prints the return statement
	}
	
	public static boolean isAllVowels(String word) {
		word = word.toLowerCase(); //Converts the string to lower case
		for (int i = 0; i <= word.length()-1; i++) { //For loop that checks each letter of the string
			char letter = word.charAt(i); // Letter variable that isolates the letter at index i
			if (letter != 'a' && letter != 'e' && letter != 'i' && letter != 'o' && letter != 'u') { // If condition that tests whether the letter is a vowel
				return false; // Returns false if char at i is a consonant
			}
		}
		return true; // Returns true if String is all made up of vowels
	}
}
