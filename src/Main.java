public class Main {
    public static void main(String[] args) {
        PharmHealth store = new PharmHealth();

        Pharm localPharmacy = new LocalPharm();
        Pharm onlinePharmacy = new OnlinePharm();

        Observer firm1 = new Firm("AMIR-D");
        Observer firm2 = new Firm("Bayer");

        store.setPharm(localPharmacy);
        store.addObserver(firm1);
        store.addProduct("Aspirin", 5.99);

        store.setPharm(onlinePharmacy);
        store.addObserver(firm2);
        store.addProduct("Vitamin C", 3.49);
    }
}