/*
 * CS210 Chapter X Exercise Y 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/07 - winter quarter
 *
 * This program 
 */

public class BankMain {
	public static void main (String[] args) {
		BankAccount ben = new BankAccount("Ben");
		ben.deposit(90.00);;
		BankAccount mar = new BankAccount("Hal");
		mar.deposit(25.00);
		ben.transfer(mar,  20.00);
		System.out.print(ben.toString());
		System.out.println(mar.toString());
		ben.transfer(mar,  10.00);
		System.out.print(ben.toString());
		System.out.println(mar.toString());
		ben.transfer(mar,  -1);
		System.out.print(ben.toString());
		System.out.println(mar.toString());
		mar.transfer(ben,  39.00);
		System.out.print(ben.toString());
		System.out.println(mar.toString());
		mar.transfer(ben,  50.00);
		System.out.print(ben.toString());
		System.out.println(mar.toString());
		mar.transfer(ben,  1.00);
		System.out.print(ben.toString());
		System.out.println(mar.toString());
		ben.transfer(mar,  88.00);
		System.out.print(ben.toString());
		System.out.println(mar.toString());
		ben.transfer(mar,  1.00);
		System.out.print(ben.toString());
		System.out.println(mar.toString());
		
	}
}
