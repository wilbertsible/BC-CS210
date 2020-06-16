import java.util.Scanner;

public class TipCalculator {

	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		System.out.print("How many people ate? ");
		int people = console.nextInt();
		while (people <1) {
			System.out.println("Not a valid number. Please enter a number.");
			people = console.nextInt();
		}
		double totalCost = 0;
		for (int i = 1 ; i <= people; i++) {
			System.out.print("Person #" + i + ": How much did your dinner cost? ");
			double price = console.nextDouble();
			while (price < 0) {
				System.out.println("Not a valid number. Please enter a number.");
				price  = console.nextDouble();
			}
			totalCost = totalCost + price;
		}
		double tax = totalCost * .08, tip = totalCost *0.15;
		System.out.printf("Subtotal: %.2f\n", totalCost);
		System.out.printf("Tax: %.2f\n", tax);
		System.out.printf("Tip: %.2f\n", tip);
		System.out.printf("Total: %.2f\n", totalCost + tax + tip);
	
	}
}
