package strategy;

public class Driver {

    public static void main(String args[]) {
        BowlingStrategy bowling = new SpinBowling();
        Bowler bowler = new Bowler(bowling);
        bowler.bowl();
    }
}