/*
 * CS210 Chapter 3 Exercise 19 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/17 - winter quarter
 *
 * This program creates the method printReverse with a string parameter. The method prints the string
 * backwards.  
 */

public class PrintReverse1 {

	public static void main(String[] args) {
		printReverse("hello there!"); // Calls the method with string parameters
	}
	public static void printReverse(String word) {
		for (int i = word.length()-1; i >= 0; i--) // For loop that counts down from the length of the word -1  to index 0
			System.out.print(word.charAt(i)); // This prints out the character at count i. 
	}

}
