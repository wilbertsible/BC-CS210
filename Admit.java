/*
 * CS210 Chapter 4 Programming Project 3 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/25 - winter quarter
 *
 * This program compares two college applicants based on their SAT, ACT and GPA scores. The program prompts
 * for the student's SAT or ACT score along with their GPA. The program then computes for their overall score
 * and determines which applicant has a higher score.
 */

import java.util.Scanner;
public class Admit {

	public static void main(String[] args) {
		prompt(); // Calls the prompt method
		Scanner console = new Scanner(System.in); // Constructor for the Scanner
		System.out.println("Information for the first applicant:"); 
		double student1 = applicant(console); // Calls the applicant method for the first student
		System.out.println("Information for the second applicant");
		double student2 = applicant(console);// Calls the applicant method for the second student
		reportStatus(student1,student2);
		
		
	}
	//Introduces the program to the user
	public static void prompt() { 
		System.out.println("This program compares two applicants to");
		System.out.println("determine which one seems like the stronger");
		System.out.println("applicant. For each candidate I will need");
		System.out.println("either SAT or ACR scores plus a weighted GPA.");
	}
	//Prompts for the user input and returns overall score
	public static double applicant(Scanner console) {
		System.out.print("do you have 1)SAT scores or 2)ACT scores?");
		int standardizedTest = console.nextInt(); // Asks whether the student took the SAT or the ACT
		double testScore; // Initializing a variable to be used in the if statement
		if (standardizedTest == 1) {
			testScore = sat(console); // If 1, use SAT questions
		}else if (standardizedTest ==2) {
			testScore = act(console); // If 2, use ACT questions
		}else { // If other choices were made, throw an exception
			throw new IllegalArgumentException();
		}
		double gpaScore =gpa(console); // Initializes and assigns variable to get answer to GPA queations
		double score = overall(testScore, gpaScore); // Calls for the method that computes for the overall grade
		return score; //Returns the score
	}
	// This method asks for the information regarding the SAT scores if it is chosen
	public static double sat(Scanner console) {
		System.out.print("	SAT math?");
		int mathSAT = console.nextInt();
		System.out.print("	SAT verbal?");
		int verbalSAT = console.nextInt();
		double sat = (2 * verbalSAT + mathSAT)/24.0; // Uses the formula given to compute for the SAT score
		return sat; // Returns the value
		}
	public static double act(Scanner console) {
		System.out.print("	ACT English?");
		int englishACT = console.nextInt();
		System.out.print("	ACT math?");
		int mathACT = console.nextInt();
		System.out.print("	ACT reading?");
		int readingACT = console.nextInt();
		System.out.print("	ACT science?");
		int scienceACT = console.nextInt();
		double act = (2*readingACT + englishACT + mathACT + scienceACT)/1.8; // Uses the formula given to compute for the ACT score
		return act; // Returns the value
	}
	public static double gpa(Scanner console) {
		System.out.print("overall GPA?");
		double overallGPA = console.nextDouble();
		System.out.print("max GPA?");
		double maxGPA = console.nextDouble();
		double gpa = overallGPA/maxGPA *100; // Uses the formula given to compute for the ACT score
		return gpa; // Returns the value
	}
	public static double overall(double testScore, double gpaScore) {
		return testScore + gpaScore; //Adds the SAT/ACT score and the GPA score
	}
	public static void reportStatus(double student1, double student2) {
		System.out.println("First applicant overall score = " + student1);
		System.out.println("Second applicant overall score = " + student2);
		if (student1 > student2) { // Print this if student 1 has higher score 
			System.out.println("The first applicant seems to be better");
		}else if (student2> student1) { // Prints this if student 2 has higher score
			System.out.println("The second applicant seems to be better");
		}else { // Print this for all other option, which means that the scores are equal
			System.out.println("The two applicant seen to be equal");
		}
	}
}
