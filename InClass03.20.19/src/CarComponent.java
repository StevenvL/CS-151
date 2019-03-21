import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;

/**
 * A component that shows a car.
 */
public class CarComponent extends JComponent {
	public CarComponent(int numberOfCars) {
		carList = new ArrayList<>();
		for (int i = 0; i < numberOfCars; i++) {
			carList.add(new CarShape(50, 50 * i, 25));
		}
		addMouseListener(new MousePressedListener());
		addMouseMotionListener(new MouseDraggedListener());
	}

	private class MousePressedListener extends MouseAdapter {
		public void mousePressed(MouseEvent event) {
			boolean hasPoint = false;
			mousePoint = event.getPoint();
			for (CarShape carType : carList) {
				if (carType.contains(mousePoint))
					hasPoint = true;
			}
			if (hasPoint == true)
				return;
			else
				mousePoint = null;
		}
	}

	private class MouseDraggedListener extends MouseMotionAdapter {
		public void mouseDragged(MouseEvent event) {
			if (mousePoint == null)
				return;

			Point lastMousePoint = mousePoint;
			mousePoint = event.getPoint();
			double dx = mousePoint.getX() - lastMousePoint.getX();
			double dy = mousePoint.getY() - lastMousePoint.getY();
			for (CarShape car : carList) {
				if (car.contains(mousePoint)) {
					car.translate((int) dx, (int) dy);
					repaint();
				}
			}
		}
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		for (CarShape carType : carList) {
			carType.draw(g2);
		}
	}

	private Point mousePoint;
	private ArrayList<CarShape> carList;
}
