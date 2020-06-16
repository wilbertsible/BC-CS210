/*
 * CS210 Chapter 7 Exercise 14 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/02/26 - winter quarter
 *
 * This program checks whether list 1 has the elements in list 2. All the elements of list 2 should appear consecutively and sequentially in the right order.
 */

public class Contains1 {

	public static void main(String[] args) {
		int[] list1 = {1, 2, 3, 4, 5}; // Creates an array for the first list
		int[] list2 = {2, 3, 4, 5, 6}; // Creates an array for the second list
		System.out.println(contains(list1, list2)); // Prints out the result of the boolean contains
	}
	public static boolean contains(int[] a1, int[] a2) { 
		if (a2.length == 0){ // If the length of a2 is 0, the array is null. a1 always contain an empty array.
			return true;
		}else if (a1.length < a2.length) { // If the length of a2 is bigger, it is automatically assumed false because there would be more elements in a1 than a2
			return false;
		}else {
			/*The for loop compares index 0 of a2 to the elements of a1. When that element is found, index1Check and index2Check is set to those indexes in both
			 * arrays. The while loop sets the bounds of the arrays as a short circuit evaluation before checking to see whether the elements in the index checks
			 * are equal. If they are equal, 1 is added to the counter variable. Lastly, the counter is checked to see whether the counter and the number of 
			 * elements in a2 are equal, which means that all the elements in a2 are matched with the specific consecutive elements in a1.
			 */
			for (int i = 0; i < a1.length-a2.length+1; i++) { // Cycles through list 1 up to a certain point where there won't be enough elements to pair both lists
				int index1Check = 0; 
				int index2Check = 0;
				if (a2[0] == a1[i]) {
					index1Check = i;
					int counter = 1;
					while ( index1Check < a1.length && index2Check < a2.length && a1[index1Check] == a2[index2Check]) {
						index1Check++;
						index2Check++;
						counter++;
						if (counter == a2.length && a1[index1Check] == a2[a2.length-1]) {
							return true;
						}
					}
				}
			}
			return false;
		}
	}
}
