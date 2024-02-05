package builder;

public class Car {
  public Car() {

  }

  int seat;
  String engine;
  String stripComputer;
  String GPS;

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
