import java.util.Objects;

public class Point2
{
   private int x;
   private int y;
   public Point2(int x, int y) { this.x = x; this.y = y; }
   public String toString() { return getClass().getName() + "[x=" + x + ",y=" + y + "]"; }
   public int hashCode()
   {
      return Objects.hash(x,y);
   }
   
   public boolean equals(Object otherObject) {
	   	if(this == otherObject) return true;
	   	if(otherObject == null) return false;
	   	if(getClass() != otherObject.getClass()) return false;
	 	Point2 other = (Point2) otherObject;
	   	return(this.x == other.x && this.y == other.y);
	   
   }
}