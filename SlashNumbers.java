/* 
 * CS210 Chapter 2 Exercise 7
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/08 - winter quarter
 *
 * This program prints out an ASCII art of a forwardslash-like figure using incrementing numbers. The code uses nested
 * for loops to achieve this figure. 
 *    1
 *   2
 *  3
 * 4
 *5
 */
public class SlashNumbers {

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {// This is the for loop that creates 5 rows.
// This is the for loop that creates the spaces before the number. As the rows go down, 1 space is subtracted from the row 			
			for (int j = 1; j <= 5-i; j++ ) {
				System.out.print(" "); // This prints the space, which is repeated in the for loop.
			}
			System.out.println(i); // This prints out the number at the end of the spaces produced. It is also incremented based on the row it is on.
		}
		
	}

}
