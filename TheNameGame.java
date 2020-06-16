/*
 * CS210 Chapter 3 Exercise 22 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/07 - winter quarter
 *
 * This program prints the lyrics to "The Name Game" using a user generated name. The Scanner object is used to obtain the 
 * console input. The different methods of the String object were used to change the words in the song. 
 */

import java.util.Scanner; // This inputs the Scanner class from the java.util library


public class TheNameGame {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in); // Scanner constructor
		
		System.out.print("What is your name? "); // Printing the prompt
		String name = console.nextLine(); // Declaring a variable and assigning the Scanner to it
		System.out.println();
		int space = name.indexOf(" "); // Looks for the space, which is in between the first and last name
		String firstname = name.substring(0, space); //Declares a variable and assigns the first name to the variable
		String lastname = name.substring(space + 1); // Declares a variable and assigns the last name to the variable
		song(firstname); // Calling the method to print the song with the first name as parameter
		song(lastname); // Calling the method to print the song with the last name as parameter
	}
	public static void song(String name) {
		
		System.out.println(name + " " + name + ", bo-"+ name.replace(name.substring(0, 1), "B")); //Prints the name parameter and replaces the name's first letter with B
		System.out.println("Banana-fana fo-"+name.replace(name.substring(0, 1), "F")); // Replaces the name's first letter with F
		System.out.println("Fee-fi-mo-" + name.replace(name.substring(0, 1), "M")); // Replaces the name's first letter with M
		System.out.println(name.toUpperCase() + "!"); //Prints the name and converts all letters to upper case
		System.out.println();
		
	}
}
