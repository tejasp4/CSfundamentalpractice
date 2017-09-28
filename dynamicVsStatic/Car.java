public class Car extends Vehicle{
  String nameCar;
  int horsepowerCar;
  public Car(String name, int horsepower) {
    this.name = name;
    this.horsepower = horsepower;
  }
  public void move() {
    System.out.println("the car drives");
  }
  public static void nameOfVehicle() {
    System.out.println("This is a car");
  }
  public void increaseHorsepower() {
    System.out.println("vroom!");
  }
}
