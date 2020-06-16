import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("This program reads data for two people and");
		System.out.println("computes their body mass index(BMI).");
		System.out.println();
		System.out.println("Enter next person's information:");
		System.out.print("height (in inches)?");
		double height1 = console.nextDouble();
		System.out.print("weight (in pounds)?");
		double weight1 = console.nextDouble();
		System.out.println();
		System.out.println("Enter next person's information:");
		System.out.print("height (in inches)?");
		double height2 = console.nextDouble();
		System.out.print("weight (in pounds)?");
		double weight2 = console.nextDouble();
		System.out.println();
		
		double bmi1, bmi2, difference;
		bmi1 = weight1 / Math.pow(height1, 2) * 703;
		bmi2 = weight2 / Math.pow(height2, 2) * 703;
		difference = Math.abs(bmi2-bmi1);
		System.out.println("Person 1 BMI = "+bmi1);
		
		if (bmi1<18.5) {
			System.out.print("undereight");
		}else if (bmi1 <= 24.9 && bmi1 >= 18.5) {
			System.out.print("normal");
		}else if (bmi1 <= 29.9 && bmi1 >= 25.0) {
			System.out.print("overweight");
		}else if (bmi1 >=30.0) {
			System.out.print("obese");
		}
		System.out.println();
		System.out.println("Person 2 BMI = "+bmi2);
		
		if (bmi2 < 18.5) {
			System.out.print("undereight");
		}else if (bmi2 <= 24.9) {
			System.out.print("normal");
		}else if (bmi2 <= 29.9) {
			System.out.print("overweight");
		}else if (bmi2 >= 30.0) {
			System.out.print("obese");
		}
		System.out.println();
		System.out.println("Difference = " + difference);
	}
}
