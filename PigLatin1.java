/*
 * CS210 Chapter 5 Programming Project 1 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/02/08 - winter quarter
 *
 * This program translates a user input string into "Pig Latin". To translate into Pig Latin, if the first letter of the word is a consonant,
 * the initial consonant sound is dropped from the word and moved to the end, adding an "ay" to it. If the word starts with a vowel, the word is kept,
 * and "ay" is added in the ending. 
 */
import java.util.*; // Importing packages
public class PigLatin1 {

	public static void main(String[] args) {
		System.out.println("Enter phrase: "); //User prompt
		pigLatin(); // Calls Method
	}
	public static void pigLatin() {
		Scanner console = new Scanner(System.in); //Scanner constructor
		String phrase = console.nextLine() + " "; //Accepts user input, adds a whitespace at the end of the prompt, and assign it to the variable phrase
		int spaceIndex = phrase.indexOf(" "); //Looks for the index of the whitespaces in the phrase
		String word = ""; //Declares the variable word, and assigns an empty string to it.
		
		/* In this while statement, the condition is that spaceIndex is not equal to -1. When the method indexOf() is used, when the char is not present,
		 * the method will give a default variable of -1. A whitespace was added to the variable phrase above to pass the while statement one extra time for
		 * the last word. If the extra whitespace is not there, the program will run 1 word short due to the condition passed in the while loop.
		 * 
		 */
		while (spaceIndex != -1) {
			int firstLetterIndex = 0; // Declares and initializes a variable firstLetterIndex
			word  = phrase.substring(firstLetterIndex, spaceIndex); // Separates a word from the rest of the phrase.
			phrase = phrase.substring(spaceIndex + 1, phrase.length()); // Separate what is left of the phrase and reassign it to the variable phrase
			spaceIndex = phrase.indexOf(" "); // Update the value of spaceIndex to the next whitespace in the new phrase
			char firstChar = word.charAt(0); // Looks at the first character in word
			if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u'
					|| firstChar == 'A' || firstChar == 'E' || firstChar == 'I' || firstChar == 'O' || firstChar == 'U') { 
				//If the first letter is a vowel, print the word +"ay". Also both uppercase and lowercase are used.
				System.out.print(word + "-ay ");
			}else { 
				int consonantCount = 0; // Counts how many consonants before the first vowel
				String cat = ""; //Declaration and initialization of the variable cat for concatenation of String.
				while (word.charAt(consonantCount) != 'a' && word.charAt(consonantCount) != 'e' && word.charAt(consonantCount) != 'i' 
						&& word.charAt(consonantCount) != 'o' && word.charAt(consonantCount) != 'u' && word.charAt(consonantCount) != 'y') {
					// While the character in number consonantCount is a consonant, concatenate the character to the variable cat
					cat = cat +word.charAt(consonantCount); // variable cat becomes the old cat value + the new character
					consonantCount++; // Add 1 to the consonantCount value.
				}
				System.out.print(word.substring(consonantCount,word.length()) + "-" + cat + "ay "); // Prints the final result when the word starts with a consonant
			}
		
		}	
		
	}
}
