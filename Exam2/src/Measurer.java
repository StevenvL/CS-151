import java.util.ArrayList;

public interface Measurer {
	double measure(Object x);
	
	/**
	 * @param objectList is an arrayList containing rectangles
	 * @param m is the Measurer being passed in so that it knows to calculate the area of a rectangle
	 * @return the largest Rectangle Object in the list
	 */
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
	
	
	/**
	 * @param objectList is an arrayList containing rectangles
	 * @param m is the Measurer being passed in so that it knows to calculate the area of a rectangle
	 * @return the position of the largest Rectangle Object in the list.
	 */
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
	
}
