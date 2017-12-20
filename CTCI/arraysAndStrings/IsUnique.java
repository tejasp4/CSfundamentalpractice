import java.lang.StringBuffer;
import java.util.HashSet;
class IsUnique {

	public static boolean checkIsUnique(String word) {
		StringBuffer buffer = new StringBuffer(word);
		HashSet<Character> library = new HashSet<>();
		for (int index = 0; index < buffer.length(); index++) {
			if (!library.contains(buffer.charAt(index))) {
				library.add(buffer.charAt(index));
			} else {
				return false;
			}
		}
		return true;


	}
	public static void main(String[] args) {
		String testString = "abcdefg";
		String testString2 = "aaaaa";
		System.out.println(checkIsUnique(testString));
		System.out.println(checkIsUnique(testString2));
	}
	
}