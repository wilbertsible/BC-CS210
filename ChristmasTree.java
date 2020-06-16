/*
 * CS210 Chapter 3 Programming Projects 1 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/19 - winter quarter
 *
 * This program creates a christmas tree that has parameters that define the number of segments and the height
 * for each segment.
 */

public class ChristmasTree {

	public static void main(String[] args) {
		tree(3, 7);// Declares a tree method with parameters segments and height
	}
	public static void tree(int segment, int height) {
		for (int s = 1; s <= segment; s++) { // This for loop creates the total height of the tree, not including the last three lines
			for (int i = 1 ; i <= height; i++) { // This for loop creates each segment of the tree
				for (int j = i; j <= height-1-s+segment; j++) { // This for loop creates the spaces before the tree
					System.out.print(" ");
				}	
				for (int k = 1; k<= 2*i-1+(2*s-2) ; k++) { // This for loop prints the stars in the tree
					System.out.print("*");
				}
				System.out.println(); // Moves the cursor to the next line
			}
		}
		for (int m = 1; m<=2; m++) {	// Prints the spaces before the stem
			for (int l = 1; l <= height; l++ ) {
				System.out.print(" ");
			}
			System.out.println("*"); // Prints the stem
		}
		System.out.print("  "); // Prints 2 space before the base
		for (int n = 1; n<=2*height-1+2*segment-2-4;n++)
			System.out.print("*"); // Prints the base
	}
}
