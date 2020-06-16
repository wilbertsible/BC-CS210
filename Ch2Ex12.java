/*
 * CS210 Chapter 2 Exercise 12 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/09 - winter quarter
 *
 * This program uses nested for loops to print numbers 0 to 9 three times for each number. The resulting
 * line is then repeated three times.  
 */

public class Ch2Ex12 {

	public static void main(String[] args) {
		for (int i = 1; i <=3; i++) {// This for loop produces the three lines.
			for (int j = 0; j<=9; j++) { // This for loop counts from 0 to 9.
				for (int k = 1; k<=3; k++) { //This repeats the number 3 times for all the values of j.
					System.out.print(j); // Prints out the value of j
				}
			}
		System.out.println(); // Moves to the next line
		}
	}

}
