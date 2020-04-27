/**
 * 
 */
package shapes;

/**
 * @author Saniia
 *
 */
public class Polygon extends Shape {

	java.util.ArrayList<Point> points;

	/**
	 * Konstruktor fuer Objekte der Klasse Polygon
	 */
	public Polygon() {

	}

	/**
	 * Zeichnet das Polygon auf das Whiteboard.
	 */
	@Override
	public void draw() {
		getWhiteboard().removeShape(representation);
		setPoints(points);
		getWhiteboard().drawPolygon(x, y);

	}

	/**
	 * Bewegt das Polygon um dx und dy.
	 */
	@Override
	public Polygon move(int x, int y) {
		return polygon;
	}

	/**
	 * Setzt die Eckpunkte des Polygons
	 */
	public void setPoints(java.util.ArrayList<Point> points) {
		this.points = points;
	}

	/**
	 * @return nicht veraenderbare Liste der Punkte Zugriff auf die Punkte der Form.
	 */
	public java.util.ArrayList<Point> getPoints() {
		return points;
	}

}
