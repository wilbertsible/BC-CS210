/*
 * CS210 Chapter 5 Exercise 5 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/02/09 - winter quarter
 *
 * This program lets the user play rock paper scissors. The user enters either rock paper or scissors, and the computer chooses one of its own.
 * The program will then tell whether the user wins, lose or tie. At the end, the scores will be tallied and presented. 
 * 
 */

import java.util.*;
public class RockPaperScissor {

	public static void main(String[] args) {
		System.out.println("Welcome to Rock Paper Scissors. To quit, type q."); // Introduction
		Scanner console = new Scanner(System.in); // Scanner constructor
		boolean quit = false;
		int option =1;
		System.out.print("Rock, Paper or Scissors? "); // Prompt
		while (!quit) {
			
			String userPick = console.next();
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
	
}


/* Note: The assumptions used here are from research made from the following sources:
 *Social cycling and conditional responses in the Rock-Paper-Scissors game by Zhijian Wang, Bin Xu, and Hai-Jun Zhou (https://arxiv.org/pdf/1404.5199v1.pdf)
 *https://www.psychologytoday.com/blog/the-blame-game/201504/the-surprising-psychology-rock-paper-scissors
 *https://motherboard.vice.com/en_us/article/gvym4x/game-theory-rock-paper-scissors
 *https://www.youtube.com/watch?v=rudzYPHuewc&t=61s
 */