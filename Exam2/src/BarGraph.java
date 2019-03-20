import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class BarGraph extends JFrame {
	RectangleIcon rectanglesIconList;
	JLabel label;
	
	public BarGraph() {
		JFrame barGraph = new JFrame("Bar Graph");
		Dimension preferedSize = new Dimension(400,400);
		int width = 27;
		
		rectanglesIconList = new RectangleIcon(400,400); //Creates an Icon holding all the rectangles. 
		label = new JLabel(rectanglesIconList);			 //Label holds the rectangleIconList and is the same size as frame
		label.setPreferredSize(preferedSize);
	
		//Creates the 7 rectangles on BarGraph frame
		Rectangle r1 = new Rectangle(width, 20, width, 0);
		Rectangle r2 = new Rectangle(width*2+25, 20, width, 10);
		Rectangle r3 = new Rectangle(width*3+50, 20, width, 20);
		Rectangle r4 = new Rectangle(width*4+75, 20, width, 30);
		Rectangle r5 = new Rectangle(width*5+100, 20, width, 40);
		Rectangle r6 = new Rectangle(width*6+125, 20, width, 50);
		Rectangle r7 = new Rectangle(width*7+150, 20, width, 60);
		
		rectanglesIconList.addRectangle(r1);
		rectanglesIconList.addRectangle(r2);
		rectanglesIconList.addRectangle(r3);
		rectanglesIconList.addRectangle(r4);
		rectanglesIconList.addRectangle(r5);
		rectanglesIconList.addRectangle(r6);
		rectanglesIconList.addRectangle(r7);
		
		barGraph.add(label);
		barGraph.setPreferredSize(preferedSize);
		barGraph.setLayout(new FlowLayout());
		barGraph.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		barGraph.pack();
		barGraph.setVisible(true);
	}
	
	public void setHeight(String height, int position) {
		rectanglesIconList.setHeight(height, position);
		label.repaint();
		
	}
}
