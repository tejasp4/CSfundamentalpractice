public class runner {
  public static void main(String[] args) {
    Vehicle test = new Car("TestCar", 20);
    Car test2 = new Car("TestCar", 20);
    test.move(); // Example of compile time overloading, static typing brings us to the move inside of Car
    test.nameOfVehicle(); //Example of run time overriding, since the Dynamic type is Vehicle but the Static type is car, and the static method is called, it calls the vehicle
    //test.increaseHorsepower();
    test2.move();
    test2.nameOfVehicle();
    test2.increaseHorsepower();
  }
}
