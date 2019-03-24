
public class HTMLFormatter implements InvoiceFormatter {

	public String formatHeader() {
		total = 0;
		return "<html><body style='width: 200px; padding: 5px;'>"
        + "<h1>~~~~~~~~~~I N V O I C E~~~~~~~~~~</h1>";
	}

	public String formatLineItem(LineItem item, int amountOfItems) {
		total += item.getPrice();
		return (item.toString() + ": $" + item.getPrice() + "  x" + amountOfItems + "\n");
		/*
		String title = "<html><body style='width: 200px; padding: 5px;'>"
                + "<h1>Do U C Me?</h1>"
                + "Here is a long string that will wrap.  "
                + "The effect we want is a multi-line label.";
		
		return title;
		*/
	}

	public String formatFooter() {
		return (String.format("\n\nTOTAL DUE: $%.2f\n", total));
	}

	public void updateTotal(double amount) {
		total = amount;
	}

	private double total;
}