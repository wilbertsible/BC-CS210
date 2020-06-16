/*
 * CS210 Chapter 4 Programming Project 7 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/26 - winter quarter
 *
 * This program creates Pascal's Triangle that has a class constant line that can be changed.
 * The class constant line has a range of 0 to 12. Using printf format, the sizes of
 * the string can be changed so that the spacing is ordered. For loops, and if/else statements were used to construct
 * Pascal's Triangle. The equation used is combination, defined as nCk = n!/k!(n-k)!. This leads to the correct numbers
 * on the sequence. 
 *
 */

public class PascalsTriangle {
	// The class constant has a maximum range of 12 due to the maximum memory, which is 32 bits ~ 2 billion
	public static final int line = 10; // Class constant with range of 0 to 12, where the first row is considered as line 0.
	
	public static void main(String[] args) {
		int nFactorial=1, kFactorial=1, nMinusKFactorial = 1; // Initialition and declaration of variables that will not reset
		for (int n = 0; n <= line; n ++) { // For loop that creates the lines
			String space = " "; // Initialization and declaration of string variable
			for (int s = 1;  s <=line-n; s++) { // Counts how many spaces are printed
				System.out.printf("%2s", space); // Prints the space with 2 spaces right aligned.
			}
			
			nFactorial *= n; // multiplies the nFactorial variable by k for every occurence of the loop with variable n
				if (nFactorial == 0) { // Since 0! = 1, this forces nFactorial to be 1 when n is zero
					nFactorial =1;
				}
			for (int k = 0; k<=n; k++) {
				int number = 1; // Initialization of variable number, the number output 
				
				kFactorial *= k; // Multiplies the kFactorial by k for every occurence of the loop with variable k
				if (kFactorial == 0) { // Since 0! = 1, this forces kFactorial to be 1 when k is zero
					kFactorial = 1;
				}
				int nMinusK = (n-k); // Initialization and declaration of nMinusK, which is (n-k) in the equation
				for (int l = 0; l<=nMinusK; l++) { // For loop that cycles to (n-k)
					nMinusKFactorial *= l; // Multiplies the nMinusKFactorial by l for every occurence of the loop with variable l
					if (nMinusKFactorial == 0) { // Since 0! = 1, this forces nMinusKFactorial to be 1 when k is zero
						nMinusKFactorial = 1;
					}
				}
				
				number = nFactorial / (kFactorial*nMinusKFactorial); // Enters all the variables into the equation to obtain the number
				System.out.printf("%4d" , number); //Prints the number 4 spaces wide right aligned.
				//System.out.print(nFactorial);
			}
			System.out.println();//Prints a new line to move to the next line
		}
	}
}
