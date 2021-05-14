package abstract_factory;

public class Driver {
    public static void main(String[] args) {
        PizzaFactory pf = new MexicanPizzaFactory();
        MexicanPizza mehico = new MexicanPizza(pf.getBase(), pf.getCheese());
    }
}