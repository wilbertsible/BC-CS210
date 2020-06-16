/* 
 * CS210 Prog Proj #3
 * Wilbert Lim Sible
 * wilbert.sible@bellevue.edu
 * 2018/01/07 - winter quarter
 *
 * This program prints out the lyrics to the song "There Was an Old Lady Who Swallowed a Fly," by Simms Taback.
 * The main task in this problem is to find the parts of the lyrics in this song that are repeating and put
 * them in a static method. Then, use all of the methods created in the main method to run the program.
 */
public class SwallowedAFly {

	public static void main(String[] args) { //Arrange the static methods needed and print out the lines only used once
		oldLady();
		perhapsShellDie();
		System.out.println();
		System.out.println("There was an old lady who swallowed a spider,");
		System.out.println("That wriggled and iggled and jiggled inside her");
		spiderFly();
		perhapsShellDie();
		System.out.println();
		System.out.println("There was an old lady who swallowed a bird");
		System.out.println("How absurd to swallow a bird");
		birdSpider();
		spiderFly();
		perhapsShellDie();
		System.out.println();
		System.out.println("There was an old lady who swallowed a cat");
		System.out.println("Imagine that to swallow a cat");
		catBird();
		birdSpider();
		spiderFly();
		perhapsShellDie();
		System.out.println();
		System.out.println("There was an old lady who swallowed a dog");
		System.out.println("What a hog to swallow the dog");
		System.out.println("She swallowed the dog to catch the cat");
		catBird();
		birdSpider();
		spiderFly();
		perhapsShellDie();
		System.out.println();
		System.out.println("There was an old lady who swallowed a horse,");
		System.out.println("She died of course.");
	}
	
// These are the parts of the lyrics that were repeated more than once
	public static void oldLady() {
		System.out.println("There was an old lady who swallowed a fly,");
	}
	public static void perhapsShellDie() {
		System.out.println("I don't know why she swallowed that fly,");
		System.out.println("Perhaps she'll die.");
	}
	public static void catBird() {
		System.out.println("She swallowed the cat to catch the bird,");
	}
	public static void birdSpider() {
		System.out.println("She swallowed the bird to catch the spider,");
	}
	public static void spiderFly() {
		System.out.println("She swallowed the spider to catch the fly,");
	}
	
}	
