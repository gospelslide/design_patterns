package strategy;

public class Bowler {

    BowlingStrategy bowling;

    public Bowler(BowlingStrategy bowling) {
        this.bowling = bowling;
    }

    public void bowl() {
        bowling.bowl();
    }

}