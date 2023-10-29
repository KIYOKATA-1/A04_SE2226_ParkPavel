import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PharmHealth store = new PharmHealth();

        Pharm localPharmacy = new LocalPharm();
        Pharm onlinePharmacy = new OnlinePharm();

        Observer firm1 = new Firm("AMIR-D");
        Observer firm2 = new Firm("Bayer");

        store.setPharmacy(localPharmacy);
        store.addObserver(firm1);

        Product product1 = new Medicine("Aspirin", 5.99);
        Product product2 = new Vitaminchik("Vitamin C", 3.49);

        store.addProductToMenu(product1);
        store.addProductToMenu(product2);

        boolean shopping = true;

        while (shopping) {
            store.displayMenu();
            System.out.println("Введите цифру препората который хотели бы заказать (0 - в случае завершения");
            int choice = scanner.nextInt();

            if (choice == 0) {
                shopping = false;
            } else {
                store.addToOrder(choice);
            }
        }

        System.out.println("Детали Заказа:");
        store.displayOrder();
        System.out.println("Thank you for your order!");
    }
    }