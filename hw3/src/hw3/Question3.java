package hw3;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;


public class Question3 {
	public static void main (String args[]) {
		      JFrame frame = new JFrame();
		      CarShape carGarage[] = new CarShape[3];
		      
		     // final CarShape shape
		        //    = new CarShape(0, 0, CAR_WIDTH);
		      
		      for(int i = 0; i<carGarage.length-1; i++) {
		    	  carGarage[i] = new CarShape(0,CAR_WIDTH*i, CAR_WIDTH);
		      }
		      
		      
		      ShapeIcon icon = new ShapeIcon(carGarage[0],
		            ICON_WIDTH, ICON_HEIGHT);

		      final JLabel label = new JLabel(icon);
		      frame.setLayout(new FlowLayout());
		      frame.add(label);

		      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.pack();
		      frame.setVisible(true);

		      final int DELAY = 10;
		      // Milliseconds between timer ticks
		      Timer t = new Timer(DELAY, event ->
		      {
		    	  if(carGarage[0].getXPos() == ICON_WIDTH) {
		    		  carGarage[0].setX(0);
		    	  }
		            else
		            	carGarage[0].move();
		            	label.repaint();
		         });
		      t.start();
		   }
		   

		   private static final int ICON_WIDTH = 500;
		   private static final int ICON_HEIGHT = 200;
		   private static final int CAR_WIDTH = 200;
		}
