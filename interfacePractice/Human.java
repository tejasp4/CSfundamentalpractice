public class Human implements CalculationAbility {
    String name;

    public Human(String nameInput) {
      this.name = nameInput;
    }
    public int math1(int x, int y){
      return x + y;
    }
    public int math2(int x, int y) {
      return x*y;
    }
  }
