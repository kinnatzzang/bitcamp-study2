package com.eomcs.oop.ex05.x6;

public class Sedan extends Car{
  boolean auto;
  boolean openedSunroof;

  @Override
  public void run() {
    System.out.println("달려달려!");
  }
  public void openSunroof() {
    System.out.println("썬루프열어!");
    this.openedSunroof = true;
  }
  public void closeSunroof() {
    System.out.println("썬루프닫아!");
    this.openedSunroof = false;
  }

}

