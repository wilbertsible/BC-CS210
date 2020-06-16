/*
 * CS210 Chapter 2 Programming Projects 8 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/12 - winter quarter
 *
 * This program creates an ASCII art of a textbook by using for loops and class constant. 
 * Note: Since the "Building Java Programs" text is written on the book, there is a minimum of SIZE to 8 and SIZE should be an even number.
 */

public class Textbook {
	public static final int SIZE = 10;  //Minimum of 8 and even numbers only
	public static void main(String[] args) {
		for (int i = 1; i<= SIZE + 1; i++) // This for loop counts the blanks in the first line of the book.
			System.out.print(" "); 
		boundary();
		System.out.println();
		top();
		boundary();
		for (int j = 1; j<= SIZE; j++) // This for loop prints slashes after the middle boundary equal to the book size.
			System.out.print("/");
		System.out.println();
		face();
		boundary();
	}
	public static void boundary() { // This method creates the horizontal edges of the book, which are lines.
		System.out.print("+");
		for (int i = 1; i<=SIZE*3; i++ ) // Prints a certain amount of dashes
			System.out.print("-");
		System.out.print("+");
	}
	public static void top() {	// This prints the top half of the book
		for (int i = 1; i <=SIZE; i++) { // This for loop creates the number of lines in the top half of the book
			for (int j = 1; j <=-1*i+(SIZE+1); j++ ) // This for loop prints the spaces
				System.out.print(" ");
			System.out.print("/");// Prints a single forward slash
			for (int k = 1; k<= -3*i + SIZE*3;  k++) // For loop that prints the blanks after the slash
				System.out.print(" ");
			System.out.print("___/");// Prints the underscore twice and forward slash
			for (int l = 1; l <= i-1; l++)
				System.out.print("__/"); // Prints the underscore once and forward slash
			for (int m = 1; m <= i-1;  m++)
				System.out.print("/"); // Prints a certain amount of slashes
			System.out.println();
		}
	}	
	public static void face() { // Prints the lower half of the book
		for (int i =1; i <= SIZE/2; i++ ) { // Counts the number of lines in the lower half of the book 
			System.out.print("|"); // Prints the boundary of the lower half of the book
			for (int j = 1; j<= (SIZE*3-22)/2; j++) { // Prints the spaces after the vertical line
				System.out.print(" ");
			}
			System.out.print("Building Java Programs"); // Prints the label on the face of the book
			for (int k = 1; k<= (SIZE*3-22)/2; k++) { // Prints spaces after the label
				System.out.print(" ");
			}
			System.out.print("|"); // Prints the right boundary of the book
			for (int l = 1; l<=-2*i+SIZE+2; l++) // Prints the slashes after the book to represent pages
				System.out.print("/");
			System.out.println();
		}	
	}
}
