import java.lang.reflect.Array;

public class Prog2 {
	public static Object grow(Object[] a, int newLength) throws Exception
	{
	   Object newArray = Array.newInstance(a[0].getClass(), newLength);
	   for (int i = 0; i < Math.min(a.length, newLength); i++)
	      Array.set(newArray, i, a[i]);
	   return newArray;
	}
	
	public static void main (String args[]) throws Exception {
		String[] words = "Mary had a little lamb".split(" ");
		String[] moreWords = (String[]) grow(words, 10);
		System.out.println(moreWords.length);
		System.out.println(moreWords[0].length());
	}
}
