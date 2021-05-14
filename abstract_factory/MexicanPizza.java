package abstract_factory;

public class MexicanPizza {
    
    public MexicanPizza(Base b, Cheese c) {
        System.out.println(b.getBase());
        System.out.println(c.getCheese());
    }

}