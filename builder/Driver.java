package builder;

public class Driver {
    public static void main(String[] args) {
        CarBuilder cb = new CarBuilder();
        cb.setupCar();
        cb.addPaint("Blue");
        cb.addWheels("High bouncy");
        cb.addSeats("No seats");
        Car c = cb.getFinal();
    }
}