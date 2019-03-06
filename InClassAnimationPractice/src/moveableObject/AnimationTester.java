package moveableObject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
   This program implements an animation that moves
   a car shape.
*/
public class AnimationTester
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      final BusShape shape
            = new BusShape(0, 0, BUS_WIDTH);

      ShapeIcon icon = new ShapeIcon(shape,
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
    	  if(shape.getXPos() == ICON_WIDTH) {
    		  shape.setX(0);
    	  }
            else
            	shape.move();
            	label.repaint();
         });
      t.start();
   }
   

   private static final int ICON_WIDTH = 300;
   private static final int ICON_HEIGHT = 200;
   private static final int BUS_WIDTH = 200;
}
