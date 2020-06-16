/*
 * CS210 Project 3 & 4
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/07 - winter quarter
 *
 * This program tries to guess a player's number by asking if the computer's guess is high or low. This program uses if/else statements to 
 * perform the decision necessary to do the guess the number. A random number generator is used to guess the player's number. The player is tasked to answer
 * either high or low on the questions(the program only takes the first letter of the answer). Lastly, the program asks if the player wants to play again.
 */

import java.util.Scanner; // Import Scanner

public class GuessingGame {

	public static void main(String[] args) {
		boolean restart = true;
		while (restart) {
			Scanner console = new Scanner (System.in); //Scanner constructor
			int max = maximum(console); // Calls the maximum method  with console input as parameter
			int min = minimum(console); //Calls the minimum method with console input as parameter
			initializing(max,min); // Calls the initializing method with the max and min variable as parameter
			int computerGuess = randomNumberGenerator(max, min);
			while (!(max+1-min <=1) || !(max -min+1 <=1)){
				System.out.println("Player responds, this is (high, low, correct): "); // User prompt
				String playerResponse = console.next();
				char response = playerResponds(playerResponse);
				if (response == 'h') { // If statement is used when player prompts any word starting with h
					max = computerGuess -1; // Calls for the method higherOrLower with new parameters to update the guess range
				}else if (response == 'l') { //// If statement is used when player prompts any word starting with l
					min = computerGuess + 1;// Calls for the method higherOrLower with new parameters to update the guess range	
				}else if (response == 'c') {// If statement is used when player prompts any word starting with c
					System.out.println("I got the right answer!");
				}else {
					System.out.println("Not a valid option. Please pick another option.");
				}
				if (max+1-min <=1) { // If the difference between the high number +1 and low number is 1, then the answer is the low number
					System.out.printf("Then the answer must be...%d!\n", min);
				}else if (max -min+1 <=1) { //If the difference between the low number +1 and high number is 1, then the answer is the high number
					System.out.printf("Then the answer must be...%d!\n", max);
				}
				computerGuess = randomNumberGenerator(max, min);
			}
			restart = result(console); // Calls for the result method with console input as parameter
		}
		
	}
	public static int counter = 0; // Uses a method variable for the counter
	
	public static int maximum(Scanner console) {
		System.out.print("Enter the max range: "); // User prompt
		while (!console.hasNextInt()) {
			console.next();
			System.out.println("Not a valid option. Please enter a number.");
		}
		int max = console.nextInt(); // 
		return max; // Returns value
	}
	public static int minimum(Scanner console) {
		System.out.print("Enter the min range: "); //User prompt
		while (!console.hasNextInt()) {
			console.next();
			System.out.println("Not a valid option. Please enter a number.");
		}
		int min = console.nextInt(); 
		return min; //Returns value
	}
	public static void initializing (int max, int min) {
		System.out.println();
		System.out.println("Initializing...");
		System.out.printf("Player is thinking of a number between %d and %d.\n", min, max); // Uses the format string to enter max and min value
	}
	public static int randomNumberGenerator(int max, int min) {
		int range = (max - min) + 1; //Range is calculated with this equation, both inclusive
		int guess = (int)(Math.random() * range + min); // Equation used to generate a number within a given range
		System.out.printf("Computer guesses: %d\n", guess); // Format string with parameter
		counter++; // Increase method variable counter by 1 
		return guess; //Returns value
	}
	//Player response can be anything as long as the first letter of the word is "h" for high or "l" for low
	public static char playerResponds(String playerResponse) {
		String p = playerResponse.toLowerCase(); //Changes all the user input to lower case
		char response = p.charAt(0); // Takes the first letter of the response
		return response;
	}
	
	public static boolean result(Scanner console) {
		System.out.printf("Game complete! That took %d turn(s)!\n", counter); // Prints a statement with how many times the computer guessed
		System.out.print("Play again?");// Prompts the player to play again
		String playAgain = console.next(); // Asks for an answer
		String pa = playAgain.toLowerCase(); // Changes the answer to lower case
		char answer = pa.charAt(0); // Initializes and assigns the variable to the first letter of the answer
		if (answer =='y') { // If the answer has a first letter of y, then start all over again, otherwise, terminate program.
			counter =0;// Resets the counter when you start a game
			return true;
		}
		return false;
	}
}