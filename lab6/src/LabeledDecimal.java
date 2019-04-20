import java.math.*;

public class LabeledDecimal extends BigDecimal
{
   public LabeledDecimal(String label, String digits)
   {
      super(digits);
      this.label = label;
   }

   public String getLabel() { return label; }
   public String toString() { return label + "=" + super.toString(); }

   private String label;
}