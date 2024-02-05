package builder;

public class Main {
  public static void main(String[] args) {
    Director director = new Director();
    CarBuilder carBuilder = new CarBuilder();
    director.makeSUV(carBuilder);
    Car car = carBuilder.getResult();
    System.out.println(car.toString());
  }
}
