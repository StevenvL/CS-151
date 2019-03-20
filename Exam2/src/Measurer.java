import java.util.ArrayList;

public interface Measurer {
	double measure(Object x);
	
	/**
	 * @param objectList is an arrayList containing Objects
	 * @param m is the Measurer being passed in so that it knows how to calculate the specific Object area
	 * @return the largest Object in the list
	 */
	public static Object maximum(ArrayList<Object> objectList, Measurer m) {
		Object largest = objectList.get(0);
		double largestSize = m.measure(largest);
		
		for(Object obj : objectList) {
			if(m.measure(obj) > largestSize) {
				largest = obj;
				largestSize = m.measure(largest);
			}
		}
		
		return largest;
	}
	
	
	/**
	 * @param objectList is an arrayList containing Object
	 * @param m is the Measurer being passed in so that it knows how to calculate the specific Object area
	 * @return the position of the largest Object in the list.
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
