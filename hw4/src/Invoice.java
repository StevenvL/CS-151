import java.util.*;
import javax.swing.event.*;

/**
 * An invoice for a sale, consisting of line items.
 */
public class Invoice {
	/**
	 * Constructs a blank invoice.
	 */
	public Invoice() {
		items = new ArrayList<>();
		listeners = new ArrayList<>();
	}

	/**
	 * Adds an item to the invoice.
	 * 
	 * @param item
	 *            the item to add
	 */
	public void addItem(LineItem item) {
		items.add(item);
		// Notify all observers of the change to the invoice
		ChangeEvent event = new ChangeEvent(this);
		for (ChangeListener listener : listeners)
			listener.stateChanged(event);
	}

	/**
	 * Adds a change listener to the invoice.
	 * 
	 * @param listener
	 *            the change listener to add
	 */
	public void addChangeListener(ChangeListener listener) {
		listeners.add(listener);
	}

	/**
	 * Gets an iterator that iterates through the items.
	 * 
	 * @return an iterator for the items
	 */
	public Iterator<LineItem> getItems() {
		return new Iterator<LineItem>() {
			public boolean hasNext() {
				return current < items.size();
			}

			public LineItem next() {
				return items.get(current++);
			}

			public void remove() {
				throw new UnsupportedOperationException();
			}

			private int current = 0;
		};
	}

	/**
	 * @param formatter will determine how the text will look at the end result
	 * @return a string which will have all the information that will be displayed in the invoiceLabel
	 */
	public String format(InvoiceFormatter formatter) {
		String r = formatter.formatHeader();
		double total = 0;
		Iterator<LineItem> iter = getItems();
		
		
		//Uses a Hashmap to hold item, amountOfItems
		while (iter.hasNext()) {
			LineItem addMe = iter.next();
			total = total + addMe.getPrice();
			if (hMap.containsKey(addMe)) {
				hMap.put(addMe, Collections.frequency(items, addMe));
			} else
				hMap.put(addMe, 1);

		}
		for (LineItem item : hMap.keySet()) {
			r += formatter.formatLineItem(item, hMap.get(item));
		}
		formatter.updateTotal(total);
		return r + formatter.formatFooter();
	}

	private ArrayList<LineItem> items;
	private ArrayList<ChangeListener> listeners;
	private HashMap<LineItem, Integer> hMap = new HashMap<>();
}
