public interface Subject {
    void registerObserver(observer observer);

     void removeObserver(observer observer);

     void notifyObservers();
}
