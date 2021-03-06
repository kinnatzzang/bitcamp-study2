package com.eomcs.oop.ex05.x7;

public class Cartest2 {
  public static void main(String[] args) {
    Sedan sedan = new Sedan();
    testCar(sedan);

    System.out.println("----------------------");

    Truck truck = new Truck();
    testCar(truck);

    System.out.println("----------------------");

    SUV suv = new SUV();
    suv.active4wd(true);
    testCar(suv);
  }

  static void testCar(Car car) {
    car.start();
    car.run();
    car.stop();
  }
}