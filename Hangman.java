/*
 * CS210 Chapter 7 Programming Project 2
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/02/27 - winter quarter
 *
 * This program lets the user play the classic game of hangman. The program has a list of words for the user to guess. The list can be expanded to contain 
 * more words. The user then needs to guess the letters in the word until either all of the letters are present, which means that the user won, or the hangman
 * picture is complete, which means the user lost. There will also be a list of letters that updates whenever the user guesses a letter so that the user can 
 * keep track of the letters that were already used. 
 */

import java.util.*;

public class Hangman {

	public static void main(String[] args) {
		boolean playAgain = true; // Boolean variable to show whether the user wants to play again
		while (playAgain) { // While loop that stays true when the user wants to play again
			rightCounter = 0; // Resets the right counter to 0
			wrongCounter = 0; // Resets the left counter to 0
			System.out.println("Welcome to HANGMAN!"); // Header
			stickFigure0(); // Starts with stick figure when the user has no errors yet
			System.out.println(); 
			char[] selectedWord = pickWord(); // Declares an array selectedWord and initializes it to the return of the method call pickWord
			char[] letterGuess = new char[selectedWord.length]; // Declares an array letterGuess with an array length of the length of seletedWord
			for (int i = 0; i < selectedWord.length; i++) { // Populates the array letterGuess with underscores to signify blank spaces
				letterGuess[i] = '_';
				System.out.print(letterGuess[i] + " "); // Prints the underscores with a whitespace
			}
			System.out.println();
			System.out.println();
			char[] choices = letterSelection(); // Declares an array choices and initializes it to the return of the letterSelection method call
			char answer = userLetter(); // Declares a character answer and intiializes it to the userLetter method call
			checkAnswer(selectedWord, letterGuess, choices, answer); // checkAnswer checks the answer given by the user with the existing arrays
			while (wrongCounter != 6 && rightCounter != selectedWord.length) { // Conditional statement before the win or loss is declared
				boolean contains = false; // Tests whether the letter has already been picked more than once
				
				//If else statement that prints out the stick figures depending on how many times the user picked the wrong letter
				
				if (wrongCounter == 0) {
					stickFigure0();
				}else if (wrongCounter == 1) {
					stickFigure1();
				}else if (wrongCounter == 2) {
					stickFigure2();
				}else if (wrongCounter == 3) {
					stickFigure3();
				}else if (wrongCounter == 4) {
					stickFigure4();
				}else if (wrongCounter == 5) {
					stickFigure5();
				}
				System.out.println();
				board(selectedWord, letterGuess, choices); // Updates the array for the choices of letters and prints it
				answer = userLetter(); // Prompts the user to pick another letter
				for (int m = 0; m < choices.length; m++) { // Checks the choices array if it has already been used
					if (choices[m] == answer) {
						contains = true;
					}
				}
				while (!contains) { // Conditional loop to show if the user pick a letter that has already been picked at least once
					System.out.println("Letter already picked. Pick another one.\n");
					board(selectedWord, letterGuess, choices);
					answer = userLetter();
					for (int m = 0; m < choices.length; m++) {
						if (choices[m] == answer) {
							contains = true;
						}
					}
				}
				checkAnswer(selectedWord, letterGuess, choices, answer); // Checks the answer again
			}
			if (wrongCounter == 6) { // Statement when the hangman figure is complete and the user loses
				stickFigure6();
				System.out.println("The word is ");
				for (int k = 0; k < selectedWord.length; k++) {
					System.out.print(selectedWord[k]);
				}
				System.out.println("\nSorry, You lost.");
			}
			if (rightCounter == selectedWord.length) { // Prints a victory statement when the user guessed the word
				System.out.println("Congratulations! You've won!");
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
					System.out.println();
				}
			}
		}
	}
	public static void board(char[] selectedWord, char[] lettersGuessed, char[] choices) { // Prints out the available letters to choose from
		for (int i = 0; i < selectedWord.length; i++) {  // Prints out the updated blank board
			System.out.print(lettersGuessed[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Choices: ");
		System.out.println(Arrays.toString(choices)); // Prints the array choices
	}
	public static char[] pickWord() { //Randomly picks a word from an array of words
		Random r = new Random();
		String[] words = {"ARRAY", "INDEX","TRAVERSAL", "ALGORITHM", "REFERENCE", "SEMANTICS", "DIMENSION", "PIXEL", "ZERO", "PROGRAM"};
		String hangmanWord = words[r.nextInt(words.length)];
		char[] hangmanChar = new char[hangmanWord.length()];
		char[] hangmanAnswer = new char[hangmanWord.length()];
		for (int i = 0; i < hangmanWord.length(); i++) {
			hangmanChar[i] = hangmanWord.charAt(i);	
		}
		return hangmanChar;
	}
	public static char[] letterSelection() { // Generates the letters in the choice board
		char[] choices  = new char[26];
		char letter = 'A';
		for (int i = 0; i < choices.length; i++) {
			choices[i] = letter;
			letter++;
		}
		System.out.println("Choices: ");
		System.out.println(Arrays.toString(choices));
		return choices;
	}
	public static char userLetter() { // Asks for the user's answer and limits the input to a certain criteria
		Scanner console = new Scanner(System.in);
		System.out.print("Choose a letter: ");
		String userAnswer = console.next();
		/* The while loop first checks for the length of the answer. If the answer is longer than 1 character long or less than, an error message is given.
		 * Also the conditional statement excludes numbers as options. 
		 */
		while(userAnswer.length() > 1 || userAnswer.length() < 0 || userAnswer.equals("0") || userAnswer.equals("1") || userAnswer.equals("2") || userAnswer.equals("3")
				|| userAnswer.equals("4") || userAnswer.equals("5") || userAnswer.equals("6") || userAnswer.equals("7") || userAnswer.equals("8") || userAnswer.equals("9")) {
			System.out.println("Not a valid selection: Choose a letter:");
			userAnswer = console.next();
		}
		char letter = userAnswer.charAt(0);
		for (int i = 0; i <= 10; i++) { // Creates spaces after the console input
			System.out.println();
		}
		return Character.toUpperCase(letter);
	}
	public static int wrongCounter = 0; // Creates a counter for the wrong answers given
	public static int rightCounter = 0; // Creates a counter for the right answers given
	public static void checkAnswer(char[] selectedWord, char[] blankWord, char[] choices, char answer) {
		boolean correct = false; // Boolean that changes whether the given answer is correct or wrong
		for (int i = 0; i < selectedWord.length; i++) { // Algorithm that goes through the selectedWord array and see if the answer is an element of the array
			if (answer == selectedWord[i]) {
				blankWord[i] = answer; // Replaces the underscore character in the array with the answer if it exists in the selectedWord array
				correct = true;
				rightCounter++;
				for (int j = 0; j < choices.length; j++) { // Updates the choices array and replaces the letter chosen with an empty space
					if (selectedWord[i] == choices[j]) {
						choices[j] = ' ';
					}
				}
			}else {
				for (int k = 0; k < choices.length; k++) { // Updates the choices array and replaces the letter chosen with an empty space 
					if (answer == choices[k]) {
						choices[k] = ' ';
					}
				}
			}
		}
		if (correct == false) { //At this point in the program, if the boolean correct is still false, add 1 to the wrong counter
			wrongCounter++;
		}
	}
	
	// The next methods create the visuals for the hangman using ASCII art
	
	public static void stickFigureTop() {
		System.out.println("________");
		System.out.println(" ||    |");
	}
	public static void stickFigureBottom() {
		System.out.println("_||_______");
		System.out.println("__________");
	}
	public static void stickFigurePole() {
		System.out.println(" ||");
	}
	public static void stickFigureHead() {
		System.out.println(" ||    O");
	}
	public static void stickFigure0() {
		stickFigureTop();
		stickFigurePole();
		stickFigurePole();
		stickFigurePole();
		stickFigureBottom();
	}
	public static void stickFigure1() {
		stickFigureTop();
		stickFigureHead();
		stickFigurePole();
		stickFigurePole();
		stickFigureBottom();
	}
	public static void stickFigure2() {
		stickFigureTop();
		stickFigureHead();
		System.out.println(" ||    |");
		stickFigurePole();
		stickFigureBottom();
	}
	public static void stickFigure3() {
		stickFigureTop();
		stickFigureHead();
		System.out.println(" ||   /|");
		stickFigurePole();
		stickFigureBottom();
	}
	public static void stickFigure4() {
		stickFigureTop();
		stickFigureHead();
		System.out.println(" ||   /|\\");
		stickFigurePole();
		stickFigureBottom();
	}
	public static void stickFigure5() {
		stickFigureTop();
		stickFigureHead();
		System.out.println(" ||   /|\\");
		System.out.println(" ||   /");
		stickFigureBottom();
	}
	public static void stickFigure6() {
		stickFigureTop();
		stickFigureHead();
		System.out.println(" ||   /|\\");
		System.out.println(" ||   / \\");
		stickFigureBottom();
	}
	
	
}
