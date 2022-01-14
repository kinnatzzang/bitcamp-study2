package com.eomcs.oop.ex05.x7;

public class SUV extends Car{
  boolean enabled4wd; 
  boolean active4wd;


  @Override
  public void run() {
    if (enabled4wd) {
      System.out.println("강력파워모드작동!");
    } else {
      System.out.println("걍달려!");
    }
  }

  public void active4wd(boolean enable) {
    this.enabled4wd = enable;
  }
}