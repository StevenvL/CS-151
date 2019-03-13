import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class Question2 {
	public static void main(String args[]) {
		final int SIZE_MIN = 0;
		final int SIZE_MAX = 400;
		final int SIZE_INIT = 20;
		JSlider sizeModifier = new JSlider(JSlider.HORIZONTAL, SIZE_MIN, SIZE_MAX, SIZE_INIT);
		sizeModifier.setMajorTickSpacing(100);
		sizeModifier.setMinorTickSpacing(25);
		sizeModifier.setPaintTicks(true);
		sizeModifier.setPaintLabels(true);
		
		JFrame frame = new JFrame("Question 2");
		ShapeIcon icon = new ShapeIcon(1000, 1000);
		CarShape car = new CarShape(200, 100, 20);
		icon.addCar(car);
		JLabel label = new JLabel(icon);
		
		sizeModifier.addChangeListener(event -> {
			JSlider source = (JSlider)event.getSource();
			int size = (int)source.getValue();
			if (source.getValueIsAdjusting()) {
		        if (size != 0) {
		        	car.changeSize(size);
		        	label.repaint();
		        }
			}
		});
		

	
		frame.add(sizeModifier);

		frame.add(label);

		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}