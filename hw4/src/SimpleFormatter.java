/**
   A simple invoice formatter.
*/
public class SimpleFormatter implements InvoiceFormatter
{
   public String formatHeader()
   {
      total = 0;
      return "     I N V O I C E\n\n\n";
   }

   public String formatLineItem(LineItem item, int amountOfItems)
   {
      total += item.getPrice();
      return (item.toString() + ": $" + item.getPrice() + "  x" + amountOfItems + "\n");
   }

   public String formatFooter()
   {
      return (String.format("\n\nTOTAL DUE: $%.2f\n", total));
   }
   
   public void updateTotal(double amount) {
	   total = total + amount;
   }

   private double total;
}
