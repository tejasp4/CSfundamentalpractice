import java.util.Hashtable; 

public class hashTable {
  public static void main(String[] args) {
    Hashtable<String, Integer> test = new Hashtable<String, Integer>();
    test.put("first", 1);
    test.put("second", 2);
    test.get("first");
    System.out.println(test.keySet());
    System.out.println(test);

  }
}
