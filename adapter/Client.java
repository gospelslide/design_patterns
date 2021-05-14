package adapter;

public class Client {
    public static void main(String args[]) {
        ClientInterface ci = new KeysAdapter(new DataAdaptee());
        System.out.println(ci.getKeys());
    }
}