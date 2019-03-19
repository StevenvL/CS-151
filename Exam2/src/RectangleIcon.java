

import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;

import javax.swing.Icon;

public class RectangleIcon implements Icon{
	private int width;
	private int height;
	private ArrayList<Rectangle> rectList = new ArrayList<>();
	private Color color;
	
	public RectangleIcon(int width, int height) {
		this.width = width;
		this.height = height;
		color = Color.BLUE;
	}

	
	/* 
	 * Creates the rectangle, filling it in with blue color as well as displaying the height of the rectangle above it.
	 */
	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2 = (Graphics2D) g;
		 for(int i = 0; i < rectList.size(); i++) {
			 g2.setColor(color);
			 g2.fill(rectList.get(i));
			 g2.setColor(Color.BLACK);
			 g2.drawString(String.valueOf(rectList.get(i).getHeight())
					 , (int)rectList.get(i).getX(), 
					 (int)rectList.get(i).getMinY());
			 
		 }
	}

	@Override
	public int getIconWidth() {
		return width;
	}

	@Override
	public int getIconHeight() {
		return height;
	}
	
	public void addRectangle(Rectangle rect) {
		rectList.add(rect);
	}
	

	public void setHeight(String s, int pos) {
		int heightSize = Integer.parseInt(s);
		int width = 30;
		Dimension sizeOf = new Dimension(width,heightSize);
		rectList.get(pos).setSize(sizeOf);
	}
	
	public Rectangle getRectangle(int pos) {
		return rectList.get(pos);
	}
	
	public ArrayList<Rectangle> getList() {
		return rectList;
	}

}
