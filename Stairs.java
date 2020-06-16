/*
 * CS210 Chapter 2 Programming Project 5 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/11 - winter quarter
 *
 * This program creates an ASCII art of stairs and people using nested for loops and class constant. The program allows the user to
 * change the class constant to increase or decrease the number of stairs and people present. 
 */

public class Stairs{
	public static final int STEPS = 50; // This class constant dictates the number of steps and people in the figure. 
	public static void main(String[] args){
        for (int j = STEPS ; j>= 1; j--){// This for loop counts the number of stairs and people to be printed
            
            for (int i = 0; i<= j*5-4; i++) // This for loop counts for the space before the head of the person
                System.out.print(" ");
            
            System.out.print ("o  ");//Prints out the head
            
            for (int i = 1; i<=6; i++) // This for loop prints 6 stars after the head
                System.out.print("*");
            
            for ( int i = 1; i<= -5*j + STEPS*5; i++ ) // This prints out the spaces before the wall. 
                System.out.print(" ");
        System.out.println("*");// This prints the wall
            
            
            for (int i = 1; i<= j*5-4; i++) // This for loop counts the spaces before the arm and body.
                System.out.print(" ");
            
            System.out.print ("/|\\ *"); // This prints the arms and the body with escape sequences.
            
            for (int i = 1; i <= 5; i++) // This for loop counts the spaces equal to one platform
                System.out.print(" ");
            for ( int i = 1; i<= -5*j + STEPS*5; i++ ) // This for loop counts from the end of the platform to the wall
                System.out.print(" ");
        System.out.println("*");//This prints the wall
            
            for (int i = 1; i<= j*5-4; i++) // This for loop counts the spaces before the legs
                System.out.print(" ");
            
            System.out.print ("/ \\ *"); // This prints the legs
            
            for (int i = 1; i <= 5; i++) //This for loop prints the spaces equal to one platform 
                System.out.print(" ");
            for ( int i = 1; i<= -5*j + STEPS*5; i++ )// This for loop prints the spaces form the platform to the wall
                System.out.print(" ");
            System.out.println("*"); // This prints the wall
        }
        for (int i = 1; i <= (STEPS+1)*5+2; i++) // This prints the bottom of the stairs
            System.out.print("*");
    }     
}