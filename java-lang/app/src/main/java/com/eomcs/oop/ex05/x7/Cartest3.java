package com.eomcs.oop.ex05.x7;

public class Cartest3 {
  public static void main(String[] args) {
    Sedan sedan = new Sedan();
    SnowChain snowchain = new SnowChain(sedan);
    testCar(snowchain);

    System.out.println("-------------------------");

    Truck truck = new Truck();
    BlackBox blackBox = new BlackBox(truck);
    testCar(blackBox);

    System.out.println("-------------------------");

    SUV suv = new SUV();
    SnowChain snowchainSuv = new SnowChain(suv);
    BlackBox blackBoxSuv = new BlackBox(snowchainSuv);
    testCar(blackBoxSuv);
  }

  static void testCar(Car car) {
    car.start();
    car.run();
    car.stop();
  }
}