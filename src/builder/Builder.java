package builder;

public interface Builder<T> {
  T reset();
  void setSeats(int seats);
  void setEngine(String engine);
  void setTripComputer(String tripComputer);
  void setGPS(String gps);
}
