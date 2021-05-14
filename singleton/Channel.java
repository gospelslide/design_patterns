package singleton;

public class Channel {
        
    private static Channel instance;

    private Channel() {}

    public static Channel getChannelInstance() {
        if (instance == null) {
            instance = new Channel();
        }
        return instance;
    }

    public void sendMessage(String mss) {
        System.out.println("Broadcast message to all subscribers-" + mss);
    }
    
}