/*
 * CS210 Project 8
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/03/11 - winter quarter
 *
 * This class MyStudent processes data in a file with the following format: (<id number> <name> <gender> <age>).
 * The MyStudent class uses array fields and methods to generate the desired console output for the file.
 * The fields and methods were used into the client Proj08_Classes.java.
 *  
 */

import java.util.*; // Imports the Scanner
import java.io.*; // Imports the File object and the exceptions

public class MyStudent {
	
	//Declares the fields as arrays and set to private
	private int[] id;
	private String[] name;
	private String[] gender;
	private double[] age;
	
	
	// This method gets the user input which is the relative file path.
	public String getInput() {
		Scanner console = new Scanner(System.in); //Scanner constructor
		System.out.print("Enter file to read (case insensitive): "); //Prompt
		String fileName = console.nextLine(); // Obtains the user input and initializes it to the string variable filename
		File f = new File(fileName); 
		while(!f.canRead()) { // Checks to see if file can be read
			System.out.println("File not found. Try again");
			System.out.print("Enter file to read (case insensitive): ");
			f = new File(console.nextLine()); // Asks for the file again
		}
		System.out.println("File loaded successfully!\n");
		return fileName; // returns the string filename
	}
	// This method gets the user input which is the gender the user wishes to output
	public String getGender() {
		Scanner console = new Scanner(System.in); //Scanner constructor
		System.out.print("Parse students by gender (M/F): "); //Prompt
		String gender = console.nextLine(); // Obtains the user input and initializes it to the string variable gender
		while (!("m".equalsIgnoreCase(gender) || "f".equalsIgnoreCase(gender))) { // Prompt when the value written is not m or f
			System.out.println("Not a valid selection.");
			System.out.print("Parse students by gender (M/F): ");
			gender = console.nextLine(); // Asks for the gender again
		}
		return gender; // Returns the string gender
	}
	// Checks the user input if it is an integer
	public int checkInt() { 
		Scanner console = new Scanner(System.in); // Scanner constructor
		System.out.print("Minimum age for inclusion: ");
		while (!console.hasNextInt()) {  //Obtains the user input and checks if it is an int
			console.next(); // Discards the wrong input
			System.out.println("Not a valid age.");
			System.out.print("Minimum age for inclusion: ");
		}
		
		return console.nextInt(); // returns the integer entered by the user
	}
	
	// Method that checks the age if it is positive or negative and return the age
	public int getInclusionAge() {
		int age = checkInt(); // checkInt method call initialized to integer variable age
		while(age <= 0) { // Checks if the age is negative
			System.out.println("Not a valid age.");
			age = checkInt(); // checkInt method call initialized again to integer variable age for the correct input
		}
		return age; // returns the int age
	}
	// changes the gender input from m or f to male or femlae respectively
	public String genderLong(String gender) {
		if (gender.equalsIgnoreCase("m")) {
			return "male";
		}else {
			return "female";
		}
	}
	//Method with string parameter that reads a file and populates the field arrays
	public void readData(String fileName) throws FileNotFoundException {
		int lineCount = 0; //Initializes a integer variable lineCount that counts the lines in the file
		Scanner input = new Scanner(new File(fileName)); //Constructor that reads the file
		while(input.hasNextLine()) { // Counts the lines in the file
			input.nextLine();
			lineCount++;
		}
		// Constructs arrays with the lineCount as the size of the arrays
		this.id = new int[lineCount];
		this.name = new String [lineCount];
		this.gender = new String[lineCount];
		this.age = new double [lineCount];
		int indexCount = 0; // Initializes a variable indexCount that counts the index of the array
		Scanner input2 = new Scanner(new File(fileName)); // Scanner and File Constructor
		while(input2.hasNextLine()) { // Reads the lines
			String line = input2.nextLine();
			Scanner token = new Scanner(line); // Scanner constructor
			// This populates the arrays with the corresponding values and adds 1 to the indexCount to read the next line and populate the next array
			while(token.hasNext()) {
				id [indexCount] = token.nextInt();
				name [indexCount] = token.next();
				gender [indexCount] = token.next();
				age [indexCount] = token.nextDouble();
				indexCount++;
			}
		}
	}
	// Counts how many students are of a certain gender
	public void howMany(String gender) {
		int genderCount = 0; //Initializes the genderCount to zero that counts the number of students with the specific gender
		for (int i = 0; i < this.gender.length - 1; i++ ) {
			if (this.gender[i].equalsIgnoreCase(gender)) {
				genderCount++;
			}
		}
		System.out.println("There are (" + genderCount + ") " + genderLong(gender) + " students.\n"); // Prints the output
		
	}
	public void studentList(String gender) {
		int arrayCount = 0; // Variable used to mark the Fencepost Algorithm
		System.out.print("The (" + genderLong(gender) + ") students are: ");
		
		while (!(this.gender[arrayCount].equalsIgnoreCase(gender))) { //Fencepost Algorithm for the first student with that gender
			arrayCount++;
		}
		System.out.print(this.name[arrayCount]); // Prints the first student's name
		for (int i = arrayCount+1; i < this.gender.length - 1; i++ ) { // Prints the rest of the name of the students with that specific gender
			if (this.gender[i].equalsIgnoreCase(gender)) {
				System.out.print(", " + this.name[i]);
			}
		}
		System.out.println();
	}
	// Prints the name of the students with ages that are older than the user's age input
	public void age(int value) {
		int arrayCount = 0; // Variable to find the first name on the array
		System.out.print("The students older than (" + (double)value + ") are: "); // Prompt
		while (!(this.age[arrayCount] >= value)) { // Fencepost algorithm to print the first name on the list
			arrayCount++;
		}
		System.out.print(this.name[arrayCount]); //Prints the first name in the array
		for (int i = arrayCount+1; i <this.age.length; i++) { //Prints the rest of the values in the array
			if (this.age[i] >= value) {
				System.out.print(", " + this.name[i]);
			}
		}
		System.out.println();
	}
	// Computes for the average age of that specific gender
	public void avgAge(String gender) {
		double sum = 0; // Initializes a variable for the cumulative sum
		int genderCount = 0; // Initializes a variable to count how many values are used in the sum
		for (int i = 0; i < this.age.length; i++) { // Goes through the array to add the sum of each student with the specific gender
			if (this.gender[i].equalsIgnoreCase(gender)){
				sum += this.age[i];
				genderCount++;
			}
		}
		double average = sum / genderCount; // Computes the average
		System.out.println("Their average age is (" + average + ") years."); //Prints the output
	}
}

