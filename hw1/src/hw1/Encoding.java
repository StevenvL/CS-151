package hw1;

import java.util.*;

public class Encoding {
	static Set<String> storage;
	public Encoding() {
		storage = new TreeSet<>();
	}

	public static Set<String> morseCodes(int m, int n) {
		Set<String> result = new TreeSet<>();
		String dot = ".";
		String dash = "-";
		String start = "";
		
		for(int i = 0; i < m; i++) {
			start += dot;
		}
		for(int i = 0; i < n ; i++) {
			start += dash;
		}
		
		permutationHelper(start,"");
		result = storage;
		return result;
	}
	
	public static void permutationHelper(String remainder, String soFar) {
		if(remainder.isEmpty()) {
			storage.add(soFar);
		}
		else {
			for(int i = 0; i<remainder.length(); i++) {
				String letter = String.valueOf(remainder.charAt(i));
				String prefix = remainder.substring(0, i  );
				String suffix = remainder.substring(i+1);
				permutationHelper(prefix+suffix, soFar + letter);
			}
		}
	}
	
	public static void main (String args[]) {
		Encoding tester = new Encoding();
		tester.morseCodes(2, 1);
		for(String s : storage) {
			System.out.println(s);
		}
	}
}
