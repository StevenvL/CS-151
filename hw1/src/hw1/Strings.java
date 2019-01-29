package hw1;

import java.util.*;

public class Strings {

	public static String uniqueLetters(String str) {
		String result = "";
		TreeSet<Character> dupes = new TreeSet<Character>();
		
		for(int i = 0; i < str.length(); i++) {
			for(int j = i+1; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j))
					dupes.add(str.charAt(i));	// If there is a dupe add it to the treeset.
			}
		}
		
		for(int i = 0; i<str.length(); i++) {	// If the treeset does not contain the current char of str, add to result.
			if(!dupes.contains(str.charAt(i)))
				result += str.charAt(i);
		}
		
		return result;
	}
	

	public static void main(String args[]) {
		Strings tester = new Strings();
		String[] testWords = {"harrasses", "mississippi", "missouri", "orinoco", "belinda", "barbara" };
		for(String s : testWords) {
			System.out.println(tester.uniqueLetters(s));
		}
	}
}
