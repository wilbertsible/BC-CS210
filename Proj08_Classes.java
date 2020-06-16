/*
 * CS210 Project 8 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/03/11 - winter quarter
 *
 * This program is the client code of the MyStudent class. Less than twelve lines were used to create the file processing program for the 
 * student.txt file. This main class calls the different methods that were needed to produce the program.
 */
import java.io.*;
public class Proj08_Classes {
	public static void main(String[] args) throws FileNotFoundException {
		MyStudent a = new MyStudent(); // Creates the MyStudent object a with 
		String fileName = a.getInput(); // Initializes the variable to the String variable fileName
		String gender = a.getGender(); // Initializes the variable to the String variable gender
		a.readData(fileName); // Reads the data in the relative path from the fileName variable and moves those data into their respective arrays
		a.studentList(gender); // Lists the students input of the variable gender
		a.avgAge(gender); // Lists the average age of the students with that gender
		a.howMany(gender); // Counts how many students are of that gender
		int value = a.getInclusionAge(); // Asks for a user prompt for the list of students above that specific age
		a.age(value); // Lists the name of the students that are above the specified age
	}
}
