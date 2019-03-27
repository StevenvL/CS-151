
public abstract class PrintableTestShape implements Shape {
	void printInfo() {
		System.out.println(this.getClass().toString()
                + "\nResulting area: " + area()
                + "\nResulting perimeter: " + perimeter() + "\n");
	}
	
}
