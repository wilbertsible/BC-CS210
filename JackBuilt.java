/* 
 * CS210 Prog Proj #5 
 * Wilbert Lim Sible
 * wilbert.sible@bellevue.edu
 * 2018/01/07 - winter quarter
 *
 * This program prints out the lyrics to the song "The House That Jack Built," by Simms Taback.
 * The main task in this problem is to find the parts of the lyrics in this song that are repeating and put
 * them in a static method. Then, use all of the methods created in the main method to run the program.
 */
public class JackBuilt {

	public static void main(String[] args) { //Arrange the static methods needed and print out the lines only used once 
		System.out.println("This is the house that Jack built.");
		System.out.println();
		System.out.println("This is the malt");
		house();
		System.out.println("This is the rat,");
		malt();
		house();
		System.out.println("This is the cat,");
		rat();
		malt();
		house();
		System.out.println("This is the dog");
		cat();
		rat();
		malt();
		house();
		System.out.println("This is the cow with the crumpled horn,");
		dog();
		cat();
		rat();
		malt();
		house();
		System.out.println("This is the maiden of all forlorn");
		System.out.println("That milked the cow with the crumpled horn,");
		dog();
		cat();
		rat();
		malt();
		house();
	}
// These are the parts of the lyrics that are repeating	
	public static void dog() {
		System.out.println("That tossed the dog,");
	}
	public static void cat() {
		System.out.println("That worried the cat,");
	}
	public static void rat() {
		System.out.println("That killed the rat,");
	}
	public static void malt() {
		System.out.println("That ate the malt");
	}
	public static void house() {
		System.out.println("That lay in the house that Jack built.");
		System.out.println();
	}
}
