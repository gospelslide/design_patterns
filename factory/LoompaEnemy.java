package factory;

public class LoompaEnemy implements Enemy {

    private int level = 2;

    public int getLevel() {
        return level;
    }

    public String attackSound() {
        return "Haishaaa!!";
    }

    public void setLevel(int level) {
        this.level = level;
    }

}