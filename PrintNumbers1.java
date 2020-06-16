/*
 * CS210 Lecture Bonus Points 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/05 - winter quarter
 *
 * This program lists the prime numbers within a certain number. Prime numbers are defined as numbers having factors of 1 and itself.
 * Therefore, the method countFactors was used to determine if the number has only 2 factors. This was then used in a for loop to reiterate
 * the test up to a certain number.
 */

public class PrintNumbers1 {

	public static void main(String[] args) {
		printPrimes(3);// Calls method
	}
	public static int countFactors(int number) {
		int counter = 0; // Declares and initializes the counter to 0
		for (int i = 1;  i <=number; i ++) { // For loop that moves from 1 to the parameter number.
			if (number % i == 0) { //If statement that checks whether the mod of the number divided by the variable i is 0, which means that it is a factor.
				counter ++; // When If statement is satisfied, add 1 to the counter
			}	
		}
		return counter; //Returns the final counter
	}
	public static void printPrimes(int max) {
		if (max < 2) {
			System.out.print("");
		}else {
			System.out.print("2");//Fencepost algorithm
			for (int i = 3; i <= max; i ++) { // For loop that starts from 3 to the number
				if (countFactors(i) ==2) {// If statement that tests whether the number has two factors, which means that it is a prime number
					System.out.print(", " + i); // Prints the comma, and then the number if the If statement is satisfied.
				}
			}
		}
	}
}

