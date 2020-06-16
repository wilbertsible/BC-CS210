/*
 * CS210 Chapter 6 Exercise 2 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/02/12 - winter quarter
 *
 * This program reads the integers from a .txt file and counts how many numbers, how many even numbers, the sum of the numbers, and the percentage of even
 * numbers in the program. 
 */


import java.util.*; // Import Scanner
import java.io.*;	//Import File

public class EvenNumbers1 {

	public static void main(String[] args) throws FileNotFoundException {
		evenNumbers(); //Method call
	}
	public static void evenNumbers() throws FileNotFoundException {
		Scanner input = new Scanner(new File("src/even numbers.txt")); // Imports the even numbers.txt file.
		int counter = 0, sum = 0, evenCount = 0; //Declares and initializes the variables
		while (input.hasNextInt()) { //Handles error in the end of the file when there is no more token left to import
			int number = input.nextInt(); // Reads tokens and assigns it to the variable numbers
			counter++; // Add 1 to counter
			if (number%2 == 0) { // Checks whether the number is even
				evenCount++; // Adds 1 if the number is even
			}
			sum += number; // Cumulative sum of the numbers
		}
		double percent = (double)evenCount/ (double)counter * 100; // Casting the int variables into doubles to obtain percentage
		
		System.out.printf("%d numbers, sum = %d\n%d evens (%.2f%%)", counter, sum, evenCount, percent); // Prints the numbers with percent rounded to the nearest hundredth
	}

}
