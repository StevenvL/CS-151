import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InputFrame extends JFrame{
	public InputFrame() {
		JFrame inputFrame = new JFrame("Input Frame");
		BarGraph barGraph = new BarGraph();
		Dimension preferedSize = new Dimension(400,400);	//Dimensions for the 2 JFrames
		
		//Creates the 7 textfields
		JTextField f1 = new JTextField();
		JTextField f2 = new JTextField();
		JTextField f3 = new JTextField();
		JTextField f4 = new JTextField();
		JTextField f5 = new JTextField();
		JTextField f6 = new JTextField();
		JTextField f7 = new JTextField();
		
		JLabel instructions = new JLabel("Change numbers below and press enter");
		inputFrame.add(instructions);
		
		Dimension textsize = new Dimension(390,20);		//Dimensions of the 7 text bars
		f1.setPreferredSize(textsize);
		f2.setPreferredSize(textsize);
		f3.setPreferredSize(textsize);
		f4.setPreferredSize(textsize);
		f5.setPreferredSize(textsize);
		f6.setPreferredSize(textsize);
		f7.setPreferredSize(textsize);
		
		inputFrame.add(f1);
		inputFrame.add(f2);
		inputFrame.add(f3);
		inputFrame.add(f4);
		inputFrame.add(f5);
		inputFrame.add(f6);
		inputFrame.add(f7);
		
		//Each textfield updates when the user presses enter
		//It will read each textfield, update the height of the rectangle and repaint so that it matches the text
		f1.addActionListener(event ->  {
			barGraph.setHeight(f1.getText(), 0);
			
		});
		f2.addActionListener(event ->  {
			barGraph.setHeight(f2.getText(), 1);
			
		});
		f3.addActionListener(event ->  {
			barGraph.setHeight(f3.getText(), 2);
		
		});
		f4.addActionListener(event ->  {
			barGraph.setHeight(f4.getText(), 3);
			
		});
		f5.addActionListener(event ->  {
			barGraph.setHeight(f5.getText(), 4);
			
		});
		f6.addActionListener(event ->  {
			barGraph.setHeight(f6.getText(), 5);
			
		});
		f7.addActionListener(event ->  {
			barGraph.setHeight(f7.getText(), 6);
			
		});
		
	
		inputFrame.setLocationRelativeTo(barGraph);
		inputFrame.setPreferredSize(preferedSize);
		inputFrame.setLayout(new FlowLayout());
		inputFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inputFrame.pack();
		inputFrame.setVisible(true);
	}
	
	
}
