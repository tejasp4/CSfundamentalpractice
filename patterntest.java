import java.util.regex.*;

public class patterntest {
	public static void test() {
		Pattern P = Pattern.compile("\\w* \\w*. \\d*/\\d*/\\d*, \\w*");
		Matcher M = P.matcher("11111b");
		String[] pattern = new String[]{"Tejas Priyadarshan, 12/12/1997, Male", "Rohith K, 8/2/1997, Male", "Viraj T", "Tejas P1"};
		for (String s : pattern) {
			Matcher mp = P.matcher(s);
			System.out.println(mp.matches());
		}
	}
	public static void main(String[] args) {
		test();
	}
}