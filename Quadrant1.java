/*
 * CS210 Chapter 4 Exercise 19 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/24 - winter quarter
 *
 * This program uses the method quadrant with parameters double x and double y that determine where the point 
 * lie on the Cartesian plane. 
 */

public class Quadrant1 {

	public static void main(String[] args) {
		System.out.println(quadrant(-2.3, 3.5)); // Calls the method quadrant and prints it.
		System.out.println(quadrant(4.5, -4.5));
		
	}
	public static int quadrant(double x, double y) {
		if (x>0 && y>0) { // x is positive and y is positive
			return 1;
		}else if (x<0 && y>0) { // x is negative and y is positive
			return 2;
		}else if (x<0 && y<0) { // x is negative and y is negative
			return 3;
		}else if (x>0 && y<0) { // x is positive and y is negative
			return 4;
		}else // either x or y is 0
			return 0;
	}
}
