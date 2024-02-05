package builder.impl;

import builder.Builder;
import model.Car;

public class CarBuilder implements Builder<Car> {
  public CarBuilder() {

  }

  private Car thisCar;

  @Override
  public Car reset() {
    return thisCar = new Car();
  }

  @Override
  public void setSeats(int seats) {
    thisCar.seat = seats;
  }

  @Override
  public void setEngine(String engine) {
    thisCar.engine = engine;
  }

  @Override
  public void setTripComputer(String tripComputer) {
    thisCar.stripComputer = tripComputer;
  }

  @Override
  public void setGPS(String gps) {
    thisCar.GPS = gps;
  }

  public Car getResult() {
    return this.thisCar;
  }
}
