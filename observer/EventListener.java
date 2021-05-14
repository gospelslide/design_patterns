public class EventListener implements Observer {
    private EventDispatcher o;

    public EventListener(EventDispatcher o) {
        this.o = o;
    }

    public void update() {
        String event = o.getEvent();
        System.out.println("Received event - " + event); 
    }

}