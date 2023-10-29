import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrder() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(i + 1 + ". " + products.get(i).getName() + " - $" + products.get(i).getPrice());
        }
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
