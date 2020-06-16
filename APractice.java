/*
 * CS210 Chapter X Exercise Y 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/07 - winter quarter
 *
 * This program 
 */

import java.util.*;
import java.io.*;

public class APractice {
	public static void main(String[]args) {
	int number  = mostFrequentDigit(57135203);
	System.out.println(number);
	}
	public static void arraysWeather() {
		Scanner console = new Scanner (System.in);
		System.out.print("How many days' temperature? ");
		int days = console.nextInt();
		int[] numbers = new int[days];
		int sum = 0, counter = 0;
		for (int i = 0 ; i<numbers.length; i++) {
			System.out.print("Day " + (i+1) + "'s high temp: ");
			numbers [i] = console.nextInt();
			sum += numbers[i];
		}
		double average = (double)sum/(double)numbers.length;
		System.out.printf("Average temp = %.1f\n", average);
		for (int j = 0; j<numbers.length; j++) {
			if (numbers[j] > average) {
				counter++;
			}
		}
		System.out.println(counter + " days were above average.");
		System.out.println("Temperatures: " + Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println("Two coldest days:" +numbers[0] + " " + numbers[1]);
		System.out.println("Two hottest days:" +numbers[numbers.length-1] + " " + numbers[numbers.length-2]);
	}
	public static void hours2 (String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("C:/Users/wilbe/Desktop/txtfiles/hours.txt"));
		PrintStream output = new PrintStream(new File("C:/Users/wilbe/Desktop/txtfiles/hours_out.txt"));
		while (input.hasNextLine()) {
			String text = input.nextLine();
			hours(text,output);
		}
	}
	public static int seven() {
		Random rand = new Random();
		
		for (int i = 1; i <=10; i++) {
			int lottoNumbers = rand.nextInt(30)+1;
			System.out.print(lottoNumbers + " ");
			if (lottoNumbers == 7) {
				return -1;
			}
		}
		return -1;
	}
	public static void digitSum(int number) {
		int sum = 0;
		while (number != 0) {
			int mod = number % 10;
			sum += mod;
			number /= 10;
		}
		System.out.println(sum);
	}
	public static boolean hasAnOddDigit(int number) {
		while (number != 0) {
			if (number % 2 == 1) {
				return false;
			}else {
				number /= 10;
			}
		}
		return true;
	}
	public static boolean allDigitsOdd(int number) {
		while (number != 0) {
			if (number % 2 != 0) {
				number /= 10;
			}else {
				return false;
			}
		}
		return true;
	}
	public static void weather() throws FileNotFoundException{
		Scanner input = new Scanner(new File("C:/Users/wilbe/eclipse-workspace/DelaRosaMichael/src/weather.txt"));
		double firstNumber = input.nextDouble();
		while (input.hasNext()) {
			if(input.hasNextDouble()) {
				double secondNumber = input.nextDouble();
				System.out.printf("%.1f to %.1f, change = %.1f\n", firstNumber, secondNumber, secondNumber - firstNumber);
				firstNumber = secondNumber;
			}else {
				input.next();
			}
		}
	}
	public static void poll (Scanner input) {
		//Scanner input = new Scanner(new File("C:/Users/wilbe/eclipse-workspace/DelaRosaMichael/src/poll.txt"));
		int obamaTotal = 0, mccainTotal = 0;
		while(input.hasNext()) {
			if (input.hasNextInt()) {
				int obama = input.nextInt();
				obamaTotal += obama;
				int mccain = input.nextInt();
				mccainTotal += mccain;
				input.nextInt();	
			}else {
				input.next();
			}
		}
		System.out.println("Obama : " + obamaTotal);
		System.out.println("McCain: " + mccainTotal);
	}
	public static void hours(String text, PrintStream output) throws FileNotFoundException {

		Scanner data = new Scanner(text);
		
		int id = data.nextInt();
		String name  = data.next();
		double sum = 0.0;
		int counter = 0;
		while (data.hasNextDouble()) {
			sum += data.nextDouble();
			counter++;
		}
		//System.out.printf("%s (ID#%d) worked %.1f hours (%.2f hours/day)\n",name, id, sum, sum/counter);
		
		output.println(name +" (ID#"+ id + ") worked " + sum + " hours (" + (sum/counter) + " hours/day)");
		
		
		
	}
	public static void swapArrays() {
		int [] numbers = {11, 42, -5, 27, 0, 89};
		for (int i = 0; i <numbers.length/2; i++) {
			int temp = numbers[i];
			numbers[i] =numbers[numbers.length-1-i];
			numbers[numbers.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(numbers));
	}
	public static int[] reverse(int [] numbers) {
		for (int i = 0; i <numbers.length/2; i++) {
			int temp = numbers[i];
			numbers[i] =numbers[numbers.length-1-i];
			numbers[numbers.length-1-i] = temp;
		}
		return numbers;
	}
	public static int[] swap(int[] a, int b, int c) {
		int temp = a[b];
		a[b] = a[c];
		a[c] = temp;
		return a;
	}
	public static void swapAll(int[] a1, int[] a2) {
		for(int i = 0; i < a1.length; i++) {
			int temp = a1[i];
			a1[i] = a2[i];
			a2[i] = temp;
		}
	}
	public static int[] merge(int[] a1, int[] a2) {
		int combineLength = (a1.length) + (a2.length);
		int[] combine  = new int[combineLength];
		for (int i = 0; i < a1.length; i++) {
			combine[i] = a1[i];
		}
		for (int j = 0; j < a2.length; j++) {
			combine [a1.length + j] = a2[j];
		}
		return combine;
	}
	public static int[] merge3(int[] a1, int[] a2, int[]a3) {
		int combineLength = (a1.length) + (a2.length) + (a3.length);
		int[] combine  = new int[combineLength];
		for (int i = 0; i < a1.length; i++) {
			combine[i] = a1[i];
		}
		for (int j = 0; j < a2.length; j++) {
			combine [a1.length + j] = a2[j];
		}
		for (int k = 0; k < a3.length; k++) {
			combine [a1.length + a2.length + k] = a3[k];
		}
		return combine;
	}
	public static int mostFrequentDigit(int n) {
		int[] counts = new int[10];
		while (n>0) {
			int digit = n%10;
			counts[digit]++;
			n = n/10;
		}
		int highestCounter = counts[0];
		int highestNumber = 0;
		for (int i = 0; i < 10; i++) {
			if (counts[i]>highestCounter) {
				highestCounter = counts[i];
				highestNumber = i;
			}
		}
		return highestNumber;
	}
}
