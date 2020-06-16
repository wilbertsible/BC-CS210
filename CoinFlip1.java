/*
 * CS210 Chapter 6 Exercise 15 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/02/15 - winter quarter
 *
 * This program reads a .txt file with "h" and "t" written on it. The program shows the number of heads in each line and
 * the total input for that line. If the percentage is above 50%, then the program prints out "You win".
 */
import java.util.*; // Import Scanner
import java.io.*; // Import File

public class CoinFlip1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("C:/Users/wilbe/Desktop/txtfiles/coin flip.txt")); //Scanner and file constructor
		coinFlip(input); // Method call
	}
	public static void coinFlip(Scanner input) throws FileNotFoundException{
		String line = ""; // Declaration and initiation of variable
		while (input.hasNextLine()) { 
			line = input.nextLine(); //Scanner that goes through each line of the .txt file
			int headsCounter = 0, tailsCounter = 0; // Declaration and initiation of counters
			Scanner data = new Scanner(line); //Scanner constructor
			while (data.hasNext()) {
				String token = data.next(); // Scanner that goes through each token in the line
				String tokenLowerCase = token.toLowerCase(); // Converts token into lower case
				if (tokenLowerCase.equals("h")) { // Conditional statement that tells if token is heads or tails, add the appropriate counter
					headsCounter++;
				}else if (tokenLowerCase.equals("t")) {
					tailsCounter++;
				}
			}
			double percent = (double)headsCounter/(headsCounter +  tailsCounter) * 100; // Percentage calculation
			System.out.printf("%d heads (%.1f%%)\n",headsCounter, percent); // Prints output
			if (percent > 50) { // Conditional statement 
				System.out.println("You win!");
			}
		System.out.println();
		}
		
	}
}
