import java.util.*;

class CheckPermutation {
	/** Given two Strings write a method to decide if one is a permutation of another. */

	public static boolean checkPermutationFunction(String one, String two) {
		if (one.length() != two.length()) {
			return false;
		}

		HashMap<Character, Integer> originalMappings = new HashMap<>();
		HashMap<Character, Integer> secondMappings = new HashMap<>();
		StringBuffer bufferOne = new StringBuffer(one);
		StringBuffer bufferTwo = new StringBuffer(two);

		for (int i = 0; i < bufferOne.length(); i++) {
			if (originalMappings.containsKey(bufferOne.charAt(i))) {
				int ogValue = originalMappings.get(bufferOne.charAt(i));
				originalMappings.put(bufferOne.charAt(i), ogValue++);
			} else {
				originalMappings.put(bufferOne.charAt(i), 1);
			}
			

		}

		for (int i = 0; i < bufferTwo.length(); i++) {
			if (secondMappings.containsKey(bufferTwo.charAt(i))) {
				int ogValue = secondMappings.get(bufferTwo.charAt(i));
				secondMappings.put(bufferTwo.charAt(i), ogValue++);
			} else {
				secondMappings.put(bufferTwo.charAt(i), 1);
			}
			
		}

		return originalMappings.keySet().equals(secondMappings.keySet());

	}


	public static void main(String[] args) {


		String[] testOne = new String[]{"abc", "bca"};
		String[] testTwo = new String[]{"tejas", "tejass"};
		System.out.println(checkPermutationFunction(testOne[0], testOne[1]));
		System.out.println(checkPermutationFunction(testTwo[0], testTwo[1]));
	 	
	 } 
	
}