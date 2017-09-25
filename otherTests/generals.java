import java.lang.Object;
public class generals {
  public static void main(String[] args) {
    Object[] test = new Object[3];
    test[0] = "LOL";
    test[1] = new int[]{1,2,3};
    test[2] = 1;
    System.out.println(test[0]);
    System.out.println(test[1]);
    System.out.println(test[2]);
    System.out.println(((int[]) test[1])[1]);
  }
}
