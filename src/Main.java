public class Main {
    public static final int SHOP_MAN = 3;

    public static void main(String[] args) {
        final Seller dealer = new Seller();
        for (int i = 1; i <= SHOP_MAN; i++) {
            new Thread(null, dealer::sellCar, "Покупатель " + i).start();
        }
        new Thread(null, dealer::receiveCar, "Производитель").start();
    }
}