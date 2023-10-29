import java.util.ArrayList;
import java.util.List;



public class PharmHealth {
    private List<Observer> observers = new ArrayList<>();
    private Pharm pharmacy;
    private PharmMenu menu = new PharmMenu();
    private Order order = new Order();

    public void setPharmacy(Pharm pharmacy) {
        this.pharmacy = pharmacy;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void addProductToMenu(Product product) {
        menu.addProduct(product);
    }

    public void displayMenu() {
        menu.displayMenu();
    }

    public void addToOrder(int index) {
        Product product = menu.getProduct(index - 1);
        if (product != null) {
            order.addProduct(product);
            notifyObservers(product);
        } else {
            System.out.println("Ошибка Выбора Медикамента.");
        }
    }

    public void displayOrder() {
        order.displayOrder();
        System.out.println("Общая Сумма: $" + order.getTotalPrice());
    }

    private void notifyObservers(Product product) {
        for (Observer observer : observers) {
            observer.update(product);
        }
    }
}
