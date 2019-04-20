import java.math.BigDecimal;
import java.util.Comparator;

public class Prog3 {
	public static void main(String[] args) {
		LabeledDecimal ld1 = new LabeledDecimal("pi", "3.14");
		LabeledDecimal ld2 = new LabeledDecimal("sqrt(2)", "1.414");
		Comparator comp = new ContrivedComparator();
		System.out.println(comp.compare(ld1, ld2)); // not an error!
		Pair<LabeledDecimal> p2 = new Pair<LabeledDecimal>(ld1, ld2);
		System.out.println(p2.min(comp));
		
	}
}
