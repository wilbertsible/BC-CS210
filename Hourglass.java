/*
 * CS210 Chapter 2 Programming Projects 4 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/11 - winter quarter
 *
 * This program prints out the figure below using nested for loops and static methods.
 *
 *|""""""""""|
 * \::::::::/
 *  \::::::/
 *   \::::/
 *    \::/
 *     ||
 *    /::\
 *   /::::\
 *  /::::::\
 * /::::::::\
 *|""""""""""|
 */

public class Hourglass{
	public static void main(String[] args){
		topBottom();
		topHourglass();
		System.out.println("||"); // This prints out the middle vertical lines
		bottomHourglass();
		topBottom();
	}
	public static void topBottom() { //This prints out the top and bottom of the hourglass
		System.out.print("|"); // This line prints out the first vertical line
		for (int i = 1; i<=10; i++){ // This for loop prints out the 10 quotation marks
			System.out.print("\""); 
		}
		System.out.println("|"); // This prints out the ending vertical line
	}
	public static void topHourglass() {// This prints out the top half of the glass part in the hourglass
		for (int i = 1; i<=4; i++){ //This for loop counts each of the 4 lines in the upper half of the hourglass
			for (int j = 1; j<=i; j++) // This for loop prints out the spaces before the figure
				System.out.print(" ");
			System.out.print("\\"); // This line prints the opening backslash with escape sequence
			for (int k = 1; k <= 10-2*i; k++) // This for loop prints the number of colons in each line
				System.out.print(":");
			System.out.println("/"); // This loop prints out the ending forward slash
		}
		for (int i = 1; i <= 5; i++) // This for loop prints out the 5 spaces before the vertical lines
		    System.out.print(" ");
	}
		
	    
	public static void bottomHourglass() { // This prints out the bottom of the hourglass  
		for (int i = 1; i <=4; i ++){ //This for loop counts each of the 4 lines in the lower half of the hourglass
			for (int j = 4; j >= i;  j--) // This for loop prints out the spaces before the figure
				System.out.print(" "); 
			System.out.print("/"); //This prints out the opening forwardslash
			for (int k = 1; k <= 2*i; k++) // This for loop counts the number of colons in each line
				System.out.print(":");
			System.out.println("\\"); // This prints out the closing backslash with escape sequence
	    }
	}
}