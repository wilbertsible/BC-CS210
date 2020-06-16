/*
 * CS210 Chapter 7 Exercise 10 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/02/23 - winter quarter
 *
 * This program calculates for the percentage of the even numbers in an array. Given an array of numbers, the even number is counted and
 * divided over the total number of elements in the array multiplied by 100%. If the array does not have an element, the percentage will be 0.
 */

public class PercentEven1 {

	public static void main(String[] args) {
		int[] list = {6, 2, 9, 11, 3}; // Constructs the list
		System.out.println(percentEven(list)); // Prints the return for the method percentEven
	}
	public static double percentEven(int[] number) {
		int counter = 0; //Declares a variable counter and assigns it to 0
		for (int i = 0; i < number.length; i++) { // Traverses the array
			if (number[i] % 2 == 0) { // If the element in index i mod 2 equals 0, add 1 to the counter
				counter++;
			}
		}
		if (number.length != 0) { // If the length of the array is not zero, calculate for the percentage
			return (double) counter / number.length * 100;
		}else { // If the length of the array is zero, return 0.0
			return 0.0;
		}
	}
}
