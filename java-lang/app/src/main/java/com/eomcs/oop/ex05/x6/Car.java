package com.eomcs.oop.ex05.x6;

public abstract class Car {
  int cc;
  int valve;

  public void start() {
    System.out.println("치리릭!");
  }
  public void stop() {
    System.out.println("멈춰멈춰!");
  }

  public abstract void run();
}
