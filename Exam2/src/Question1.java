import java.awt.Rectangle;
import java.util.ArrayList;

public class Question1 {
	
	
	public static void main (String args[]) {
		ArrayList<Object> rectList = new ArrayList<>();
		RectangleMeasurer rectMeasurer = new RectangleMeasurer();
		
		for(int i = 0; i < 10; i++) {	//Sets up the arraylist with increasing size of rectangles.
			rectList.add(new Rectangle(10*i,20*i));
		}
		rectList.add(new Rectangle(2000,3000));	//Adds the largest Rectangle at the end. This should be the result returned.
	
		
		Rectangle largestRectangle = (Rectangle) Measurer.maximum(rectList, rectMeasurer);
		int largestPos = Measurer.maximumPos(rectList,rectMeasurer);
		
		String largest = "Largest rectangle is at position " + largestPos + " with " 
											+ largestRectangle.getWidth() + " width and " 
											+ largestRectangle.getHeight() + " height";
		System.out.println(largest);
		}
	
}
