/*
 * CS210 Chapter X Exercise Y 
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/01/07 - winter quarter
 *
 * This program 
 */


public class PointMain {

	public static void main(String[] args) {
		Point p1 = new Point(10, 10);
		Point p2 = new Point(10, 10);
		Point p3 = new Point(10, 10);
		System.out.println(p1);
		//double slope = p1.slope(p2);
		//System.out.println(slope);
		//p1.flip();
		//System.out.println(p1);
		boolean line = p3.isCollinear(p1, p2);
		System.out.println(line);
		
		
		
	}
}
