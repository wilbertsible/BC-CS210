/*
 * CS210 Chapter 5 Exercise 6 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/02/06 - winter quarter
 *
 * This program uses the Random class with the range of 1 to 50, both sides inclusive, to make a certain number of guesses. The program produces 
 * random numbers until it produces a number of 48 or higher. The program then counts the number of times it produces a guess.
 */
import java.util.*; //Import all of the java.util package
public class MakeGuesses1 {

	public static void main(String[] args) {
		Random rand = new Random(); // Random Constructor
		int counter = 0; //Declaration and Initialization of counter variable
		int guess = 0; //Declaration of guess variable and initialization to a number below 48
		while(guess<48) { // While loop with continuation condition of guess less than 48
			guess = rand.nextInt(50)+1; //Guess becomes a random number between 1 and 50 inclusive
			System.out.println("guess = " + guess); // Prints out the guess
			counter++; // Increase counter by 1
		}
		
		System.out.println("total guesses = " + counter); // Prints the total guess
			
	}
	
	
}
