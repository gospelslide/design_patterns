package facade;

public class Driver {

    public static void main(String[] args) {
        KitchenFacade kf = new KitchenFacade();
        kf.slashVeggies();
        kf.chopVeggies();
        kf.pickupFood();
    }

}