/*
 * CS210 Chapter 3 Exercise 4 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/15 - winter quarter
 *
 * This program uses the method printSquare to print out a table of numbers defined by the parameters in the method. 
 * Given the parameters min and max, the line will count from min to max. The next line will then add 1 to the min number
 * and count up to the maximum number, then resetting to the minimum number until it reaches the 1 number away from the first
 * number in that line. This goes on until the first number in the last line is the max.
 */

public class PrintSquare {

	public static void main(String[] args) {
		printSquare(2,9); // Method with parameters defined by the minimum number and the maximum number.
	}

	public static void printSquare(int min, int max) {
		for (int i = min; i <= max; i++) { // Prints out the number of lines.
			for (int j = i ; j <= max;j++) { // Prints out the first half of the set, from i to max
				System.out.print(j); // Prints the number
			}
			for (int k=min; k<=i-1; k++) { // Prints out from the minimum to first number in the line - 1
				System.out.print(k); // Prints the number
			}
		System.out.println(); // Introduces a new line
			
		}
	}
}
