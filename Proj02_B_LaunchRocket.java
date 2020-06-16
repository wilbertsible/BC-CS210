/*
 * CS210 Chapter 2 Project 2 B
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/14 - winter quarter
 *
 * This program performs a countdown, then shows an ASCII art of multiple rocket flying out of the screen one at a time. The program was initially copied from
 * Proj02_A_LaunchRocket.java. The task was to use nested for loops and class constant in the project.
 */

import java.util.concurrent.TimeUnit;

public class Proj02_B_LaunchRocket{
	public static final int ROCKETS = 4; // This constant can be changed to increase the amount of rockets to be produced.
	public static void main(String[] args) throws Exception {
       	System.out.println("Count Down Initiated");
       	for (int i =10 ; i >= 1; i--) { // We used a for loop that counts down to perform the countdown of the rocket
       		System.out.println(i); // This prints out the number i, essentially counting down from 10 to 1
       		TimeUnit.MILLISECONDS.sleep(700);//this delays the println
       	}
       	System.out.println(" BLAST OFF!!");
       	TimeUnit.MILLISECONDS.sleep(1000);//this delays the println

       	
       	for (int l =0; l <= ROCKETS-1; l++) {// The outer for loop counts the number of rockets that will be made.
       	// This for loop and the following same for loops are used to count the spaces before the rocket. Each line of the rocket will have its own space generator.
       		for (int k = 0; k <= l*12; k++) { 
       			System.out.print(" ");
       		}
       		System.out.println("    /\\  ");
       		for (int k = 0; k <=l*12; k++ ) {
       	     	System.out.print(" ");
       		}
       		System.out.println("   /  \\ ");
       		for (int k = 0; k <= l*12; k++ ) {
       			System.out.print(" ");
       		}
       		System.out.println("  +----+");
       		for (int k = 0; k <= l*12; k++ ) {
       			System.out.print(" ");
       		}
       		System.out.println("  | CS |");
       		for (int k = 0; k <= l*12; k++ ) {
       			System.out.print(" ");
       		}
       		System.out.println(" /|    |\\");
       		for (int k = 0; k <= l*12; k++ ) {
       			System.out.print(" ");
       		}
       		System.out.println("/_+----+_\\");
       		for (int k = 0; k <= l*12; k++ ) {
       			System.out.print(" ");	
       		}
       		System.out.println("    /\\  ");
       		for (int k = 0; k <= l*12; k++ ) {
       			System.out.print(" ");	
       		}
       		System.out.println("   /__\\ ");
       		TimeUnit.MILLISECONDS.sleep(500);//this delays the println
       		for (int k = 0; k <= l*12; k++ ) {
       			System.out.print(" ");
       		}
       		System.out.println("  (    )");
       		for (int k = 0; k <= l*12; k++ ) {
       			System.out.print(" ");	
       		}
       		System.out.println("   (  ) ");
       		for (int k = 0; k <= l*12; k++ ) {
       			System.out.print(" ");	
       		}
       		System.out.println("    ()");
       		for (int k = 0; k <= l*12; k++ ) {
       			System.out.print(" ");	
       		}
       		System.out.println("    ()");
       		for (int k = 0; k <= l*12; k++ ) {
       			System.out.print(" ");	
       		}
       		System.out.println("    ()");
//now create a code to launch the rocket.
       		for (int j =1; j<=15; j++) { // This for loop adds a blank line below the rocket, repeated by 50 times to make sure the rocket is out of view.
       			System.out.println();
       			TimeUnit.MILLISECONDS.sleep(50);//this delays the println
       		}
      	}	
	}
}

