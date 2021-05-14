package builder;

public class CarBuilder {
    
    protected Car car;

    public void setupCar() {
        Car c = new Car();
        this.car = c;
    }

    public void addPaint(String paint) {
        this.car.setPaint(paint);
    }

    public void addWheels(String wheels) {
        this.car.setWheels(wheels);
    }

    public void addSeats(String seats) {
        this.car.setSeats(seats);
    }

    public Car getFinal() {
        return this.car;
    }

}