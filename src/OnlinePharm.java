public class OnlinePharm implements Pharm{

    @Override
    public Product createProduct(String name, double price) {
        return new Vitaminchik(name, price);
    }
}
