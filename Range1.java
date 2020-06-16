/*
 * CS210 Chapter 7 Exercise 2
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/02/22 - winter quarter
 *
 * This program uses the method range that process an array. It takes the difference of the highest number and the lowest number and adds 1. 
 */

public class Range1 {

	public static void main(String[] args) {
		int[] list = {36, 12, 25, 19, 46, 31, 22}; // Constructs and populates the array.
		System.out.println(range(list));// Prints the return to the method call range.
	}
	public static int range(int[] number) {
		int min = number[0], max = number[0]; // Declares and assigns the variables max and min to the first element in the array.
		for (int i = 0; i <number.length; i++) { // For loop that counts from index 0 to the length of the array. 
			if (number[i] > max) { // Conditional statement when the array element is greater than the variable max.
				max = number[i]; // Replace max to the number at index i
			}
			if (number[i]<min) { // Conditional statement when the array element is less than the variable min
				min = number[i]; // Replace min to the number at index i
			}
		}
		return max - min + 1; // Return the required calculation after the max and the min were determined.
	}
}
