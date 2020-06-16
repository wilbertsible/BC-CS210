/* 
 * CS210 Chapter 2 Exercise 3 
 * Wilbert Lim Sible
 * wilbert.sible@bellevue.edu
 * 2018/01/08 - winter quarter
 *
 * This program prints out the first numbers in a Fibonacci sequence. The numbers in the Fibonacci sequence can be obtained
 * by adding the two previous numbers in the sequence starting with one and zero. This program utilizes the for loop to 
 * remove redundancy in the code. 
 */
public class Fibonacci {

	public static void main(String[] args) {
		int i, j, k; // Declaring variables i = F(n-1) , j = F(n-2), k =n, where n is the most recent sum  
		i =1; // We have 1 as the starting point
		j =0; // Initially we add 0
		k =i+j; // We take the sum
		System.out.print(k + " "); // We print the sum and a space in between
		for (int h = 2; h <= 12; h++ ) { 
// A counter to count the iterations in the for loop. the number 12 can be changed to give more numbers.
// the initial h is 2 because the first number in the sequence is already produced before the for loop.			
			System.out.print(k + " "); // This prints out the next number in the sequence.
			j = i; // Since i, which is becomes j, the value of i is assigned to jessentially moving j forward in the sequence.
			i = k; // The sum k becomes the new i.
			k = i+j; // We then add the new values to give a new k.
			
			
		}
	}

}
