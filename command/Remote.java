package command;

public class Remote {
    
    CommandInterface c1,c2;

    Remote(CommandInterface c1, CommandInterface c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public void button1() {
        c1.execute();
    }

    public void button2() {
        c2.execute();
    }

    public void button3() {
        c2.unexecute();
    }

}