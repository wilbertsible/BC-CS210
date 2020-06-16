/* 
 * CS210 Assignment 01 (Methods - Sequence)
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018.01.07 - winter quarter
 *
 * This program explores the use of static methods in order to show a desired output. Given the output, main method and 
 * static methods, the static methods can be written into other static methods in order to produce the desired output.
 */

public class Proj01_A_Methods {

    public static void first() {
        System.out.println("first method");
/*Looking at the problem, there seems to be a pattern wherein the first method is followed by two third method. Looking
 * further at the main method, the third method is called after the first. Therefore, adding only one third method would
 * be enough here.
 */
        third(); 
        
    }

    public static void second() {
        System.out.println("second method");
/*After the first two methods on the main method has been used, the second method has been called. Given that the 
 * output should be second, third, first, third, shows that a third method needs to be called then a first and a third.
 * However, the first method already contains a third method, which is why another third method is unnecessary.      
 */
        third();
        first();
        
    }
 
    public static void third() {    	
//Lastly, the only thing missing is the third method and the third output, which is called out in the main method.
    	System.out.println("third method");  
        
        
    } 
// Running this program shows that the desired output for the program is correct.  
    public static void main(String[] args) {
    // DO NOT change this main method
       first();
       third();
       second();
       third();
    // DO NOT change this main method
    }

}


// Desired output:
// first method
// third method
// third method
// second method
// third method
// first method
// third method
// third method
