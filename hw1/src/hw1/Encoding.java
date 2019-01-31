package hw1;

import java.util.*;

public class Encoding {

	public static Set<String> morseCodes(int m, int n) {
		
		String dot = ".";
		String dash = "-";
		String start = "";
		
		for(int i = 0; i < m; i++) {
			start += dot;
		}
		for(int i = 0; i < n ; i++) {
			start += dash;
		}
		
		Set<String> storage = new TreeSet<>();
		permutationHelper(start,"", storage);
		return  storage;
	
	}
	
	public static void permutationHelper(String remainder, String soFar, Set<String> collector) {
		if(remainder.isEmpty()) {
			collector.add(soFar);
		}
		else {
			for(int i = 0; i<remainder.length(); i++) {
				String letter = String.valueOf(remainder.charAt(i));
				String prefix = remainder.substring(0, i  );
				String suffix = remainder.substring(i+1);
				permutationHelper(prefix+suffix, soFar + letter, collector);
			}
		}
	}
	
	public static void main (String args[]) {
		
		Set<String> result = Encoding.morseCodes(2, 1);
		for(String s : result) {
			System.out.println(s);
		}
	}
}
