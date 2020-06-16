/*
 * CS210 Chapter 4 Exercise 12
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/23 - winter quarter
 *
 * This program determines if the triangle is an equilateral, isosceles or a scalene triangle using an if/else statement.
 * Besides this, it can also determine if a triangle is possible using the Triangle Inequlity Theorem. 
 */

public class PrintTriangleType1 {

	public static void main(String[] args) {
		printTriangleType(5,7,7); //Calls out the method
		printTriangleType(6,6,6);
		printTriangleType(5,7,8);
		printTriangleType(2,18,2);
	}
	public static void printTriangleType(int a, int b, int c) {
		
		if (a == b && b ==c && c==a) { // If all sides are equal, use this statement
			System.out.println("equilateral");
		}else if (a !=b && b != c && c != a) { // Else if all sides are not equal, use this statement
			System.out.println("scalene");
		}else { // Else, use this statement. This statement assumes that only two sides are equal.
			System.out.println("isosceles");
		}
		if (a + b <= c || b + c <=a || a + c <=b) { // Exception when it doesn't satisfy the Triangle Inequality Theorem
			throw new IllegalArgumentException();
		}
	}
}
