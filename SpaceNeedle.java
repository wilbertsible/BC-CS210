/*
 * CS210 Chapter 2 Programming Projects 7 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/12 - winter quarter
 *
 * This program prints out an ASCII art of the Space Needle. Different parts of the Space Needle were constructed using nested for loops in different methods.
 * The use of a class constant was also applied here. Using the class constant changes the size of the Space Needle. 
 *           
 */
public class SpaceNeedle{
	public static final int SIZE = 10; //Can be changed to make the space needle bigger or smaller
	public static void main(String[] args){
    apex();
    upperBody();
    middle();
    lowerBody();
    apex();
    percent();
    upperBody();
    middle();
    }
    public static void apex() {    
    	for (int i = 1; i<=SIZE; i++){ // This for loop determines the number of lines for the pointy part of the Space Needle 
            for (int j = 1; j <= SIZE*3; j++ ) // This for loop counts the spaces before the apex
                System.out.print(" ");
            for (int k = 1; k <=2; k++) //This prints the two lines that forms the pointy part.
                System.out.print("|");
            System.out.println(); //Moves to the next line
        }
    }
    public static void upperBody() {   // This method creates the upper half of the Space Needle
    	for (int i = 1; i <=SIZE; i++) { // This for loop counts the number of lines of the whole upper body
        	for (int j = 1; j<= -3*i + SIZE*3; j++) // This for loop counts the spaces before the figure.
        		System.out.print(" ");
        	System.out.print("__/"); // This prints the border of the upper body
        	for (int k = 1; k <= 3*i-3; k++) // This prints the colons that make up the upper body
        		System.out.print(":");
        		for (int l = 1; l <=2; l++) // This prints the 2 middle vertical lines
        			System.out.print("|");
        	for (int m = 1; m <= 3*i-3; m++) // This prints the colons that make up the upper body
            	System.out.print(":");
        	System.out.println("\\__"); // This prints the border of the upper body
        }
    }
    public static void lowerBody() {
    	for (int i = 1; i<=SIZE; i++) { // This for loop counts the number of the lines of the whole lower body
    		for (int j = 1 ; j<= 2*i - 2; j++) // This for loop counts the number of spaces before the figure
    			System.out.print(" ");
    		System.out.print("\\_"); // This prints the border of the lower body
    		for (int k = 1; k <= -2*i + (SIZE*3 + 1); k++) { //This for loop prints the triangles that make up the lower body
    			System.out.print("/\\");
    		}
    		System.out.println("_/");// This prints the border of the lower body
    	}
    }
    public static void middle() {  // This prints the line that separate the lower body from the upper body
    	System.out.print("|"); // Opening border
        for (int i = 1; i <= SIZE*6; i++) //This prints the quotation marks that make up the line
        	System.out.print("\"");
        System.out.println("|"); // Closing border
    }
    public static void percent() { // This prints the body with the percent signs
    	for (int i = 1; i <= SIZE*4; i++) { // This prints the number of lines that make up that part of the Space needle
    		for (int j = 1; j <= SIZE*3-3; j++) // This prints the spaces before the figure
    			System.out.print(" ");
    		System.out.println("|%%||%%|"); //This prints the figure.
    	}
    }
}