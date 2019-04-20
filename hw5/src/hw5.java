import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class hw5 {
	
	public static void dumpArray(Object[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main (String [] args) {
		Rectangle r1 = new Rectangle(10,20,10,20);
		Ellipse2D c1 = new Ellipse2D.Double(10,20,10,20);
		String s1 = "hello";
		int i1 = 500;
		Object[] arr = {r1, c1, s1, i1};
		dumpArray(arr);
	}
}
