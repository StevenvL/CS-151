import java.math.BigDecimal;

public class Prog2 {
	public static void main (String []args) {
		LabeledDecimal ld1 = new LabeledDecimal("pi", "3.14");
		LabeledDecimal ld2 = new LabeledDecimal("sqrt(2)", "1.414");
		Pair<LabeledDecimal> p1 = new Pair<LabeledDecimal>(ld1, ld2);
		Pair<BigDecimal> p2 = new Pair<BigDecimal>();
		p1.copyTo(p2);
		System.out.println(p2.toSting());
	}
}
