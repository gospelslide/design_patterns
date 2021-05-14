package factory;

public class OompaEnemy implements Enemy{
    
    public int getLevel() {
        return 1;
    }

    public String attackSound() {
        return "Hiyaaa!!";
    }

}