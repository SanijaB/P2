package shapes;

import java.util.ArrayList;
import java.util.List;
import teaching.WhiteBoard;

public class Figure implements Drawable {

	public static List<Drawable> shapes = new ArrayList<Drawable>();
	public Figure() {
		
	}
	
	public Figure addShape (Drawable drawable) {
		shapes.add(drawable);
		return null;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub	
	}

	@Override
	public Drawable move(int x, int y) {
		return null;
	}
	
	public static Figure snowMan() {
		return null;
	}

}
