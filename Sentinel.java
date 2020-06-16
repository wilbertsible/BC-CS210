/*
 * CS210 Project 5
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/02/11 - winter quarter
 *
 * This program uses the Sentinel loops to ask for a password. Given the correct password, the user will be prompted to a menu where the user can
 * choose a program to use. The programs available are the following:
 * 1. Rock, Paper, Scissors
 * 2. Tip Calculator
 * 3. Number Adding Game
 * 4. Guessing Game
 * 5. Choose for me.
 * 6. Exit
 * 
 * 
 * The password is cs210
 */

import java.util.*;
public class Sentinel {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in); //Scanner constructor
		boolean valid = false; // declaration of boolean valid with value initialized to false
		while (!valid) { //while  valid becomes true, do the while loop 
			valid = validate(console); // calls validate method until it returns a true value
		}
		System.out.println("Logging in. Please wait...");
		boolean stop = false; // declaration of boolean valid with value initialized to false
		while (!stop) { //while  valid becomes true, do the while loop
			int choice = printMenu(console); // Calls the printMenu method.
			// The choice goes through the program until it reaches the correct value for choice and runs those statements.
			if (choice == 1) {
				rockPaperScissorsGame();
				System.out.println();
			}else if (choice == 2) {
				tipCalculator();
				System.out.println();
			}else if (choice == 3) {
				numberAddingGame();
				System.out.println();
			}else if (choice == 4) {
				guessingGame();
				System.out.println();
			}else if (choice == 5) {
				int random = randomMenu(); //Calls randomMenu method
				// If/else statements to pick from based on the random numbers
				if (random == 1) {
					rockPaperScissorsGame();
					System.out.println();
				}else if (random == 2) {
					tipCalculator();
					System.out.println();
				}else if (random == 3) {
					numberAddingGame();
					System.out.println();
				}else {
					guessingGame();
					System.out.println();
				}
			}else if (choice == 6) {
				System.out.println("Thank you for using Wilbert's Sentinel.");
				stop = true; // When the user wants to quit, the stop variable becomes true.
			}else {
				System.out.println("Not a valid selection. Please choose a number.");
			}
		}
	
	}
	public static boolean validate(Scanner console) {
		System.out.print("Enter Password: "); //Prompt
		String pass = console.nextLine(); //Declaration and initialization of the pass variable to the console input
		String password = "cs210"; // Sets the password to cs210
		if (pass.equals(password)) { // If the console input is the right password, the validate method returns a true value
			return true;
		}else {
			System.out.println("Wrong password. Please try again."); // Prompts the user to try again.
			return false; // Returns validate to false
		}
	}
	public static int printMenu(Scanner console) {
		String space = "";
		System.out.printf("%20s Please choose from the following menu:\n", space);
		System.out.printf("%20s  1. Rock, Paper, Scissors\n", space);
		System.out.printf("%20s  2. Tip Calculator\n", space);
		System.out.printf("%20s  3. Number Adding Game\n", space);
		System.out.printf("%20s  4. Guessing Game\n", space);
		System.out.printf("%20s  5. Choose for me.\n", space);
		System.out.printf("%20s  6. Exit\n", space);
		System.out.printf("%21s Enter number: ", space);
		while (!console.hasNextInt()) {
			console.nextLine();
			System.out.println("Not a valid selection. Please enter a number.");
		}
		int menu = console.nextInt(); // User enters a choice
		return menu; // Returns the menu value
		
	}

// ******************** Rock Paper Scissor Program *******************
	public static void rockPaperScissorsGame() {
		System.out.println("Welcome to Rock Paper Scissors. To quit, type q."); // Introduction
		Scanner console = new Scanner(System.in); // Scanner constructor
		boolean quit = false;
		int option =1;
		System.out.print("Rock, Paper or Scissors? "); // Prompt
		while (!quit) {
			String userPick = console.nextLine();
			String lowerCasePick = userPick.toLowerCase(); //Changes all the user input to lower case
			char charPick = lowerCasePick.charAt(0); // Takes the first letter of the response
			if (charPick == 'r'||charPick == 'p' ||charPick == 's') {
				char computerReturn =  rockPaperScissors(option);
				option =winner(charPick, computerReturn);
				System.out.print("Rock, Paper or Scissors? "); // Prompt
			}else if (charPick == 'q' ) { // When player quits, these statements shows up.
				System.out.println("Thank you for playing.");
				System.out.println("Wins: " + winCounter);
				System.out.println("Loss: " + lossCounter);
				quit = true;
			}else {
				System.out.println("Not a valid option. Please pick another option.");
				System.out.print("Rock, Paper or Scissors? "); // Prompt
			}
		}
	}
	
	public static int winCounter = 0; // Consant method that counts how many times user wins
	public static int lossCounter = 0; // Constant method that counts how many times user lost
	
	public static char rockPaperScissors (int option) {
		Random rand  = new Random(); // Random constructor
		int rps = rand.nextInt(101); // Random number from 0 to 100
		// This part shows the biases that the program will take whenever an occurence happens. The numbers are explained in the notes at the bottom.
		// The probabilities can be modified with further research on the statistics. By default, the more favored pick is set at a 2:1 ratio.
		
		int rockStat, scissorStat;
		if (option == 1) { //Rock bias: RPS = 50:25:25
			rockStat = 50;
			scissorStat = 25;
		}else if (option == 2) { //Paper bias RPS = 25:50:25 
			rockStat = 75; 
			scissorStat = 25;
		}else if(option == 3) { //Scissor bias: RPS = 25: 25: 50
			rockStat = 75;
			scissorStat = 50;
		}else  {
			rockStat = 33;
			scissorStat = 33;
		}
		if (rps  > rockStat) {
			System.out.println("Computer chooses Rock"); // Prints what the computer chooses and returns the pick
			return 'r';
		}else if (rps > scissorStat && rps <= rockStat) {
			System.out.println("Computer chooses Paper");
			return'p';
		}else if (rps <= scissorStat) {
			System.out.println("Computer chooses Scissor");
			return 's';
		}else{
			return 'q';
		}
	}
	
	public static int winner(char userReturn, char computerReturn) { // Here, all options are enumerated, the winCount or loseCount is updated, and the probabilities are updated.
		if (userReturn == 'r' && computerReturn == 's') {
			System.out.println("ROCK beats SCISSORS. Player wins!");
			winCounter++;
			return 2;
		}else if(userReturn == 'p' && computerReturn == 'r') {
			System.out.println("PAPER beats ROCK. Player wins!");
			winCounter++;
			return 3;
		}else if(userReturn == 's' && computerReturn == 'p') {
			System.out.println("SCISSORS beats PAPER. Player wins!");
			winCounter++;
			return 1;
		}else if(userReturn == 'r' && computerReturn == 'p') {
			System.out.println("ROCK loses to PAPER. Computer wins!");
			lossCounter++;
			return 3;
		}else if(userReturn == 'p' && computerReturn == 's') {
			System.out.println("PAPER loses to SCISSORS. Computer wins!");
			lossCounter++;
			return 1;
		}else if(userReturn == 's' && computerReturn == 'r') {
			System.out.println("SCISSORS loses to ROCK. Computer wins!");
			lossCounter++;
			return 2;
		}else {
			System.out.println("It's a tie!");
			return -1;
		}	
	}	
	

