import java.math.BigDecimal;
import java.util.Comparator;

public class ContrivedComparator implements Comparator<BigDecimal>
{
   public int compare(BigDecimal a, BigDecimal b)
   {
      return a.precision() - b.precision();
   }
}