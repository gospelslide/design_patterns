package decorator;
import java.util.HashMap;

public class ProductConfig extends Config {

    public HashMap<String, String> getConfig() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Product_Name", "Uber");
        map.put("Product_Version", "1.0.2");
        map.put("Product_Language", "EN");
        return map;
    }

}