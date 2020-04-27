/**
 * 
 */
package shapes;

/**
 * @author Saniia
 *
 */
public class Circle extends Shape {

	private int radius;
	private Point center;

	/**
	 * Konstruktor fuer Objekte der Klasse Circle
	 */
	public Circle(int radius, Point center) {

		this.radius = radius;
		center = center;
	}

	/**
	 * Zeichnet den Kreis auf der Zeichenflaeche
	 */
	@Override
	public void draw() {
		// Kreisgleichung x^2 + y^2 = r^2
	}

	/**
	 * @ return (Circle-Objekt) Bewegt den Kreis um dx und dy
	 */
	@Override
	public Drawable move(int x, int y) {

		return Drawable;
	}

	/**
	 * @param color (Farbe des Kreises)
	 * @param solid (wenn true, dann wird die Flaeche komplett ausgefuellt) Zeichnet
	 *              den Kreis farbig, ggf. ausgefuellt, auf der Zeichenflaeche
	 */
	public void draw(java.awt.Color color, boolean solid) {
		if (solid == true)
			setColor(Color color);
	}

}
