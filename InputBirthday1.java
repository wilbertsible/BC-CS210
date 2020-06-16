/*
 * CS210 Chapter 3 Exercise 20 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/18 - winter quarter
 *
 * This program uses the Scanner class to obtain console input as parameters and concatenates the input inside a string.
 */
import java.util.Scanner; // This inputs the Scanner class from the java.util library

public class InputBirthday1 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);// Scanner constructor
		
		System.out.print("On what day of the month were you born? "); //Prompt
		int day = console.nextInt(); //Variable declaration and assignment
		System.out.print("What is the name of the month in which you were born? " ); //Prompt
		String month = console.next(); //Variable declaration and assignment
		System.out.print("During what year were you born? "); //Prompt
		int year = console.nextInt(); //Variable declaration and assignment
		
		inputBirthday(day, month, year); //Method call with three parameters
	}
	public static void inputBirthday(int day, String month, int year) {
		// Prints statements with the parameters concateneted inside the string
		System.out.println("You were born on " + month + " " + day + ", " + year + ". You're mighty old!"); 
	}
}
