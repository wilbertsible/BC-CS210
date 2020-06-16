/*
 * CS210 Chapter 3 Exercise 12 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/16 - winter quarter
 *
 * This program converts the scientific notation of a number to its equivalent decimal notation. coefficient x 10 ^ exponent
 */

public class Scientific {

	public static void main(String[] args) {
		System.out.println(scientific (6.23, 5)); // These statements print out the decimal notation for a given coefficient and exponent of base 10 respectively.
		System.out.println(scientific (1.9, -2));
	}
	public static double scientific(double coefficient, int exponent) { // The parameters declared were the coefficient and the exponent of 10 used.
		return (coefficient* Math.pow(10, exponent)); // The coefficient is multiplied to the math evaluation of the pow method of the Math class with 10 as the base
	}
}
