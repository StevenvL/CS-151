import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class hw5 {
	
	public static <T>void dumpArray(T[] arr) {
		for(T objToPrint : arr) {
			System.out.println(objToPrint);
		}
	}
	
	public static void main (String [] args) {
		Rectangle r1 = new Rectangle(10,20,10,20);
		Ellipse2D c1 = new Ellipse2D.Double(10,20,10,20);
		String s1 = "hello";
		int i1 = 500;
		Point p1 = new Point(500,200);
		
		Object[] arr = {r1,c1,s1,i1,p1};
		dumpArray(arr);
	}
}
