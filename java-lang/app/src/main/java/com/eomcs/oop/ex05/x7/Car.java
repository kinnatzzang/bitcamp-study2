package com.eomcs.oop.ex05.x7;

public abstract class Car {
  int valve;
  int cc;

  public void start() {
    System.out.println("시동걸어!");
  }

  public void stop() {
    System.out.println("멈춰멈춰!");
  }

  public abstract void run(); 

}

