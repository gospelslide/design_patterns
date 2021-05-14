package decorator;

import java.util.HashMap;

public class HindiLanguageDecorator extends ConfigDecorator {

    Config c;

    public HindiLanguageDecorator(Config c) {
        this.c = c;
    }

    public HashMap<String, String> getConfig() {
        return this.c.getConfig().replace("Product_Language", "HI");
    }

}