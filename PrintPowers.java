/*
 * CS210 Chapter 3 Exercise 3 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/15 - winter quarter
 *
 * This program prints out a user-defined number of powers for a given base. The program uses parameters to enter
 * the base and the exponent into the method by using the method printPowersOfN(base, exponent). Some examples were\
 * given below.
 */

public class PrintPowers {

	public static void main(String[] args) {
		printPowersOfN(4,3); // Parameterized method with parameters base and exponent respectively
		printPowersOfN(5,6);
		printPowersOfN(-2,8);
	}
	
	public static void printPowersOfN(int base, int exponent) {
		System.out.print("1" + " "); // Prints out base ^ 0. which is always equal to 1
		int fbase = base; //Defining the second term in the series base ^ 1, which is always equal to the base itself. Also sets up initial number to be raised.
		for (int i = 0; i<= exponent-1; i++) { // For loop iterates the process of multiplying a resulting number by its base. 
			System.out.print(fbase + " "); //Prints out the resulting number. This also comes before the operation to include the second element in the series
			fbase = fbase * base; // Equation to give a result when exponent is raised by 1.	
		}
		System.out.println(); // Prints a new line for organization if multiple methods are used in the main method.
	}
}
