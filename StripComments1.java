/*
 * CS210 Chapter 6 Exercise 13 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/02/14 - winter quarter
 *
 * This program reads a .txt file that has a java code in it. The program removes all the comments in the code.
 */
import java.util.*;
import java.io.*;

public class StripComments1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("C:/Users/wilbe/Desktop/txtfiles/strip comments.txt")); // Scanner and File constructor
		stripComments(input); //Method Call

		
	}
	public static void stripComments(Scanner input) throws FileNotFoundException {
		while (input.hasNextLine()) { // Makes sure that there is a next line in the text.
			String text = input.nextLine(); // Declaration and initiation of the variable text with the file as input.
			int start = text.indexOf("/*"); // Assigns the index of "/*" to a variable start
			int end = text.indexOf("*/"); // Assigns the index of "/*" to a variable end
			int doubleSlashStart = text.indexOf("//"); // Assigns the index of "//" to a variable doubleSlashStart
			String starSlashEdit = ""; // Declares a string variable
			String doubleSlashEdit = ""; // Declares a string variable
			
			if (doubleSlashStart != -1 || text.indexOf("/*") != -1 || text.indexOf("*/") != -1 ) { // If a comment exists, go to this if statement
				if (doubleSlashStart != -1) { // If the "//" is in the text, replace the "//" with an empty string
					doubleSlashEdit =text.replace(text.substring(doubleSlashStart), "");
				}else { //copy text to doubleSlashEdit variable
					doubleSlashEdit = text;
				}
			}
			if (start != -1 || end != -1 ) { // If there is a slash star type of comment, do these statements.
				if (end == -1) { // If there is no ending comment symbol, replace string from start to end
					starSlashEdit = doubleSlashEdit.replace(text.substring(start), "");
				}else if(start == -1) {// If there is no starting comment symbol, replace string from start of line to end
					starSlashEdit = doubleSlashEdit.replace(text.substring(0,end+2), "");
				}else if (start != -1 && end != -1 ) { // If both are present, change the whole comment into an empty string
					starSlashEdit = doubleSlashEdit.replace(text.substring(start,end+2), "");
				}
			}else {
					starSlashEdit = doubleSlashEdit; // If none apply, doubleSlashEdit becomes starSlashEdit
			}
			System.out.print(starSlashEdit); // Print the line
			if (text.indexOf("/*") == -1 && text.indexOf("*/") == -1 && doubleSlashStart == -1) { // If there is nothing to change, just print the line
				System.out.print(text);	
			}
			System.out.println(); // Put a space afterwards
		}
		
	}
}
