package hw3;

import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Question2 {
	public static void main (String args[]) {
		
		final int DELAY = 1000;
		ActionListener listener = event -> System.out.println("Hello, World");
		Timer t = new Timer(DELAY, listener);
		t.start();
	}
}
