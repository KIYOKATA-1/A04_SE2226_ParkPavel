public class Firm implements Observer{
    private String name;

    public Firm(String name){
        this.name = name;
    }

    @Override
    public void update(Product product) {
        System.out.println("====} " + name + " Внимание " + product.getName() + " Минимальная Стоимость - $ " + product.getPrice());
    }
}
