
public class Lanterns {

	public static void main(String[] args) { // Main method arranges the figure using the static methods
		triangle();
		System.out.println();
		triangle();
		starline();
		star13();
		triangle();
		System.out.println();
		triangle();
		star5();
		starline();
		starline();
		star5();
		star5();

	}
	

	public static void star5() { //Prints the star 5 times
		System.out.println("    *****    "); 
	}
	public static void star9() { // Prints the star 9 times
		System.out.println("  *********  "); 
	}
	public static void star13() { // Prints the star 13 times
		System.out.println("*************"); 
	}
	public static void starline() { // Prints the star with lines
		System.out.println("* | | | | | *"); 
	}
	public static void triangle() { // Prints the triangular part of the lantern using methods used before
		star5();
		star9();
		star13();
	}
}
