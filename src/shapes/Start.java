/**
 * 
 */
package shapes;

import java.util.ArrayList;
import java.util.List;

import teaching.WhiteBoard;
/**
 * @author Saniia
 *
 */
public class Start {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Polygon test
		Polygon test = new Polygon();
		Point a = new Point(2,3);
		Point b = new Point(4,6);
		Point c = new Point(2,8);
		Point d = new Point(4,7);
		Point e = new Point(2,6);
		Point f = new Point(7,1);
		List<Point> pointOfPolygon = new ArrayList<Point>();
		pointOfPolygon.add(a);
		pointOfPolygon.add(b);
		pointOfPolygon.add(c);
		pointOfPolygon.add(d);
		pointOfPolygon.add(e);
		pointOfPolygon.add(f);
	    test.setPoints(pointOfPolygon);
	    test.draw();
	    
		//Circle test
		Point k = new Point(2,1);
		Circle circleK = new Circle(3,k);
		circleK.draw();
	}
	
		
		
	

}
