


import java.awt.*;
import java.awt.geom.*;
import java.util.*;

/**
   A car that can be moved around.
*/
public class CarShape implements MoveableShape
{
   /**
      Constructs a car item.
      @param x the left of the bounding rectangle
      @param y the top of the bounding rectangle
      @param width the width of the bounding rectangle
      @param moveSpeed is how many pixels the car moves per timer delay
   */
   public CarShape(int x, int y, int width)
   {
      this.x = x;
      this.y = y;
      this.width = width;
      
   }

   public void move()
   {
      x += moveSpeed;
   }

   public void draw(Graphics2D g2)
   {
	  
      Rectangle2D.Double body
            = new Rectangle2D.Double(x, y + width / 6, 
                  width - 1, width / 6);
      Ellipse2D.Double frontTire
            = new Ellipse2D.Double(x + width / 6, y + width / 3, 
                  width / 6, width / 6);
      Ellipse2D.Double rearTire
            = new Ellipse2D.Double(x + width * 2 / 3, y + width / 3,
                  width / 6, width / 6);

      // The bottom of the front windshield
      Point2D.Double r1
            = new Point2D.Double(x + width / 6, y + width / 6);
      // The front of the roof
      Point2D.Double r2
            = new Point2D.Double(x + width / 3, y);
      // The rear of the roof
      Point2D.Double r3
            = new Point2D.Double(x + width * 2 / 3, y);
      // The bottom of the rear windshield
      Point2D.Double r4
            = new Point2D.Double(x + width * 5 / 6, y + width / 6);
      Line2D.Double frontWindshield
            = new Line2D.Double(r1, r2);
      Line2D.Double roofTop
            = new Line2D.Double(r2, r3);
      Line2D.Double rearWindshield
            = new Line2D.Double(r3, r4);
      
      g2.draw(body);
      g2.draw(frontTire);
      g2.draw(rearTire);
      g2.draw(frontWindshield);
      g2.draw(roofTop);
      g2.draw(rearWindshield);
      g2.setPaint(Color.RED);
      g2.fill(body);
   }
   
   public int getXPos() {
	   return x;
   }
   
   public void setX(int x) {
	   this.x = x;
   }
   
   public void increaseSize() {
	   width = width*2;
   }
   
   public void decreaseSize() {
	   width = width/2;
   }
   
   public void changeSize(int sizeModifier) {
	   width = sizeModifier;
   }
   
   private int x;
   private int y;
   private int width;
   private int moveSpeed;
}
