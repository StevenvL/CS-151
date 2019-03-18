import java.awt.Rectangle;

public class RectangleMeasurer implements Measurer {

	@Override
	public double measure(Object x) {
		double area = 0;
		Rectangle rect = (Rectangle) x;
		area = rect.getHeight() * rect.getWidth();
		return area;
	}
}
