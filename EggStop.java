public class EggStop {
	public static void main(String[] args) { //The main method arranges the figure using static methods
		topEgg();
		bottomEgg();
		bottomEgg();
		System.out.println(" +-------+");
		topEgg();
		System.out.println("|   STOP  |");
		bottomEgg();
		topEgg();
		System.out.println("+---------+");

	}
	public static void topEgg() { //Prints out the top half of the egg
		System.out.println("  _______  ");
		System.out.println(" /       \\");
		System.out.println("/         \\");
	}
	public static void bottomEgg() { //Prints out the bottom of the egg
		System.out.println("\\         /");
		System.out.println(" \\_______/");
	}
}
