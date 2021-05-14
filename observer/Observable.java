public interface Observable {
    public void add(Observer o);
    public void notifySubscribers();
}