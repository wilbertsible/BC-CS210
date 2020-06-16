
/*
 * CS210 Chapter 6 Programming Project 4 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/02/16 - winter quarter
 *
 * This program searches through a list of names in a .txt file. The file contains the popularity of the names in each decade from 1900 to 2000. 
 * The data was obtained from a github repository mishozhghenti/NameSurfer/names-data.txt.
 */

import java.util.*;
import java.io.*;

public class BabyNames {

	public static void main(String[] args) throws FileNotFoundException{
		prompt(); 
		System.out.println(); 
		Scanner console = new Scanner(System.in);
		System.out.print("Name? ");
		String name = console.nextLine();
		stats(name);
		

	}
	public static void prompt() {
		System.out.println("This program allows you to search through the");
		System.out.println("data from the Social Security Administration");
		System.out.println("to see how popular a particular name has been");
		System.out.println("since 1900.");
	}
	
	/*
	 * This method reads the file names-data.txt to get the statistics of the popularity of the names
	*/
	public static void stats(String name) throws FileNotFoundException{
		Scanner input = new Scanner(new File("C:/Users/wilbe/Desktop/txtfiles/names-data.txt"));
		while (input.hasNextLine()) { // Checks if there is still a line to read
			String line = input.nextLine(); // move token to the next line
			Scanner token = new Scanner(line); // Constructor for new Scanner 
			while (token.hasNext()) { // Checks if there is still a token to read
				String databaseName = token.next(); // Moves the token
				if (databaseName.equalsIgnoreCase(name)) {
					System.out.println("Statistics on the name \"" + name + "\"");
					System.out.print("1900: ");
					System.out.println(token.next()); // Prints the next token
					System.out.print("1910: ");
					System.out.println(token.next());
					System.out.print("1920: ");
					System.out.println(token.next());
					System.out.print("1930: ");
					System.out.println(token.next());
					System.out.print("1940: ");
					System.out.println(token.next());
					System.out.print("1950: ");
					System.out.println(token.next());
					System.out.print("1960: ");
					System.out.println(token.next());
					System.out.print("1970: ");
					System.out.println(token.next());
					System.out.print("1980: ");
					System.out.println(token.next());
					System.out.print("1990: ");
					System.out.println(token.next());
					System.out.print("2000: ");
					System.out.println(token.next());
				}else {
					for (int i =0; i<=10; i++) // Moves the token 11 times
						token.next();
				}
				
			}
		}
	}
}

