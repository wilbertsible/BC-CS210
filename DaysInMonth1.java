/*
 * CS210 Chapter 4 Exercise 4 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/22 - winter quarter
 *
 * This program gives the number of days in the given month parameter. 
 */

public class DaysInMonth1 {

	public static void main(String[] args) {
		daysInMonth(1); //Calls the method
	}
	public static void daysInMonth(int month) {
		// If statement for the days with 31 days with or statement
		if (month == 1 || month == 3 || month ==5 || month == 7 || month == 8 || month ==10|| month == 12) { 
			System.out.println("31");
		}else if (month == 2) { // If statement for February
			System.out.println("28");
		}else if (month == 4 || month == 6 || month == 9 || month == 11) {// If statement for the month with 30 days
			System.out.println("30");
		}
	}
}
