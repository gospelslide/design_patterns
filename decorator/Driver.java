package decorator;

public class Driver {

    public static void main(String args[]) {
        // Config c = new IndiaLocationDecorator(new HindiLanguageDecorator(new ProductConfig()));
        Config c = new IndiaLocationDecorator(new ProductConfig());
        System.out.println(c.getConfig());
    }

}