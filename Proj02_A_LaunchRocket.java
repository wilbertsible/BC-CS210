/*
 * CS210 Chapter 2 Project 2 A 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/14 - winter quarter
 *
 * This program performs a countdown, then shows an ASCII art of a rocket flying out of the screen. Initially, the program was given.
 * The task was to use for loops to shorten the code and eliminate redundancies.
 */

import java.util.concurrent.TimeUnit;

public class Proj02_A_LaunchRocket{
	
      public static void main(String[] args) throws Exception {
       	System.out.println("Count Down Initiated");
       	for (int i =10 ; i >= 1; i--) { // We used a for loop that counts down to perform the countdown of the rocket
       		System.out.println(i); // This prints out the number i, essentially counting down from 10 to 1
       		TimeUnit.MILLISECONDS.sleep(700);//this delays the println
       	}
       	System.out.println(" BLAST OFF!!");
       	TimeUnit.MILLISECONDS.sleep(1000);//this delays the println

       	System.out.println("    /\\  ");
       	System.out.println("   /  \\ ");
       	System.out.println("  +----+");
       	System.out.println("  | CS |");
       	System.out.println(" /|    |\\");
       	System.out.println("/_+----+_\\");
       	System.out.println("    /\\  ");
       	System.out.println("   /__\\ ");
       	TimeUnit.MILLISECONDS.sleep(500);//this delays the println
       	System.out.println("  (    )");
       	System.out.println("   (  ) ");
       	System.out.println("    ()");
       	System.out.println("    ()");
       	System.out.println("    ()");
//now create a code to launch the rocket.
       	for (int j =1; j<=50; j++) { // This for loop adds a blank line below the rocket, repeated by 50 times to make sure the rocket is out of view.
       		System.out.println();
       		TimeUnit.MILLISECONDS.sleep(50);//this delays the println
      	}	
      }
}
