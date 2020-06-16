/*
 * CS210 Chapter 4 Exercise 6 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/22 - winter quarter
 *
 * This program creates the method printRange that has two integer parameters. If the first parameter is
 * less than the second parameter, it will count up from the first to the second parameter and vice versa.
 * If the parameters are equal, it will print the parameter.
 */

public class PrintRange1 {

	public static void main(String[] args) {
		printRange(2,7); // Calls the method
		printRange(19,11);
		printRange(5,5);
	}
	public static void printRange(int a, int b) {
		if (a<b) { // Condition used when the second number is bigger than the first
			for (int i = a; i <=b; i++) { // For loop that counts upward from a to b
				System.out.print(i + " ");
			}
		}else if (a>b) { // Condition used when the first number is bigger than the first
			for (int i = a; i >=b; i--) { // For loop that counts downward from a to b
				System.out.print(i + " ");
			}
		}else { // Condition used when the parameters are equal.
			System.out.print(a);
		}
		System.out.println();
	}
}
