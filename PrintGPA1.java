/*
 * CS210 Chapter 4 Exercise 10 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/23 - winter quarter
 *
 * This program obtains the user input to obtain the name of the student, how many grades they are going to input, and the grades.
 */

import java.util.Scanner; // Imports the Scanner 
public class PrintGPA1 {

	public static void main(String[] args) {
		Scanner console = new Scanner (System.in); // Constructs the Scanner
		printGPA(console); // Calls the method
	}
	public static void printGPA (Scanner console) {
		System.out.println("Enter a student record: "); // Prompts user input
		String name = console.next(); // User input
		int size = console.nextInt();// user input
		double grade = 0.0; // Initializes and declares the grade to zero
		for (int i = 1; i <=size; i++) {
			int score = console.nextInt(); // Adds the input
			grade  += score; // cumulative sum
		}
		System.out.printf(name + "'s grade is " + grade/size);	// Prints output
		
	}
}
