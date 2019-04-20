import java.util.AbstractList;
import java.util.Comparator;

public class Pair<T> {
	public Pair() {
		first = null;
		second = null;
	}

	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}

	public T get(int n) {
		return n == 0 ? first : n == 1 ? second : null;
	}

	public void set(int n, T t) {
		if (n == 0)
			first = t;
		else if (n == 1)
			second = t;
	}

	public void copyFrom(Pair<? extends T> otherPair) {
		this.set(0, otherPair.get(0));
		this.set(1, otherPair.get(1));
	}
	
	public void copyTo(Pair<? super T> otherPair) {
		otherPair.set(0, this.get(0));
		otherPair.set(1, this.get(1));

	}
	
	public String toSting() {
		return this.get(0) + " " + this.get(1);
	}
	
	public T min(Comparator<? super T> comp)
	   {
	      if (comp.compare(first, second) < 0) 
	         return first; 
	      else 
	         return second;
	   }

	private T first;
	private T second;
}