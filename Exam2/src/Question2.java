import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Question2 {
	public static void main (String args[]) {
		Dimension preferedSize = new Dimension(400,400);	//Dimensions for the 2 JFrames
		Dimension textsize = new Dimension(390,20);			//Dimensions of the 7 text bars
		int width = 27;										//Starting width of each rectangle before being multiplied by a constant
		
		RectangleIcon rectanglesIconList = new RectangleIcon(400,400);	//Creates an Icon holding all the rectangles. 
																		//Same size as the frame
		JFrame frame1 = new JFrame("Part 1");
		JFrame frame2 = new JFrame("Part 2");
		JLabel label = new JLabel(rectanglesIconList);			//Label holds the rectangleIconList and is the same size as frame
		label.setPreferredSize(preferedSize);
	
		
		//Creates the 7 textfields
		JTextField f1 = new JTextField();
		JTextField f2 = new JTextField();
		JTextField f3 = new JTextField();
		JTextField f4 = new JTextField();
		JTextField f5 = new JTextField();
		JTextField f6 = new JTextField();
		JTextField f7 = new JTextField();
		
		//Creates the 7 rectangles on frame 2
		Rectangle r1 = new Rectangle(width, 10, width, 0);
		Rectangle r2 = new Rectangle(width*2+25, 10, width, 10);
		Rectangle r3 = new Rectangle(width*3+50, 10, width, 20);
		Rectangle r4 = new Rectangle(width*4+75, 10, width, 30);
		Rectangle r5 = new Rectangle(width*5+100, 10, width, 40);
		Rectangle r6 = new Rectangle(width*6+125, 10, width, 50);
		Rectangle r7 = new Rectangle(width*7+150, 10, width, 60);
		
		//Adds the 7 rectangles to the rectangleIconList
		rectanglesIconList.addRectangle(r1);
		rectanglesIconList.addRectangle(r2);
		rectanglesIconList.addRectangle(r3);
		rectanglesIconList.addRectangle(r4);
		rectanglesIconList.addRectangle(r5);
		rectanglesIconList.addRectangle(r6);
		rectanglesIconList.addRectangle(r7);
		
		
		//Sets the size of each textfiled to the preferedSize of textsize
		f1.setPreferredSize(textsize);
		f2.setPreferredSize(textsize);
		f3.setPreferredSize(textsize);
		f4.setPreferredSize(textsize);
		f5.setPreferredSize(textsize);
		f6.setPreferredSize(textsize);
		f7.setPreferredSize(textsize);
		
		//Each textfield updates when the user presses enter
		//It will read each textfield, update the height of the rectangle and repaint so that it matches the text
		f1.addActionListener(event ->  {
			rectanglesIconList.setHeight(f1.getText(), 0);
			label.repaint();
		});
		f2.addActionListener(event ->  {
			rectanglesIconList.setHeight(f2.getText(), 1);
			label.repaint();
		});
		f3.addActionListener(event ->  {
			rectanglesIconList.setHeight(f3.getText(), 2);
			label.repaint();
		});
		f4.addActionListener(event ->  {
			rectanglesIconList.setHeight(f4.getText(), 3);
			label.repaint();
		});
		f5.addActionListener(event ->  {
			rectanglesIconList.setHeight(f5.getText(), 4);
			label.repaint();
		});
		f6.addActionListener(event ->  {
			rectanglesIconList.setHeight(f6.getText(), 5);
			label.repaint();
		});
		f7.addActionListener(event ->  {
			rectanglesIconList.setHeight(f7.getText(), 6);
			label.repaint();
		});
		
		JLabel instructions = new JLabel("Change numbers below and press enter");
		frame1.add(instructions);
		
		
		//Adds all the textfields to the frame
		frame1.add(f1);
		frame1.add(f2);
		frame1.add(f3);
		frame1.add(f4);
		frame1.add(f5);
		frame1.add(f6);
		frame1.add(f7);
		
		frame1.setPreferredSize(preferedSize);
		frame1.setLayout(new FlowLayout());
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.pack();
		frame1.setVisible(true);
		
		frame2.setLocationRelativeTo(frame1);
		frame2.add(label);
		frame2.setPreferredSize(preferedSize);
		frame2.setLayout(new FlowLayout());
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.pack();
		frame2.setVisible(true);
	}
}
