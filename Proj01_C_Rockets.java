/* 
 * CS210 Project 01 (Methods - Rockets)
 * Wilbert Lim Sible
 * wilbert.sible@bellevue.edu
 * 2018/01/07 - winter quarter
 *
 * This program draws out a picture of a rocket. Using static methods, the task was to reduce redundancy in the code.
 * To do this, the drawing was first analyzed to see which parts of the rocket is repeating. Then, the static method
 * were arranged to show the correct console output. This will give the shortest code possible to build the rocket ship.
 */

public class Proj01_C_Rockets {
	
	public static void main(String[] args) {
		triangle();
		boxes();
		System.out.println("|======| |=<60>=| ");   //The two lines for the logo is not repeating so it doesn't need to be in a method.       
    	System.out.println("|=<09>=| |======| ");  
		boxes();
		triangle();
	}       
	public static void triangle() {	// The two triangle figure is repeating for the head and the tail
		System.out.println("   /\\     \\    /");  
		System.out.println("  /  \\     \\  /");          
    	System.out.println(" /    \\     \\/");
	}
	public static void boxes() { //The two boxes is repeating before and after the logo.
    	System.out.println("+------+ +------+ ");          
    	System.out.println("|      | |      | ");          
    	System.out.println("|      | |      | ");          
    	System.out.println("+------+ +------+ ");
	}
      	
  
}