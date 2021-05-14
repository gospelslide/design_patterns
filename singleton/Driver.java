package singleton;

public class Driver {
    
    public static void main(String[] args) {
        Channel ch = Channel.getChannelInstance();
        ch.sendMessage("Chitthi aai hai!");
    }
}