/* 
 * CS210 Project 01 (Methods - Old MacDonald Had Farm)
 * Wilbert Lim Sible
 * wilbert.sible@bellevue.edu
 * 2018.01.07 - winter quarter
 *
 * This program gives an output of the song "Old Macdonald" In this program,
 * the task is to only use methods in the main method and nothing else. Therefore, several 
 * static methods were used to create the statements to complete the song. These static methods 
 * were then used in the main method give an output of the song.
 */

public class Proj01_B_OldMacDonald{
//This is the main method where all other methods will be compiled. The main task here is to order the methods accurately.
	public static void main(String[] args) { 
		oldMacdonald();
		cowName();
		cowSound();
		oldMacdonald();
		space();
		oldMacdonald();
		pigName();
		pigSound();
		oldMacdonald();
		space();
		oldMacdonald();
		duckName();
		duckSound();
		oldMacdonald();
		space();
		oldMacdonald();
		horseName();
		horseSound();
		oldMacdonald();
		space();
		oldMacdonald();
		lambName();
		lambSound();
		oldMacdonald();
		space();
		oldMacdonald();
		chickenName();
		chickenSound();
		lambSound();//The sounds repeat. Since we already have methods for those, we just need to call them.
		horseSound();
		duckSound();
		pigSound();
		cowSound();
		oldMacdonald();
	}
	public static void oldMacdonald() {  // This method prints out the first two verses, which is repeated a lot.
		System.out.println("Old MACDONALD had a farm");
		eieio(); 
	}
	public static void eieio() { //eieio is separated because there are lines where this is not together with Old Macdonald
		System.out.println("E-I-E-I-O");
	}
	public static void cowName() { // The first animal introduced is a cow
		System.out.println("And on his farm he had a cow");
		eieio();
	}
	public static void cowSound() { // Lyrics of the sound of the cow
		System.out.println("With a moo moo here");
		System.out.println("And a moo moo there");
		System.out.println("Here a moo, there a moo");
		System.out.println("Everywhere a moo moo");
	}
	public static void space() { // A space is needed after every verse
		System.out.println();
	}
	
	public static void pigName() { // The next animal introduced is a pig
		System.out.println("And on his farm he had a pig");
		eieio();
	}	
	public static void pigSound() { // Lyrics of the sound of the pig
		System.out.println("With a oink oink here");
		System.out.println("And a oink oink there");
		System.out.println("Here a oink, there a oink");
		System.out.println("Everywhere a oink oink");
	}
	public static void duckName() {	// The next animal introduced is a duck
		System.out.println("And on his farm he had a duck");
		eieio();
	}	
	
	public static void duckSound() { // Lyrics of the sound of the duck
		System.out.println("With a quack quack here");
		System.out.println("And a quack quack there");
		System.out.println("Here a quack, there a quack");
		System.out.println("Everywhere a quack quack");
	}
	public static void horseName() { // The next animal introduced is a horse
      	System.out.println("And on his farm he had a horse");
      	eieio();
	}
    public static void horseSound() {  	// Lyrics of the sound of the horse
      	System.out.println("With a neigh neigh here");
      	System.out.println("And a neigh neigh there");
      	System.out.println("Here a neigh, there a neigh");
      	System.out.println("Everywhere a neigh neigh");
    }

    public static void lambName() { // The next animal introduced is a lamb
      	System.out.println("And on his farm he had a lamb");
      	eieio();
    }
    public static void lambSound(){  	// Lyrics of the sound of the lamb
      	System.out.println("With a baa baa here");
      	System.out.println("And a baa baa there");
      	System.out.println("Here a baa, there a baa");
      	System.out.println("Everywhere a baa baa");
    }
    public static void chickenName() { // The last animal introduced is a chicken
      	System.out.println("And on his farm he had some chickens");
      	eieio();
    }
    public static void chickenSound() { // Lyrics of the sound of the chicken
      	System.out.println("With a cluck cluck here");
      	System.out.println("And a cluck cluck there");
      	System.out.println("Here a cluck, there a cluck");
      	System.out.println("Everywhere a cluck cluck");
    }

}