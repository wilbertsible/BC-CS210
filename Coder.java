/*
 * CS210 Project 7
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/03/04 - winter quarter
 *
 * This program encodes or decodes a user input or a text file from ASCII values to letters and vice versa. The user inputs either encode or decode to start the
 * program. The user is then asked whether a user input or a file will be encoded/decoded. If the user chooses to use a file, a prompt will ask the user for the
 * file name. Otherwise, if the user chooses to write the input, the input will then be encoded/decoded. Lastly, the user will be asked to save the result.
 * Note: One major limitation of the program is that it can only process a text with one line. All other succeeding lines are ignored by the program.
 */

import java.util.*; 
import java.io.*;

public class Coder {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner console = new Scanner(System.in); 
		System.out.print("Would you like to encode or decode? " ); 
		String programAction = console.nextLine();
		while (!programAction.equalsIgnoreCase("encode") && !programAction.equalsIgnoreCase("decode")) { //Limits the user to two choices: encode or decode
			System.out.println("Not a valid option");
			System.out.print("Would you like to encode or decode? ");
			programAction = console.nextLine();
		}
		System.out.print("Is it a file? " );
		String fileCheck = console.nextLine();
		while (!fileCheck.equalsIgnoreCase("yes") && !fileCheck.equalsIgnoreCase("no")) { // Limits the user to two choices: yes or no
			System.out.println("Not a valid option");
			System.out.print("Is it a file? ");
			fileCheck = console.next();
		}
		System.out.print("What would you like to " + programAction + "? " );
		String encodeDecode = console.nextLine();
		if (fileCheck.equals("yes")) { // Checks the file if the file exists
			File f = new File(encodeDecode);
			while (!f.canRead()) {
				System.out.println("File not found.");
				System.out.println("What would you like to " + programAction + "? ");
				encodeDecode = console.nextLine();
				f = new File(encodeDecode);
			}
		}
		// All the possible permutations from the answers above were used in conditional statements below to process the input
		String output = "";
		if (programAction.equalsIgnoreCase("encode") && fileCheck.equalsIgnoreCase("yes")){
			int[] out = encodeFile(encodeDecode);
			output = Arrays.toString(out);
			System.out.println(output);
		}else if (programAction.equalsIgnoreCase("encode") && fileCheck.equalsIgnoreCase("no")) {
			int[] out = encodeText(encodeDecode);
			output = Arrays.toString(out);
			System.out.println(output);
		}else if (programAction.equalsIgnoreCase("decode") && fileCheck.equalsIgnoreCase("yes")) {
			output = decodeFile(encodeDecode);
			System.out.println(output);
		}else if (programAction.equalsIgnoreCase("decode") && fileCheck.equalsIgnoreCase("no")) {
			output = decodeText(encodeDecode);
			System.out.println(output);
		}
		System.out.print("Save the results as: " );
		String saveFile = console.next();
		PrintStream out = new PrintStream(new File(saveFile)); // Writes the output into a save file
		out.print(output);

	}
	
	//***This method goes through the input and converts it from string to characters to ASCII values
	public static int[] encodeText(String text) {
		int [] postEncodeText = new int[text.length()];
		for (int i = 0; i < text.length(); i++) {
			postEncodeText[i] = text.charAt(i); 
		}
		return postEncodeText;
	}
	
	//***This method processes the array obtained, removing commas, opening and closing brackets, and then converts from int to char to string
	public static String decodeText(String text) {
		String editText = "";
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (letter == '[' || letter == ']' || letter == ',') {
				letter = ' ';
			}
			editText += letter;
		}
		String words  = "";
		Scanner input = new Scanner(editText);
		while (input.hasNextInt()) {
			int asciiNumber = input.nextInt();
			char postDecodeText = (char) asciiNumber;
			words += postDecodeText;
		}
		return words;
	}
	
	//***This method obtains the File, reads the line, returns the int value of the char in the array
	public static int[] encodeFile(String textFile) throws FileNotFoundException {
		Scanner input = new Scanner (new File(textFile));
		while(input.hasNextLine()) {
			String text = input.nextLine();
			int[] postEncodeText = new int[text.length()];
			for (int i = 0; i < text.length(); i++) {
				postEncodeText[i] = text.charAt(i); 
			}
			return postEncodeText;
		}
		return null;
	}
	
	//** This method removes the open and close brackets and commas, and changes the int to character and concatenates to a string
	public static String decodeFile(String textFile) throws FileNotFoundException {
		Scanner input = new Scanner (new File (textFile));
		String editText = "";
		String words = "";
		while (input.hasNextLine()) { // Checks if there is still a line to read
			String text = input.nextLine();
			for (int i = 0; i < text.length(); i++) {
				char letter = text.charAt(i);
				if (letter == '[' || letter == ']' || letter == ',') {
					letter = ' ';
				}
				editText += letter;
			}
			Scanner input2 = new Scanner(editText);
			while (input2.hasNextInt()) { 
				int asciiNumber = input2.nextInt();
				char postDecodeText = (char) asciiNumber;
				words += postDecodeText;
			}
		}
		return words;
	}

}