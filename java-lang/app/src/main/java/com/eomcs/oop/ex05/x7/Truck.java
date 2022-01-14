package com.eomcs.oop.ex05.x7;

public class Truck extends Car{
  int weight;

  @Override 
  public void run() {
    // 기존에 이미 있는 메서드를 호출한다.
    this.go();
  }

  @Override
  public void start() {
    this.stopping();
  }

  public void launch() {
    System.out.println("시동걸어!");
  }



  public void stopping() {
    System.out.println("시동꺼!");
  }

  public void go() {
    System.out.println("달려라!");
  }
  public void dump() {
    System.out.println("짐내려!");
  }

}