// ******************** Tip Calculator Program *******************	
	public static void tipCalculator() {
		Scanner console = new Scanner (System.in); // Scanner constructor
		System.out.print("How many people ate? "); //Prompt
		while (!console.hasNextInt()) {
			console.nextLine();
			System.out.println("Not a valid number. Please enter a number.");
		}
		int people = console.nextInt(); // User Input
		
		while (people <1) { // Cannot have a number less than 1
			System.out.println("Not a valid number. Please enter a number.");
			people = console.nextInt();
		}
		double cost = 0; // Declaration and initialization of totalCost variable
		for (int i = 1 ; i <= people; i++) {
			System.out.print("Person #" + i + ": How much did your dinner cost? ");
			while (!console.hasNextDouble()) {
				console.next();
				System.out.println("Not a valid amount. Please enter a number.");
			}
			double price = console.nextDouble();
			while (price < 0) {
				System.out.println("Not a valid number. Please enter a number.");
				price  = console.nextDouble();
			}
			cost = cost + price;
		}
		double tax = cost * .08, tip = cost *0.15;
		System.out.printf("Subtotal: %.2f\n", cost);
		System.out.printf("Tax: %.2f\n", tax);
		System.out.printf("Tip: %.2f\n", tip);
		System.out.printf("Total: %.2f\n", cost + tax + tip);
	
	}
// ******************** Number Adding Program *******************
	public static final int SENTINEL = -1; // Creates a class constant for sentinel value
	public static void numberAddingGame() {
		Scanner console = new Scanner (System.in); // Scanner constructor
		int sum = 0; // Initial value declaration
		int number = SENTINEL-1;
		while(number != SENTINEL) { // Do the statements below while the number input is not equal to the SENTINEL value
			System.out.print("Enter a number.(" + SENTINEL+ " to quit.): "); // Prompt
			while (!console.hasNextInt()) {
				console.next();
				System.out.println("Not a valid option. Please enter a number.");
				System.out.print("Enter a number.(" + SENTINEL+ " to quit.): "); // Prompt
			}
			number = console.nextInt();
			if (number != SENTINEL) {
				sum += number; // Cumulative sum
			}
			
		}
		System.out.println("The total is " + sum); //Gives the total sum when the user quits the program
	}

// ******************** Guessing Game Program *******************
	public static void guessingGame() {
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
					System.out.println("Computer guesses: " + computerGuess);
				}
				if (max+1-min <=1) { // If the difference between the high number +1 and low number is 1, then the answer is the low number
					System.out.printf("Then the answer must be...%d!\n", min);
				}else if (max -min+1 <=1) { //If the difference between the low number +1 and high number is 1, then the answer is the high number
					System.out.printf("Then the answer must be...%d!\n", max);
				}else if (response == 'h' || response == 'l' )
					computerGuess = randomNumberGenerator(max, min);
			}
			restart = result(console); // Calls for the result method with console input as parameter
		}
		
	}
	public static int counter = 0; // Uses a method variable for the counter
	
	public static int maximum(Scanner console) {
		System.out.print("Enter the max range: "); // User prompt
		while (!console.hasNextInt()) { // chechs whether the right input was given
			console.nextLine();
			System.out.println("Not a valid option. Please enter a number.");
		}
		int max = console.nextInt(); // 
		return max; // Returns value
	}
	public static int minimum(Scanner console) {
		System.out.print("Enter the min range: "); //User prompt
		while (!console.hasNextInt()) { // chechs whether the right input was given
			console.nextLine();
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

	
// Random Number Generator for the random menu.
	public static int randomMenu() {
		Random rand = new Random();
		int randomChoice = rand.nextInt(3)+1;
		return randomChoice;
	}
	
}

