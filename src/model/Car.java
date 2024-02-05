package model;

public class Car {
  public Car() {

  }

  public int seat;
  public String engine;
  public String stripComputer;
  public String GPS;

  @Override
  public String toString() {
    return "Car{" +
        "seat=" + seat +
        ", engine='" + engine + '\'' +
        ", stripComputer='" + stripComputer + '\'' +
        ", GPS='" + GPS + '\'' +
        '}';
  }
}
