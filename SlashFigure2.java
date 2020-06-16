/*
 * CS210 Chapter 2 Exercise 17 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/10 - winter quarter
 *
 * This program creates the figure below using nested for loops. A global constant is also used so that the height of
 * the figure can be modified.
 *!!!!!!!!!!!!!!
 *\\!!!!!!!!!!//
 *\\\\!!!!!!////
 *\\\\\\!!//////
 */

public class SlashFigure2 {
	public static final int HEIGHT = 4; // This can be changed to any integer
	public static void main(String[] args) {
				
		for (int i = 1; i<= HEIGHT; i++) { // This for loop generates the output for each line in the figure.
			/* This for loop creates the backslashes for the figure. It was determined by pattern recognition using tables
			 * that the math expression to terminate the backslash is i*2-2.  
			 */
			for (int j =1; j <= i*2-2; j++) 
				System.out.print("\\");//Prints backslash with escape sequence
			
			/* A variable int was declared and an exclamation was assigned to it. The equation in the integer exclamation
			 * is the number of exclamation points that should be in the figure. This equation has 2 parts. The first part is
			 * (HEIGHT *4-2). This was determined by using a table for different heights. Given a HEIGHT, the number of 
			 * characters in one line is represented by this statement. The other expression, 2*(i*2-2), is the number of
			 * slashes in each line. The (i*2-2) statement is the same statement in the prevoius for loop. Since there are 
			 * slashes at both of the ends, this equation is multiplied by 2. Therefore, the result is the number of total 
			 * characters minus the number of forward slashes and backslashes.
			 *
			 */
			int exclamation = (HEIGHT*4-2)-2*(i*2-2);// 
			for (int k = 1; k <=exclamation; k++)
				System.out.print("!"); // Prints the exclamation point.
			
			// Lastly, the forward slash is created the same way the backslash is done.
			for (int m = 1; m <= i*2-2; m++)
				System.out.print("/");
		System.out.println(); // This println moves the for loop to the next line.
		}
	}

}
