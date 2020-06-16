/*
 * CS210 Chapter 5 Exercise 1 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/02/05 - winter quarter
 *
 * This program shows the factor of 2 in a given integer. 
 */

public class ShowTwos1 {

	public static void main(String[] args) {
		showTwos(7);// Method calls
		showTwos(18);
		showTwos(68);
		showTwos(9684);
	}
	public static void showTwos(int number) {
		System.out.print(number + " = "); // Prints out the first number
		while (number % 2 ==0) { // Loop if number mod 2  is equal to 0, which also means that the number is divisible by 2.
			System.out.print("2 * "); // Print out 2 * once per iteration of the loop
			number /=2; // Divide the number by 2 per iteration of the loop
		}	
		System.out.println(number); // When the loop condition is met, print out the remaining number
	}
}
