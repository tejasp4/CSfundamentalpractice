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
	public static void main(String[] args) {
		
	}
}