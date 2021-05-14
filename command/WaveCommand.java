package command;

public class WaveCommand implements CommandInterface {

    Robot r;

    public WaveCommand(Robot r) {
        this.r = r;
    }
    
    @Override
    public void execute() {
        r.raiseHand();
        r.moveFingers();
    }

    @Override
    public void unexecute() {
        r.moveHandDown();
    }

}