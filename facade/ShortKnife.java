package facade;

public class ShortKnife implements Knife {
    @Override
    public void chop() {
        System.out.println("Chop chop!");
    }
}