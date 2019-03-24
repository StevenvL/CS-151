
public class HTMLFormatter implements InvoiceFormatter {

	//Returns a string that will be in the header1 type
	public String formatHeader() {
		total = 0;
		return "<html><h1> ~~~~~~~I N V O I C E~~~~~~~</h1>";
	}

	//Returns a string that should be emphasized with a breakline after it
	public String formatLineItem(LineItem item, int amountOfItems) {
		total += item.getPrice();
		String itemOnLine = item.toString() + ": $" + item.getPrice() + "  x" + amountOfItems;
		String htmlText = new String("<html><em>" + itemOnLine + "<br></em>");
		return htmlText;
	}

	
	//Returns a string that should be colored red, strong, and italicized
	public String formatFooter() {
		String footer = String.format("\n\nTOTAL DUE: $%.2f\n", total);
		String htmlText = new String("<html><br><br><br><font color='red'><strong><i>" + footer + "</i></strong></font></html>");
		return htmlText;
	}

	public void updateTotal(double amount) {
		total = amount;
	}

	private double total;
}