//An interface for subjects to implement so they can attach the observers
public interface ISubject {

    public void attach(IObserver observer);
    public void detach (IObserver observer);
    public void notifyObservers();

    public void detachAllBuildings();
    public void attachAllBuildings();
    public void addBuilding(IObserver observer);
    public void removeBuilding(IObserver observer);
}
