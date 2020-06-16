/*
 * CS210 Chapter 8 Programming Project 1 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/03/09 - winter quarter
 *
 * This program obtains the numerator and the denominator of the rational number. Different methods were made to perform tasks to the object. 
 * Methods were created to perform the four basic operations (addition, subtraction, multiplication, and division). 
 */

public class RationalNumber {
	private int num;
	private int den;
	
	// This is the constructor for the rational numbers with the numerator and the denominator as parameters.
	public RationalNumber(int numerator, int denominator) {
		num = numerator;
		den = denominator;
	}
	// This is a constructor for the rational numbers with an empty parameter.
	public RationalNumber() {
		num = 0;
		den = 1;
	}
	
	// This accessor obtains the denominator of the rational number. An exception is made in case 0 is the denominator, which makes the rational number undefined.
	public int getDenominator() {
		if (den == 0) {
			throw new IllegalArgumentException();
		}
		return den;
	}
	// This accessor obtains the denominator of the rational number.
	public int getNumerator() {
		return num;
	}
	// This method changes the rational number to its simplest form.
	public void simplestForm() {
		int factor = 2; // Creates a counter for the factor to be used
		while (Math.abs(num) >= factor && Math.abs(den) >= factor) { // Conditional loop that continues until the factor is greater than the numerator and the denominator
			if (Math.abs(num) % factor == 0 && Math.abs(den) % factor == 0) { // Conditional statement that checks if the numerator or the denominator is divisible by the factor
				num /= factor; //Divide the numerator by the factor
				den /= factor; // Divide the denominator by the factor
				factor = 2; // Reset the factor to 2
			}else {
				factor++; // Add 1 to the factor
			}
		}
	}
	// Prints the values of the rational number 
	public String toString() {
		simplestForm(); // Calls the simplest form method to convert the rational number to simplest form
		if (den == 1) { // When the denominator is 1, it is dropped
			return "" + num;
		}else if (den < 0) { // When the denominator is negative, multiply the rational number by a factor of (-1/-1) to move the negative sign to the numerator
			return (num* -1) + "/" + (den * -1);
		}else{
			return num + "/" + den;
		}
	}
	// Adds the values of two rational numbers. Equation: a/b + c/d = (a*d + c*b) / b * d
	public void add(RationalNumber a) {
		this.num = this.getNumerator() * a.getDenominator(); // a*d
		a.num = a.getNumerator() * this.getDenominator(); // c*b
		this.den = this.getDenominator() * a.getDenominator(); // b*d
		this.num = this.getNumerator() + a.getNumerator(); // a*d + c*b
	}
	// Subtracts the values of two rational numbers. Equation: a/b + c/d = (a*d - c*b) / b * d
	public void subtract(RationalNumber a) {
		this.num = this.getNumerator() * a.getDenominator(); // a*d
		a.num = a.getNumerator() * this.getDenominator(); // c*b
		this.den = this.getDenominator() * a.getDenominator(); // b*d
		this.num = this.getNumerator() - a.getNumerator(); // a*d - c*b
	}
	// Multiplies the values of two rational numbers. Equation: a/b * c/d = a*c / b*d
	public void multiply (RationalNumber a) {
		this.num = this.getNumerator() * a.getNumerator(); //a*c
		this.den = this.getDenominator() *  a.getDenominator(); // b*d
	}
	// Divides the values of two rational numbers. Equation: (a/b) / (c/d) = (a*d) / (c*b)
	public void divide (RationalNumber a) {
		this.num = this.getNumerator() * a.getDenominator(); //a*d
		this.den = this.getDenominator() * a.getNumerator(); // c*b
	}
}
