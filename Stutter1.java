/*
 * CS210 Chapter 4 Exercise 17
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/24 - winter quarter
 *
 * This program uses the method stutter to repeat each letter in a String parameter. 
 */

public class Stutter1 {

	public static void main(String[] args) {
		System.out.println(stutter("Hello!")); // Calls the method with a given parameter
	}
	public static String stutter(String word) {
		String twice = ""; // Creates an empty string that can be concatenated with char
		for (int i =0; i < word.length(); i++) { // For loop that repeats for each letter in the word parameter
			twice += word.charAt(i); // Adds the letter in index i into the twice string
			twice += word.charAt(i); // Adds the letter for a second time into the string.
		}
		return twice; // returns the final string
	}
}
