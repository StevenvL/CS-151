

import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Question2 {
	public static void main (String args[]) {
		//Delay of 1 seconds and prints "Hello, World" every second.
		final int DELAY = 1000;
		ActionListener listener = event -> System.out.println("Hello, World");
		Timer t = new Timer(DELAY, listener);
		t.start();
	}
}
