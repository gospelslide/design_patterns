package abstract_factory;

public class MexicanPizzaFactory implements PizzaFactory {

    public Cheese getCheese() {
        return new CheddarCheese();
    }

    public Base getBase() {
        return new PestoBase();
    }
    
}