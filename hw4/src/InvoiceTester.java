import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
   A program that tests the invoice classes.
*/
public class InvoiceTester
{
   public static void main(String[] args)
   {
      final Invoice invoice = new Invoice();
      final InvoiceFormatter formatter = new SimpleFormatter();
      final InvoiceFormatter HTMLFormatter = new HTMLFormatter();
 
      String title = "<html><body style='width: 200px; padding: 5px;'>"
              + "<h1>Steven Luu, Homework 4</h1>"
              + "Here is my basic attempt at HTML";
      
      JLabel titleLabel = new JLabel();
	  Dimension preferredSizeForTitle = new Dimension(200, 100);
	  titleLabel.setPreferredSize(preferredSizeForTitle);
	  titleLabel.setText(title);
	  
	  JLabel invoiceLabel = new JLabel();
	  Dimension preferredSize = new Dimension (200,300);
	  invoiceLabel.setPreferredSize(preferredSize);
	  

      // When the invoice changes, update the text area
      invoice.addChangeListener(event -> {
    	 invoiceLabel.setText(invoice.format(HTMLFormatter));
      });
    

      // Add line items to a combo box
      final JComboBox combo = new JComboBox();
      Product hammer = new Product("Hammer", 19.95);
      Product nails = new Product("Assorted nails", 9.95);
      combo.addItem(hammer);		//Adds Hammer as an choice.
      Bundle bundle = new Bundle();
      bundle.add(hammer);		//Adds Hammer to bundle
      bundle.add(nails);		//Adds nails to bundle
      combo.addItem(new DiscountedItem(bundle, 10)); 	//Adds the combo as a choice.

      // Make a button for adding the currently selected
      // item to the invoice
      JButton addButton = new JButton("Add");
      addButton.addActionListener(event ->
         {
        	LineItem itemChoosen = (LineItem) combo.getSelectedItem();
        	invoice.addItem(itemChoosen);
         });

      // Put the combo box and the add button into a panel
      JPanel panel = new JPanel();
      panel.add(combo);
      panel.add(addButton);

      // Add the text area and panel to the frame
      JFrame frame = new JFrame();
      frame.add(titleLabel, BorderLayout.NORTH);
      frame.add(new JScrollPane(invoiceLabel), BorderLayout.CENTER);
      frame.add(panel, BorderLayout.SOUTH);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
   }
}
