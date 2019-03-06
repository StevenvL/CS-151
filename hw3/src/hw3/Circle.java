package hw3;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.Icon;

public class Circle implements Icon{
	private int width;
	private int height;
	private Color color;
	
	public Circle(int width, int height) {
		this.width = width;
		this.height = height;
		color = Color.RED;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double ellipse = new Ellipse2D.Double(0, 0, 200, 200);
		g2.setColor(color);
		g2.fill(ellipse);
		g2.draw(ellipse);
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return width;
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return height;
	}
	
	public void setColor(String changeTo) {
		if(changeTo.equalsIgnoreCase("RED"))
			color = Color.red;
		if(changeTo.equalsIgnoreCase("BLUE"))
			color = Color.blue;
		if(changeTo.equalsIgnoreCase("GREEN"))
			color = Color.green;
		
		
	}

}
