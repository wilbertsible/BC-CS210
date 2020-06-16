/*
 * CS210 Chapter 4 Exercise 21 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/24 - winter quarter
 *
 * This program prints out the perfect numbers within a certain parameter. A perfect number is a number that is equal to
 * the sum of its proper factors. 
 */

public class PerfectNumbers1 {
	public static void main(String[] args) {
		perfectNumbers(500); // Calls out the method with an integer as parameter
	}
	public static void perfectNumbers (int number) {
		System.out.print("Perfect numbers up to " + number + ": "); //Prints out the statement
		for (int i =1; i<=number; i++) { // Counts from one to the parameter
			int factorSum = 0; // Initializes the sum of the factors as cumulative sum
			for (int j = 1; j<i; j++) { // Counts from 1 to 1
				if (i%j == 0) { // If statement that checks whether the number is a proper factor (meaning mod is 0)
					factorSum += j; // Cumulative sum of the factors
				}
			}
			if (factorSum == i) { // Checks whether the sum of the factors is equal to the number being checked in that for loop
				System.out.print(factorSum + " "); // Prints the sum of factors (which is also the perfect number) if the condition is satisfied.
			}
		}
	}
}
