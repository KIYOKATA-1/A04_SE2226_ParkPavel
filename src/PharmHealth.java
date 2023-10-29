import java.util.ArrayList;
import java.util.List;
public class PharmHealth {
    private List<Observer> observers = new ArrayList<>();
    private Pharm pharm;

    public void setPharm(Pharm pharm){
        this.pharm = pharm;
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void addProduct(String name, double price){
        Product product = pharm.createProduct(name,price);
        notifyObservers(product);
    }

    private void notifyObservers(Product product) {
        for (Observer observer : observers) {
            observer.update(product);
        }
    }
}
