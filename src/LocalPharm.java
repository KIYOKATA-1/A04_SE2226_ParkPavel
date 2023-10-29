public class LocalPharm implements Pharm{


    @Override
    public Product createProduct(String name, double price) {
        return new Medicine(name, price);
    }


}
