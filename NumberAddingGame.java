import java.util.*;

public class NumberAddingGame {
	
	public static final int SENTINEL = 0;
	public static void main(String[]args) {
		Scanner console = new Scanner (System.in);
		int sum = 0;
		System.out.print("Enter a number.(" + SENTINEL+ " to quit.): ");
		int number = console.nextInt();
		
		while(number != 0) {
			sum += sum + number;
			System.out.print("Enter a number.(" + SENTINEL+ " to quit.): ");
			number = console.nextInt();
		}
		System.out.println("The total is " + sum);
		
	}

}
