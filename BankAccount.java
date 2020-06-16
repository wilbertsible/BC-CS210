/*
 * CS210 Chapter 8 Exercise 13
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/07 - winter quarter
 *
 * This program creates a class called BankAccount that has the object deposit and withdraw to do those actions into the account. 
 * For the exercise, the object transfer was created to transfer funds from one account to another with a transfer fee. 
 * If the user transfers more than the account balance, if there is enough to pay for the transfer fee, the transfer fee will be deducted and
 * the remaining balance will be transfered.  
 */

public class BankAccount {
	String name;
	double balance;
	double transctionFee;
	
	public BankAccount(String accountName) {
		name = accountName;
	}
	public void deposit (double amount) {
		balance = balance + amount;
	}
	public void withdraw (double amount) {
		double transactionFee = 0.00;
		boolean negative = balance <= amount + transactionFee;
		if (!negative) {
			balance = balance - amount - transactionFee;
		}else {
			System.out.println("You do not have enough balance in your account.");
		}
	} 
	
	// This method transfers funds from one account to another
	public void transfer (BankAccount name, double amount) {
		double transactionFee = 5.00;
		boolean negative = balance < amount + transactionFee;
		if (amount >0) { // Takes care of negative amount
			if (!negative) { // If there is enough amount in the account do a normal withdraw and deposit
				this.withdraw(amount + transactionFee);
				name.deposit(amount);
			}else if (negative && balance > transactionFee) { // If there is enough amount to pay for the transfer fee subtract the transfer fee and move the whole balance
				this.withdraw(balance + transactionFee);
				name.deposit(balance - transactionFee);
				balance = 0;
			} // else, do nothing
		}
	}
	public String toString() {
		return "(" + name + " " + balance + ")";
	}
}
