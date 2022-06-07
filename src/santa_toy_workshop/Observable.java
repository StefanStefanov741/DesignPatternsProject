package santa_toy_workshop;

public interface Observable {
    void subscribe(Observer observer);
    void unsubscribe (Observer observer);
    void notifyObservers();
    String getUpdate();
}
