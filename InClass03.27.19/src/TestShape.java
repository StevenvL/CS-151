public class TestShape {
	public static void main(String[] args) {

		// Rectangle test
		double width = 5, length = 7;
		PrintableTestShape rectangle = new Rectangle(width, length);
		rectangle.printInfo();

		// Circle test
		double radius = 5;
		PrintableTestShape circle = new Circle(radius);
		circle.printInfo();

		// Triangle test
		double a = 5, b = 3, c = 4;
		PrintableTestShape triangle = new Triangle(a, b, c);
		triangle.printInfo();

	}
}
