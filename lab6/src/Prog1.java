import java.math.BigDecimal;

public class Prog1 {
	public static void main (String [] args) {
		Pair<BigDecimal> p1 = new Pair<BigDecimal>();
		System.out.println(p1.toSting());
		LabeledDecimal ld1 = new LabeledDecimal("pi", "3.14");
		LabeledDecimal ld2 = new LabeledDecimal("sqrt(2)", "1.414");
		Pair<LabeledDecimal> p2 = new Pair<LabeledDecimal>(ld1, ld2);
		p1.copyFrom(p2);
		System.out.println(p1.toSting());
	}
}
