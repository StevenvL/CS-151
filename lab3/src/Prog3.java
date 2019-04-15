public class Prog3
{
   public static void main(String[] args)
   {
      LabeledPoint p1 = new LabeledPoint(3, 4, "Fred");
      LabeledPoint p2 = new LabeledPoint(3, 4, "Wilma");
      Point p3 = new Point(3, 4);
      System.out.println(p1.equals(p3));
      System.out.println(p3.equals(p1));
      System.out.println(p1.equals(p2));
   }
}