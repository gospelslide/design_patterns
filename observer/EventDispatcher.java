import java.util.ArrayList;
import java.util.Scanner;

public class EventDispatcher implements Observable {

    private String event;
    private ArrayList<Observer> subscribers = new ArrayList<Observer>();

    public String getEvent() {
        return this.event;
    }

    public String setEvent(String event) {
        this.event = event;
        return event;
    }

    public void add(Observer o) {
        subscribers.add(o);
    }

    public void notifySubscribers() {
        for (Observer o: subscribers) {
            o.update();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        EventDispatcher o = new EventDispatcher();
        Observer e1 = new EventListener(o);
        Observer e2 = new EventListener(o);
        o.add(e1);
        o.add(e2);
        while (true) {
            String event = sc.next();
            o.setEvent(event);
            o.notifySubscribers();
        }
    }
}