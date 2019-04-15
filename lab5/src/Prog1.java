import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

public class Prog1 {
	public static void main(String args[]) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Field[] fields = ArrayList.class.getDeclaredFields();
		for (Field f : fields) {
			if (Modifier.isStatic(f.getModifiers()))
				System.out.println("STATIC METHOD WITH FIELD: " + f.getName());
			else
				System.out.println("NOT STATIC METHOD WITH FIELD " + f.getName());
		}

		ArrayList<String> myList = new ArrayList<>();
		myList.add("Hello");
		myList.add("World");
		
		Class c = myList.getClass(); 
		Field f = c.getDeclaredField("size"); 
		f.setAccessible(true);
		System.out.println(f.get(myList));
		f.set(myList, 1000); 
		System.out.print(f.get(myList));
	}
}
