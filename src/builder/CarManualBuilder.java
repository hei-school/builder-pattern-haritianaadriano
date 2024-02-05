package builder;

public class CarManualBuilder implements Builder<CarManual> {
  public CarManualBuilder() {

  }

  private CarManual thisCarManual;

  @Override
  public CarManual reset() {
    return thisCarManual = new CarManual();
  }

  @Override
  public void setSeats(int seats) {
    thisCarManual.seat = seats;
  }

  @Override
  public void setEngine(String engine) {
    thisCarManual.engine = engine;
  }

  @Override
  public void setTripComputer(String tripComputer) {
    thisCarManual.stripComputer = tripComputer;
  }

  @Override
  public void setGPS(String gps) {
    thisCarManual.GPS = gps;
  }

  public CarManual getResult() {
    return this.thisCarManual;
  }
}
