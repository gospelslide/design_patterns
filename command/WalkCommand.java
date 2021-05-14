package command;

public class WalkCommand implements CommandInterface {
    
    Robot r;

    public WalkCommand(Robot r) {
        this.r = r;
    }
    
    @Override
    public void execute() {
        r.walkFrontStep();
    }

    @Override
    public void unexecute() {
        r.walkBackStep();
    }

}