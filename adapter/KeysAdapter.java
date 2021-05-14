package adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KeysAdapter implements ClientInterface {
 
    private DataAdaptee adaptee;

    public KeysAdapter(DataAdaptee d) {
        this.adaptee = d;
    }

    @Override
    public ArrayList<String> getKeys() {
        HashMap<String, String> config = this.adaptee.getConfig();
        ArrayList<String> keys = new ArrayList<>();
        config.forEach((key, value) -> keys.add(key));
        return keys;
    }
}