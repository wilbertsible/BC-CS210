
public class Stewie2 { // Create a class
	public static void main(String[] args) {
		System.out.println("//////////////////////"); //Write the first line of the figure
		Victory(); // This statement writes the second and third line of the figure by calling the Victory method
		Victory(); // The next 4 statements repeat the Victory method
		Victory();
		Victory();
		Victory();
	}
	public static void Victory() { // This line creates the static method named Victory
		System.out.println("|| Victory is mine! ||"); // This line prints out the phrase
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"); // This line prints out 22 backslashes
	}
}
