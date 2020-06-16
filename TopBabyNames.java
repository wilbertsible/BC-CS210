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


public class TopBabyNames {

	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner data1900 = new Scanner(new File("C:/Users/wilbe/Desktop/BabyNames/1900.txt"));
		separateBabyNames(data1900);
	}
	public static void separateBabyNames(Scanner input) throws FileNotFoundException{
		int counter = 0;
		while (input.hasNextLine()) {
			String line1900 = input.nextLine();
			Scanner token1900 = new Scanner(line1900);
			int	rank1900 = token1900.nextInt();
			while (token1900.hasNext()){
				String maleName1900 = token1900.next();
				System.out.print(maleName1900 + " " + rank1900);
				Scanner data1910 = new Scanner(new File("C:/Users/wilbe/Desktop/BabyNames/1910.txt"));
				while (data1910.hasNextLine()) {
					String line1910 = data1910.nextLine();
					Scanner token1910 = new Scanner(line1910);
					int	rank1910 = token1910.nextInt();
					while (token1910.hasNext()) {
						String maleName1910 = token1910.next();
						if (maleName1910.equals(maleName1900)) {
							System.out.print(" " + rank1910);
							token1910.next();
						}else {
							counter++;
							token1910.next();
						}
					}
				}
				if (counter == 1000) {
					System.out.print(" 0");
				}
				counter = 0 ;
				Scanner data1920 = new Scanner(new File("C:/Users/wilbe/Desktop/BabyNames/1920.txt"));
				while (data1920.hasNextLine()) {
					String line1920 = data1920.nextLine();
					Scanner token1920 = new Scanner(line1920);
					int	rank1920 = token1920.nextInt();
					while (token1920.hasNext()) {
						String maleName1920 = token1920.next();
						if (maleName1920.equals(maleName1900)) {
							System.out.print(" " + rank1920);
							token1920.next();
						}else {
							counter++;
							token1920.next();
						}
					}
				}
				if (counter == 1000) {
					System.out.print(" 0");
				}
				counter = 0 ;
				Scanner data1930 = new Scanner(new File("C:/Users/wilbe/Desktop/BabyNames/1930.txt"));
				while (data1930.hasNextLine()) {
					String line1930 = data1930.nextLine();
					Scanner token1930 = new Scanner(line1930);
					int	rank1930 = token1930.nextInt();
					while (token1930.hasNext()) {
						String maleName1930 = token1930.next();
						if (maleName1930.equals(maleName1900)) {
							System.out.print(" " + rank1930);
							token1930.next();
						}else {
							counter++;
							token1930.next();
						}
					}
				}
				if (counter == 1000) {
					System.out.print(" 0");
				}
				counter = 0 ;
				Scanner data1940 = new Scanner(new File("C:/Users/wilbe/Desktop/BabyNames/1940.txt"));
				while (data1940.hasNextLine()) {
					String line1940 = data1940.nextLine();
					Scanner token1940 = new Scanner(line1940);
					int	rank1940 = token1940.nextInt();
					while (token1940.hasNext()) {
						String maleName1940 = token1940.next();
						if (maleName1940.equals(maleName1900)) {
							System.out.print(" " + rank1940);
							token1940.next();
						}else {
							counter++;
							token1940.next();
						}
					}
				}
				if (counter == 1000) {
					System.out.print(" 0");
				}
				counter = 0 ;
				Scanner data1950 = new Scanner(new File("C:/Users/wilbe/Desktop/BabyNames/1950.txt"));
				while (data1950.hasNextLine()) {
					String line1950 = data1950.nextLine();
					Scanner token1950 = new Scanner(line1950);
					int	rank1950 = token1950.nextInt();
					while (token1950.hasNext()) {
						String maleName1950 = token1950.next();
						if (maleName1950.equals(maleName1900)) {
							System.out.print(" " + rank1950);
							token1950.next();
						}else {
							counter++;
							token1950.next();
						}
					}
				}
				if (counter == 1000) {
					System.out.print(" 0");
				}
				counter = 0 ;
				Scanner data1960 = new Scanner(new File("C:/Users/wilbe/Desktop/BabyNames/1960.txt"));
				while (data1960.hasNextLine()) {
					String line1960 = data1960.nextLine();
					Scanner token1960 = new Scanner(line1960);
					int	rank1960 = token1960.nextInt();
					while (token1960.hasNext()) {
						String maleName1960 = token1960.next();
						if (maleName1960.equals(maleName1900)) {
							System.out.print(" " + rank1960);
							token1960.next();
						}else {
							counter++;
							token1960.next();
						}
					}
				}
				if (counter == 1000) {
					System.out.print(" 0");
				}
				counter = 0 ;
				Scanner data1970 = new Scanner(new File("C:/Users/wilbe/Desktop/BabyNames/1970.txt"));
				while (data1970.hasNextLine()) {
					String line1970 = data1970.nextLine();
					Scanner token1970 = new Scanner(line1970);
					int	rank1970 = token1970.nextInt();
					while (token1970.hasNext()) {
						String maleName1970 = token1970.next();
						if (maleName1970.equals(maleName1900)) {
							System.out.print(" " + rank1970);
							token1970.next();
						}else {
							counter++;
							token1970.next();
						}
					}
				}
				if (counter == 1000) {
					System.out.print(" 0");
				}
				counter = 0 ;
				Scanner data1980 = new Scanner(new File("C:/Users/wilbe/Desktop/BabyNames/1980.txt"));
				while (data1980.hasNextLine()) {
					String line1980 = data1980.nextLine();
					Scanner token1980 = new Scanner(line1980);
					int	rank1980 = token1980.nextInt();
					while (token1980.hasNext()) {
						String maleName1980 = token1980.next();
						if (maleName1980.equals(maleName1900)) {
							System.out.print(" " + rank1980);
							token1980.next();
						}else {
							counter++;
							token1980.next();
						}
					}
				}
				if (counter == 1000) {
					System.out.print(" 0");
				}
				counter = 0 ;
				Scanner data1990 = new Scanner(new File("C:/Users/wilbe/Desktop/BabyNames/1990.txt"));
				while (data1990.hasNextLine()) {
					String line1990 = data1990.nextLine();
					Scanner token1990 = new Scanner(line1990);
					int	rank1990 = token1990.nextInt();
					while (token1990.hasNext()) {
						String maleName1990 = token1990.next();
						if (maleName1990.equals(maleName1900)) {
							System.out.print(" " + rank1990);
							token1990.next();
						}else {
							counter++;
							token1990.next();
						}
					}
				}
				if (counter == 1000) {
					System.out.print(" 0");
				}
				counter = 0 ;
				Scanner data2000 = new Scanner(new File("C:/Users/wilbe/Desktop/BabyNames/2000.txt"));
				while (data2000.hasNextLine()) {
					String line2000 = data2000.nextLine();
					Scanner token2000 = new Scanner(line2000);
					int	rank2000 = token2000.nextInt();
					while (token2000.hasNext()) {
						String maleName2000 = token2000.next();
						if (maleName2000.equals(maleName1900)) {
							System.out.print(" " + rank2000);
							token2000.next();
						}else {
							counter++;
							token2000.next();
						}
					}
				}
				token1900.next();
				if (counter == 1000) {
					System.out.print(" 0");
				}
				counter = 0 ;
				
			}
			
			System.out.println();
		}
		Scanner data1910 = new Scanner(new File("C:/Users/wilbe/Desktop/BabyNames/1910.txt"));
		while (data1910.hasNextLine()) {
			String line1910 = data1910.nextLine();
			Scanner token1910 = new Scanner(line1910);
			int	rank1910 = token1910.nextInt();
			while (token1910.hasNext()){
				String maleName1910 = token1910.next();
				Scanner data1900 = new Scanner(new File("C:/Users/wilbe/Desktop/BabyNames/1910.txt"));
				while (data1900.hasNextLine()) {
					String line1900 = data1900.nextLine();
					Scanner token1900 = new Scanner(line1900);
					token1900.nextInt();
					while (token1900.hasNext()) {
						String maleName1900 = token1900.next();
						if (maleName1900.equals(maleName1910)) {
							token1910.next();
						}else {
							counter++;
							token1910.next();
						}
					}
				}
			}
		}
	}

}
