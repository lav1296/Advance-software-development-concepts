import java.util.ArrayList;
import java.util.Iterator;

public class AsteroidImpacts implements ISubject{
    private ArrayList<IObserver> observers;

    private ArrayList<IObserver> buildings;
    AsteroidImpacts(){

        observers=new ArrayList<>();
        buildings=new ArrayList<>();
    }
    @Override
    public void attach(IObserver observer) {
        observers.add(observer);

    }

    @Override
    public void detach(IObserver observer) {
        observers.remove(observer);
    }
    public void notifyObservers(){
        for (int i = 0; i < observers.size(); i++)
        {
            IObserver observer = observers.get(i);
            //calling update to impact all observers
            observer.update();
        }
    }
    //this method removes all buildings from observers after shield is spawned
    @Override
    public void detachAllBuildings() {
        for (IObserver building : buildings){
            observers.remove(building);
        }
    }

    //this method adds all buildings to the observerlist after shield is destroyed
    @Override
    public void attachAllBuildings() {
        for (IObserver building : buildings){
            observers.add(building);
        }
    }

    //this method adds building to the building list after it is spawaned
    @Override
    public void addBuilding(IObserver observer) {
        buildings.add(observer);
    }

    //this method removes building from the building list after building is destroyed
    @Override
    public void removeBuilding(IObserver observer) {
        buildings.remove(observer);

    }
}
