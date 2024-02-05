package director;

import builder.impl.CarBuilder;
import model.Car;

public class Director {
  public Director() {

  }
  public Car makeSUV(CarBuilder builder) {
    builder.reset();
    builder.setEngine("Toyota");
    builder.setSeats(2);
    builder.setGPS("GPS");
    builder.setTripComputer("200 Km");
    return builder.getResult();
  }
}
