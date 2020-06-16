/*
 * CS210 Chapter X Exercise Y 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/07 - winter quarter
 *
 * This program 
 */
import java.util.*;
public class TwoSideDieEqual7 {

	public static void main(String[] args) {
		Random rand = new Random();
		int number1 = 0, number2 = 0;
		int counter  = 0;
		do{
			number1 = rand.nextInt(6)+1;
			number2 = rand.nextInt(6)+1;
			System.out.println(number1 + " + " + number2 + " = " + (number1+number2));
			counter ++;
		}while (number1 + number2 !=7);
			
		System.out.println("You won after " + counter + " tries!");
	}

}
