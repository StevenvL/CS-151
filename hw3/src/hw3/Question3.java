

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;


public class Question3 {
	public static void main (String args[]) {
		      JFrame frame = new JFrame("Freeway Simulator");
		      ShapeIcon icon = new ShapeIcon(ICON_WIDTH, ICON_HEIGHT);	//Creates an icon that will hold all the cars.
		      
		      for(int i = 0; i < 50; i++) {	//Adds 50 cars to icon which is store in an arraylist called garage.
		    	  icon.addCar(new CarShape(0,i*CAR_WIDTH, CAR_WIDTH, i+1)); //Each car moves at varying speeds.
		    	  
		      }
	
		     ArrayList<CarShape> garage = icon.getGarage();
		      

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
		    	  for(int i = 0; i < garage.size(); i++) {
		    	  if(garage.get(i).getXPos() > ICON_WIDTH) {
		    		  garage.get(i).setX(0);
		    	  }
		            else
		            	garage.get(i).move();
		            	label.repaint();
		    	  }
		         });
		      t.start();
		   }
		   

		   private static final int ICON_WIDTH = 1000;
		   private static final int ICON_HEIGHT = 1600;
		   private static final int CAR_WIDTH = 20;
 		}
