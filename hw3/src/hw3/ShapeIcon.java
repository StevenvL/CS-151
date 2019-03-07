package hw3;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
   An icon that contains a moveable shape.
*/
public class ShapeIcon implements Icon
{
   public ShapeIcon(int width, int height)
   {
      this.width = width;
      this.height = height;
   }
   
   public int getIconWidth()
   {
      return width;
   }

   public int getIconHeight()
   {
      return height;
   }

   public void paintIcon(Component c, Graphics g, int x, int y)
   {
      Graphics2D g2 = (Graphics2D) g;
      for(int i = 0; i < carGarage.size(); i++) {
    	  carGarage.get(i).draw(g2);
      }
   }
   
   public void addCar(CarShape addMe) {
	   carGarage.add(addMe);
   }
   
   public ArrayList<CarShape> getGarage() {
	   return carGarage;
   }

   private int width;
   private int height;
   private ArrayList<CarShape> carGarage = new ArrayList<>();
}


