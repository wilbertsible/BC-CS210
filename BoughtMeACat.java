/* 
 * CS210 Prog Proj #5 
 * Wilbert Lim Sible
 * wilbert.sible@bellevue.edu
 * 2018/01/07 - winter quarter
 *
 * This program prints out the lyrics to the song "Bought Me a Cat," by Simms Taback.
 * The main task in this problem is to find the parts of the lyrics in this song that are repeating and put
 * them in a static method. Then, use all of the methods created in the main method to run the program.
 */
public class BoughtMeACat {
	public static void main(String[] args) { //Arrange the static methods needed and print out the lines only used once
		System.out.println("Bought me a cat and the cat pleased me,");
		System.out.println("I fed my cat under yonder tree.");
		cat();
		System.out.println("Bought me a hen and the hen pleased me,");
		System.out.println("I fed my hen under yonder tree.");
		hen();
		cat();
		System.out.println("Bought me a duck and the duck pleased me,");
		System.out.println("I fed my duck under yonder tree.");
		duck();
		hen();
		cat();
		System.out.println("Bought me a goose and the goose pleased me,");
		System.out.println("I fed my goose under yonder tree.");
		goose();
		duck();
		hen();
		cat();
		System.out.println("Bought me a sheep and the sheep pleased me,");
		System.out.println("I fed my sheep under the yonder tree.");
		System.out.println("Sheep goes baa, baa,");
		goose();
		duck();
		hen();
		cat();
	}
// These are the parts of the lyrics that are repeating	
	public static void goose() {
		System.out.println("Goose goes hissy, hissy,");
	}
	public static void duck() {
	System.out.println("Duck goes quack, quack,");
	}
	public static void hen() {
		System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
	}
	public static void cat() {
		System.out.println("Cat goes fiddle-i-fee.");
		System.out.println();
	}
}
