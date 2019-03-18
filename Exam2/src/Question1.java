import java.awt.Rectangle;
import java.util.ArrayList;

public class Question1 {
	
	public static Object maximum(ArrayList<Object> objectList, Measurer m) {
		Object largest = objectList.get(0);
		double largestSize = m.measure(largest);
		
		for(Object rect : objectList) {
			if(m.measure(rect) > largestSize) {
				largest = rect;
				largestSize = m.measure(largest);
			}
		}
		
		return largest;
	}
	
	public static int maximumPos(ArrayList<Object> objectList, Measurer m) {
		Object largest = objectList.get(0);
		double largestSize = m.measure(largest);
		int pos = 0;
		
		for(int i = 0; i < objectList.size(); i++) {
			if(m.measure(objectList.get(i)) > largestSize) {
				largest = objectList.get(i);
				largestSize = m.measure(largest);
				pos = i;
			}
		}
		
		return pos;
	}
	
	public static void main (String args[]) {
		ArrayList<Object> rectList = new ArrayList<>();
		RectangleMeasurer rectMeasurer = new RectangleMeasurer();
		
		for(int i = 0; i < 10; i++) {
			rectList.add(new Rectangle(10*i,20*i));
		}
		rectList.add(new Rectangle(2000,3000));
	
		
		Rectangle largestRectangle = (Rectangle) maximum(rectList, rectMeasurer);
		int pos = maximumPos(rectList,rectMeasurer);
		
		String largest = "Largest rectangle is at position " + pos + " with " + largestRectangle.getWidth() + " width and "
																+ largestRectangle.getHeight() + " height";
		System.out.println(largest);
		}
	
}
