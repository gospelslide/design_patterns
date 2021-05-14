package command;

public class Driver {

    public static void main(String[] args) {
        Remote r = new Remote(new WaveCommand(new Robot()), new WalkCommand(new Robot())); // cam use abstract factory here
        r.button1();
        r.button2();
        r.button3();
    }

}