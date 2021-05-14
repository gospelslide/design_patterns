package decorator;

import java.util.HashMap;

public class IndiaLocationDecorator extends ConfigDecorator {

    Config c;

    public IndiaLocationDecorator(Config c) {
        this.c = c;
    }

    public HashMap<String, String> getConfig() {
        return this.c.getConfig();
    }
}