import java.util.HashMap; 
import java.util.LinkedList;
//mainly using java's utility library for ease of use/practice without own implementation

public class hashTable {
  public static void main(String[] args) {
    HashMap<String, Integer> test = new HashMap<String, Integer>();
    test.put("cat", 1);
    test.put("tac", 3);
    test.put("dog", 2);
    System.out.println(test.keySet());
    System.out.println(test);
    System.out.println(test.values());

  }
}
