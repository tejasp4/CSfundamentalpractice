import java.util.*;
public class alstringbuilder {

	/** Implement an algorithm to determine if a string has all unique characters */
	public static boolean isUnique(String word) {
		HashMap<char, Integer> seen = new HashMap<>();
		for (char character : word.toCharArray()) {
			if (seen.containsKey(character)) {
				return false;
			} else {
				seen.put(character, 1);
			}
		}
		return true;
	}

	/** Given two strings write a method to decide if one is a permutation of the other */ 
	public static boolean checkPermutation(String first, String second) {
		if (first.length != second.length){
			return false;
		}
		Arrays.sort(first.toCharArray());
		Arrays.sort(second.toCharArray());
		for (int i = 0; i < first.length; i++) {
			if (first.toCharArray()[i] != second.toCharArray()[i]) {
				return false;
			} else {
				continue;
			}
		}
		return true;
	}

	/** Write a method to replace all spaces in a string with '%20' */ 
	public static String URLify(String input) {
		char[] ca = input.toCharArray();
		for (int i = 0; i < ca.length; i++) {
			if (ca[i] != " ") {
				continue;
			} else {
				//work on later
			}
		}

	}

	/** Check palindrome */
	public static boolean palindrome(String word) {
		boolean odd;
		if (word.length % 2 == 0) {
			odd = false;
		} else {
			odd = true;
		}
		for ()
	}

	/** One away: Check if string has a character added, inserted, or removed*/ 
	public static boolean oneAway(String before, String after) {
		if (before.length != after.length) {
			if (before.length + 1 == after.length ||
				before.length - 1 == after.legnth) {
				
			} else {
				return false;
			}
		} else {

		}
	}
	public static void main(String[] args) {
		
	}
}