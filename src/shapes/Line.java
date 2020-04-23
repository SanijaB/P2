/**
 * 
 */
package shapes;

/**
 * @author Saniia
 *
 */
public class Line extends Polygon {

	/**
	 * @param1
	  */
	int x1;
	int y1;
	Point p1 = new Point (x1,y1);
	
	/**
	 * @param2
	  */
	int x2;
	int y2;
	Point p2 = new Point (x2,y2);
	
	public Line(Point p1, Point p2) {
		this.p1=p1;
		this.p2=p2;
	}

}
