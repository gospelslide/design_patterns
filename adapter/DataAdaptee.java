package adapter;

import java.util.HashMap;

public class DataAdaptee {
    
    public HashMap<String, String> getConfig() {
        HashMap<String, String> config = new HashMap<>();
        config.put("MAX_PROCESS", "8");
        config.put("DB_URL", "mysql://a:b@c.com/abcd");
        config.put("CACHE_TIME", "86400");
        return config;
    }

}