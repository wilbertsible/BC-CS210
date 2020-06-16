/*
 * CS210 Chapter 2 Exercise 9 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/09 - winter quarter
 *
 * This program prints out the figure below using nested for loops. 
 * ----------------------------------------
 * _-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-
 * 1122334455667788990011223344556677889900
 * ----------------------------------------
 */

public class Ch2Ex9 {

	public static void main(String[] args) {
		// The first line is printing dash 40 times. A for loop with initial is 1, termination is 40 and increment by 1 can be used.
		for (int i = 1; i <=40; i++)
			System.out.print("-"); // Prints out the dash
		System.out.println(); //Moves to the next line
		for (int i = 1; i <= 10; i++)// This line uses for loop to print "_-^-" 10 times.
			System.out.print("_-^-");
		System.out.println(); // Moves to the next line
		// A nested for loop was used here. The inner for loop prints out i%10 twice. i then is raised by 1 until 20.
		// Since the i%10 is obtained, only the last digit will print
		for (int i = 1; i <=20; i++) {
			for (int j=1; j<=2; j++)
				System.out.print(i%10);
		}
		System.out.println();// Prints out dashes just like the first line
		for (int i = 1; i <=40; i++)
			System.out.print("-");
	}
}
