/*
 * CS210 Chapter 7 Programming Project 5 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/03/03 - winter quarter
 *
 * This program lets the user play tic tac toe. The user inputs a number from 1 to 9 corresponding to the spaces in the board. The computer randomly chooses an
 * open space on the board and place its piece there. Either the player or the computer wins when three of their pieces form a straight line.
 */
import java.util.*;

public class TicTacToe {
	public static char winPiece = ' ';
	public static void main(String[] args) {
		boolean playAgain = true; // Boolean variable to show whether the user wants to play again
		while (playAgain) { // While loop that stays true when the user wants to play again
			System.out.println("Welcome to Tic Tac Toe.  Player is X. Computer is O. Pick a number to begin."); // Prompt
			char[][] boxes = {{'1', '2', '3'},{'4', '5', '6'},{'7', '8', '9'}}; // Constructs a two-dimensional array with the numbers 1 to 9 as elements.
			printBoard(boxes); // Prints the board
			boolean endGame = winCondition(boxes); // Declares the boolean endGame and assigns it to the return of the winCondition method
			while (!endGame) { // While the endGame is false, do the following loop
				int answer = selectNumber(); // Declares the boolean answer and assigns it to the return of the selectNumber method
				placeAnswer(boxes, answer); // Uses the answer as parameter to place the answer into the board
				endGame = winCondition(boxes); // Checks if the win condition is met
				if (!endGame) { // If the user hasn't won yet, the computer takes its turn
					computerMove(boxes);
				}
				printBoard(boxes); // Prints the board again
				endGame = winCondition(boxes); // Checks if the win condition is met
				System.out.println();
				
			}
			if (winPiece == 'O') { // If the win piece is O, then the computer wins
				System.out.println("Computer wins!");
			}else if (winPiece == 'X') { // If the win piece is X, then the player wins
				System.out.println("Player wins!");
			}
			System.out.println("Play again?(Y/N)"); // Prompts the player to play again
			Scanner console = new Scanner(System.in);
			String play = console.next();
			while(play.length() != 1 || (!play.equalsIgnoreCase("Y") && !play.equalsIgnoreCase("N"))) { // Tests whether the user inputs anything other than a Y or N
				System.out.println("Not a valid answer. Pick again");
				play = console.next();
			}
			if (play.equalsIgnoreCase("n")) { // If the user says no, this terminates the program
				playAgain = false;	
			}else {
				for (int l = 0; l < 10; l++) { // Clears the console for a new game
					winPiece = ' ';
					System.out.println();
				}
			}
		}
	}
	public static void printBoard(char[][] board) { // Prints the board
		System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		System.out.println("---|---|---");
		System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		System.out.println("---|---|---");
		System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
	}
	public static int selectNumber() { // Lets the user input a number and limits that choice to only from 1 to 9
		Scanner console = new Scanner(System.in);
		int number;
		do {
		    System.out.print("Choose a number: ");
		    while (!console.hasNextInt()) { // Limits the user input to integers only
		        System.out.println("Not a valid number! Choose a number: ");
		        console.next(); 
		    }
		    number = console.nextInt();
		} while (number <0 || number > 9); // Limits the user's input from 1 to 9
		return number;
	}
	public static void placeAnswer(char[][] boxes, int answer) {  // Searches the array for the correct place and places the player's symbol there
		boolean xPlaced = false; // Creates the boolean xPlaced which is false until the piece is placed
		while (!xPlaced) {
			for (int i = 0; i < 3; i++) { // Goes through the rows for the correct number
				for (int j = 0; j < 3; j++) { // Goes through the columns for the correct number
					if (Character.getNumericValue(boxes[i][j]) == answer) { // If the answer is equal to the number in the array, place the X symbol
						boxes [i][j] = 'X';
						xPlaced = true; // Tells the program that the X symbol is placed and it is fine to continue
					}
				}
			}
			if(!xPlaced) {
				answer = selectNumber();
			}
		}
		
	}
	public static void computerMove(char[][] boxes) { // Creates a random number and place the O piece there
		Random r = new Random (); // Constructs the random object
		boolean oPlaced = false; // Creates the boolean oPlaced which is false until the piece is placed
		while (!oPlaced) {
			int circleMove = r.nextInt(9-1)+1; // Sets the boundaries of the random number from 1 to 9
			for (int i = 0; i < 3; i++) { // Goes through the rows for the correct number
				for (int j = 0; j < 3; j++) { // Goes thrpugh the columns for the correct number
					if (Character.getNumericValue(boxes[i][j]) == circleMove) {
						boxes [i][j] = 'O';
						oPlaced = true; // Tells the program that the X symbol is placed and it is fine to continue
					}
				}
			}
		}
	}
	/* This method essentially sets the win conditions by enumerating all the possible ways of winning. The winning condition
	 * sets the win piece to the piece in that array index, and the boolean is set to true to indicate that the game is over.
	 */
	public static boolean winCondition(char[][] boxes) { 
		if (boxes[0][0] == boxes[0][1] && boxes[0][0] == boxes[0][2] && boxes[0][1] == boxes[0][2]) {
			winPiece = boxes[0][0];
			return true;
		}else if(boxes[1][0] == boxes[1][1] && boxes[1][0] == boxes[1][2] && boxes[1][1] == boxes[1][2]) {
			winPiece = boxes[1][0];
			return true;
		}else if(boxes[2][0] == boxes[2][1] && boxes[2][0] == boxes[2][2] && boxes[2][1] == boxes[2][2]) {
			winPiece = boxes[2][0];
			return true;
		}else if(boxes[0][0] == boxes[1][0] && boxes[1][0] == boxes[2][0] && boxes[0][0] == boxes[2][0]) {
			winPiece = boxes[0][0];
			return true;
		}else if(boxes[0][1] == boxes[1][1] && boxes[1][1] == boxes[1][2] && boxes[0][1] == boxes[1][2]) {
			winPiece = boxes[0][1];
			return true;
		}else if(boxes[0][2] == boxes[1][2] && boxes[1][2] == boxes[2][2] && boxes[0][2] == boxes[2][2]) {
			winPiece = boxes[0][2];
			return true;
		}else if(boxes[0][0] == boxes[1][1] && boxes[1][1] == boxes[2][2] && boxes[0][0] == boxes[2][2]) {
			winPiece = boxes[0][0];
			return true;
		}else if(boxes[2][0] == boxes[1][1] && boxes[1][1] == boxes[0][2] && boxes[2][0] == boxes[0][2]) {
			winPiece = boxes[2][0];
			return true;
		}
		return false;
	}
}
