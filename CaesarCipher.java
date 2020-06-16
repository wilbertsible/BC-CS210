/* 
 * CS210 Chapter 4 Programming Project 8
 * Wilbert Lim Sible
 * wilbert.sible@bellevue.edu
 * 2018/01/26 - winter quarter
 *
 * This program creates a Caesar Cipher where the encoding key can be set. The program will give an encoded message
 * given a phrase and a key to rotate the letters.
 * 
 */

import java.util.Scanner;
public class CaesarCipher {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in); // Scanner constructor
		System.out.print("Your message? ");// Prompt
		String phrase = console.nextLine();//Asks for the phrase
		System.out.print("Encoding key? "); // Prompt
		int key = console.nextInt(); // Asks for the encoding key
		System.out.print("Your message: "); //Prompt
		String p = phrase.toUpperCase(); // Changes the phrase to upper case
		for (int i = 0; i<phrase.length(); i++) { // For loop that cycles through the letters in the phrase
			char ch = p.charAt(i);  // Looks at the character at index i
			if (ch == ' ') { // If character is space, print space
				System.out.print(' ');
			}else if (ch + key > 'Z') { // If character + key is beyond z, start back at A
				System.out.print((char)(33 + ( ch + key-59))); // 34 is 'A' subtract 1. Add the difference between the sum of key and character with 59 which is 'Z'. Then cast it to char.
			}else { // If none of the two former statements apply, do the cipher normally
				System.out.print((char)(ch + key)); // add the cipher to the key and cat to char
			}
		}	
	}
	
}
