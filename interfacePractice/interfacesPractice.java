class interfacesPractice {
  public static void main(String[] args) {
    Human human = new Human("test");
    Human human2 = new Human("test2");
    int x = 1;
    int y = 2;
    System.out.println(human2.name);
    System.out.println(human2.math1(x,y));
    System.out.println(human.name);
    System.out.println(human.math1(x,y));
  }
}
