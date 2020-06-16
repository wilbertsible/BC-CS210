/*
 * CS210 Chapter 8 Exercise 2, 5, 6
 * Wilbert Lim Sible
 * wilbert.sible@bellevuecollege.edu
 * 2018/03/07 - winter quarter
 *
 * This program creates a mutator flip wherein the x and y coordinates are switched and their signs negated. 
 */

public class Point {
	private int x;
	private int y;

	public Point(int initialX, int initialY) {
		this.x = initialX;
		this.y = initialY;
	}
	/*public void translate(int dx, int dy) {
		x += dx;
		y += dy;
	}
	public double distance(Point other) {
		int dx = x-other.x;
		int dy = y-other.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
	public double distanceFromOrigin() {
		return Math.sqrt(x * x + y * y);
	}*/
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	//Exercise 2: This is a method called flip() that flips the x and y values. This means that x becomes -y and y becomes -x
	public void flip() {
	    int temp = x; //
	    x = y*-1;
	    y = temp*-1;
	}
	/* Exercise 5: This is a method called slope() that returns a double which is the slope of two points in a plane. The slope of a line 
	 * can be solved using the equation (y2-y1) / (x2-x1). One important thing to note is that if x2 = x1, then the slope will be undefined.
	 * Therefore, an exception was used to represent this possible error.
	 */
	public double slope(Point other) {
		if (x == other.x) {
			throw new IllegalArgumentException();
		}
		return ((double) y - other.y)/(x-other.x);
	}
	/* Exercise 6: This is a method called isCollinear with 2 parameters Point p1 and Point p2. Given a third point with x and y values, 
	 * it is collinear to points p1 and p2 if p3 can be found within the line formed by p1 and p2. To test this, the formula y = mx + b 
	 * must be obtained first, where m is the slope and b is the y-intercept. Exercise 5 already provided for the slope of the line. 
	 * To obtain the y-intercept, the equation y - mx = b can be used. The x and y value can be obtained from either p1 or p2. Then the 
	 * x and y values of p3 can then be inserted in the liner equation to solve whether the point lies in the line formed by p1 and p2. 
	 * The problem suggested that a rounding off to 4 digits is enough to ensure the accuracy of the test. Lastly, the problem also stated that
	 * if the three points have the same x and y value, then the p3 is collinear with p2. 
	 * 
	 */
	
	public boolean isCollinear(Point p1, Point p2) {
		 if (p1.x == p2.x && p2.x == x && x == p1.x && p1.y == p2.y && p2.y == y && y == p1.y){ // Condition that if the values of p3 is euqal to p2 and p1
	        return true;
	    }
		double m = p1.slope(p2); 
		double b = p1.y - m * p1.x;
		if (y == (Math.round(m * x + b)*1000.0000)/1000.0000) { // Rounds of to the nearest 4 decimal places
			return true;
		}else {
			return false;
		}
	}
}
