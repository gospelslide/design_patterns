package builder;

public class Car {
    
    private String paint, seats, wheels;

    public void setPaint(String paint) {
        this.paint = paint;
        System.out.println("Paint-" + paint); 
    }

    public void setSeats(String seats) {
        this.seats = seats;
        System.out.println("Seats-" + seats); 
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
        System.out.println("Wheels-" + wheels); 
    }
}