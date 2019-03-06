package hw3;

import java.awt.*;

import javax.swing.*;

public class Question1 {
	public static void main (String args[]) {
		JFrame frame = new JFrame("Question 1");
		Circle circle = new Circle(250,250);
		JLabel label = new JLabel(circle);
		
		JButton redButton = new JButton();
		redButton.setText("Red");
		redButton.addActionListener(event ->  {
			circle.setColor("Red");
			label.repaint();
		});
		
		JButton blueButton = new JButton();
		blueButton.setText("Blue");
		blueButton.addActionListener(event ->  {
			circle.setColor("Blue");
			label.repaint();
		});
		
		JButton greenButton = new JButton();
		greenButton.setText("Green");
		greenButton.addActionListener(event -> { 
			circle.setColor("Green");
			label.repaint();
		});
		
		
		frame.add(label);
		frame.add(redButton);
		frame.add(greenButton);
		frame.add(blueButton);
		
		frame.setLayout(new FlowLayout());
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
