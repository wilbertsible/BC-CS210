/*
 * CS210 Chapter 6 Exercise 7
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/07 - winter quarter
 *
 * This program reads the file "flip lines.txt" and switches the order of every two lines.
 */

import java.util.*; // Import Scanner
import java.io.*;//Import File
public class FlipLines1 {

	public static void main(String[] args) throws FileNotFoundException {
		flipLines(); // Call method
	}
	public static void flipLines() throws FileNotFoundException{
		Scanner input = new Scanner(new File("C:/Users/wilbe/Desktop/flip lines.txt")); // Scanner and File constructor
		while (input.hasNextLine()) { //Handles error in the end of the file when there is no more token left to import
			String firstLine = input.nextLine(); // Assigns first line to the String variable firstLine
			if (input.hasNextLine()) { //If statement to check if the program has a second line
				String secondLine = input.nextLine(); // Assigns second line to the String variable secondLine
				System.out.println(secondLine); // prints out second line
			}
			
			System.out.println(firstLine); // Prints out first line
		}
	}
}
