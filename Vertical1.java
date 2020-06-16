/*
 * CS210 Chapter 3 Exercise 18 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/17 - winter quarter
 *
 * This program creates a method vertical with a string parameter. The string
 * is then printed downwards by using the different methods of the String object. 
 */
public class Vertical1 {
	
	public static void main(String[] args) {
		vertical("hey now"); // Calls the method with the string parameter
	}
	public static void vertical(String word) { // Creates the method vertical with String as its parameter
		for (int i = 0; i <= word.length()-1; i++) // For loop loops from i = 0  to i equal to the length of the word -1
			System.out.println(word.charAt(i)); // This line prints the letter at index i
	}
}

