/*
 * CS210 Chapter X Exercise Y 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/03/09 - winter quarter
 *
 * This program 
 */

public class RationalNumberMain {

	public static void main(String[] args) {
		RationalNumber a = new RationalNumber(3, 1);
		RationalNumber b = new RationalNumber (2, 3);
		System.out.println(a.getNumerator());
		//System.out.println(a.getDenominator());
		//System.out.println(a.toString());
		//a.add(b);
		//System.out.println(a.toString());
		//a.subtract(b);
		//System.out.println(a.toString());
		a.multiply(b);
		System.out.println(a.toString());
	}

}
