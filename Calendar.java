/*
 * CS210 Chapter 3 Programming Projects 6  
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/19 - winter quarter
 *
 * This program creates a calendar month with parameters that determine the number of days in that month
 * and the first sunday of that month. (Note: The days in the month can be changed to any number. 
 * The first sunday parameter however is limited from a range between 1 to 7. Going over the range will not give the right input.
 * 
 */

public class Calendar {

	public static void main(String[] args) {
		System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat"); //Prints the days of the week header
		borderline(); //Prints the border
		date(30, 7); // Prints the calendar
		borderline(); //Prints the border again
	}
	
	public static void borderline() {
		for (int i =1;  i <= 7; i++ ) {
			System.out.print("+------"); //Prints the pattern
		}
		System.out.println("+"); // Prints the end of the pattern
	}
	public static void firstLine(int firstSaturday) {
		for (int i = 0; i<firstSaturday; i--) {
			for (int j = 1; j<= 7-firstSaturday; j++)
				System.out.print("|      ");
			
			for (int k = 1; k<= firstSaturday; k++) {
				System.out.print("|" + padded(k, 4) + "  ");
			}
			System.out.println("|");
			break;
		}
	}
	
	public static void date(int daysOfTheMonth, int firstSunday ) {
		firstLine(firstSunday-1);
		/*for (int j = 1; j <= 4; j++) {
			for (int i = 1; i<= 7; i++) {
				System.out.print("|" + padded(firstSunday+i +(7*j-8), 4) + "  ");
			}
			System.out.println("|");
		}*/
		int counter = 0;
		for(int i=firstSunday; i<=daysOfTheMonth; i++)
		{
			System.out.print("|" + padded(i,4) + "  ");
			counter++;
			if (counter == 7) {
				counter = 0;
				System.out.println("|");
			}
			if (counter<7 && i==daysOfTheMonth) {
				for(int j=counter; j<7; j++) {
					System.out.print("|      ");
				}
				System.out.println("|");
			}
		}
		
	}
	public static String padded(int n,  int width) {
		String s = "" + n;
		for (int i = s.length(); i < width; i++) {
			s = " " + s;
		}
		return s;
	}
}
	
