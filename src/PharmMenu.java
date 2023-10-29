import java.util.ArrayList;
import java.util.List;
public class PharmMenu {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(i + 1 + ". " + products.get(i).getName() + " - $" + products.get(i).getPrice());
        }
    }

    public Product getProduct(int index) {
        if (index >= 0 && index < products.size()) {
            return products.get(index);
        }
        return null;
    }
}

