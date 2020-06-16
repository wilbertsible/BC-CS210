/*
 * CS210 Project 6 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/02/18 - winter quarter
 *
 * This program outputs a list of students that are sorted into gender given a .txt file. The user is prompted with the location of the file and the gender.
 * The program then processes the text file in order to present an organized list of students and the statistics of the class. Any text file can be used as long as the data
 * conforms to the format: ID# name gender(f/m) age. (ie. 01 Jill f 21.7).
 */

import java.util.*; //Import Scanner 
import java.io.*; // Import File

public class ReadingData {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in); // Scanner Constructor
		Scanner input = file(console); // Calls the file method and initializes it in a Scanner variable input
		String gender = genderCheck(console); //Calls the gender method and initializes it in a String variable gender
		System.out.println();
		for (int i = 0; i < 50; i++) { // For loop that creates 50 equal signs
			System.out.print("=");
		}
		System.out.println();
		System.out.println();
		String genderFull; //Declares a genderFull which writes the full value of m/f
		if (gender.equalsIgnoreCase("m")) {
			genderFull = "male";
		}else{
			genderFull = "female";
		}
		System.out.println("List of ("+ genderFull +") students:"); 
		System.out.println();
		System.out.printf("%-4s %-7s %-15s %-4s\n", " ", "ID #", "NAME", "AGE"); // Creates the header 
		System.out.printf("%-4s %-7s %-15s %-4s\n", " ", "----", "---------", "----"); // Creates the dashes underneath the header
		list(input,gender); // Populates the list
		
	}
	public static Scanner file(Scanner console) throws FileNotFoundException{
		System.out.print("Enter file to read (case insensitive): "); // Prompts the user to enter filename
		File f = new File(console.nextLine()); // File constructor
		while (!f.canRead()) { //Prompt when the file does not exist
			System.out.println("File not found. Try again.");
			System.out.print("Enter file to read (case insensitive): ");
			f = new File(console.nextLine()); //Asks for the file again
		}
		return new Scanner(f); // Return the file as a Scanner object.
	}
	
	public static String genderCheck(Scanner console) {
		 System.out.print("Parse students by gender (M/F): "); // Prompt
		 String gender = console.next(); // Asks for a user input
		 while (!("m".equalsIgnoreCase(gender) || "f".equalsIgnoreCase(gender))) { // Prompt when the value written is not m or f
			 System.out.println("Not a valid selection.");
			 System.out.print("Parse students by gender (M/F): ");
			 gender = console.next(); // Asks for the gender again
		 }
		 return gender; // Return a correct gender response
	 }
	public static void list(Scanner input, String gender) throws FileNotFoundException {
		int counter = 0; // Counter for how many students with the correct gender
		int total = 0; // Counter for how many total students in the class
		double sum = 0; // Initializes a sum for the total age of the students.
		while (input.hasNextLine()) { // Check to see whether there is another line after the current one
			String text = input.nextLine(); // Move to the next line
			total++; // Adds to the total students counter
			Scanner token = new Scanner(text); // Scan the line for each token
			while (token.hasNext()) { // Checks to see if there is another token after the current one
				String id = token.next(); // Initializes the first token in the line to the String variable id
				String name = token.next(); // Initializes the second token in the line to the String variable name
				String studentGender = token.next(); // Initializes the third token in the line to the String variable studentGender
				double age = token.nextDouble(); // Initializes the fourth token in the line to the double variable age.
				if (gender.equalsIgnoreCase(studentGender)) { // Sets the condition to print only if the gender of the student is the gender the user prompted.
					System.out.printf("%-4s %-7s %-15s %-4s\n", " ", id, name, age); // Prints the details
					counter++; // Adds 1 to the counter on the list
					sum += age; // Adds the age of the current line to the total sum
				}
			}
		}
		double percent = (double)counter /total *100; // Computes for the percentage of the list to the total students in the class
		double average = sum/counter; // Divides the sum of the age of the students to the number of students in the list
		System.out.printf("There are (%d) %s students. (%.2f%% of class)\n", counter, gender, percent); //Prints an output of the statistics
		System.out.printf("Their average age is : %.1f years",average);
	}
	
}
