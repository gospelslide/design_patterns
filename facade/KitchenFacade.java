package facade;

public class KitchenFacade {
    public void slashVeggies() {
        LongKnife l = new LongKnife();
        l.chop();
    }

    public void chopVeggies() {
        ShortKnife s = new ShortKnife();
        s.chop();
    }

    public void pickupFood() {
        Spoon s = new Spoon(); 
        s.pickup();
    }
}