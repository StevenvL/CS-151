import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Question1 {
	public static void main(String args[]) {
		JFrame frame = new JFrame("Question 1");
		ShapeIcon icon = new ShapeIcon(1000,1000);
		CarShape car = new CarShape(200,100,20);
		icon.addCar(car);
		JLabel label = new JLabel(icon);
		
	
		
		JButton zoomIn = new JButton("Zoom in");
		zoomIn.addActionListener(event -> {
			car.increaseSize();
			label.repaint();
		});
		JButton zoomOut = new JButton("Zoom out");
		zoomOut.addActionListener(event -> {
			car.decreaseSize();
			label.repaint();
		});
		
		
		frame.add(zoomIn);
		frame.add(zoomOut);
		
		frame.add(label);
		
		
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}
}
