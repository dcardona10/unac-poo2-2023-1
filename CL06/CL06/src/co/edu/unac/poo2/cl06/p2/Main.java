package co.edu.unac.poo2.cl06.p2;

public class Main {
    public static void main(String[] args) {
        Bag bag = new Bag();
        Purchase purchase = new Purchase(bag);
        purchase.start();

        for (int i = 0; i < 10; i++) {
            Item item = new Item("Item " + i);
            try {
                synchronized (bag) {
                    Thread.sleep(1000);
                    if (bag.isFull()) {
                        bag.notify();
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }

            bag.addItem(item);
            System.out.println("Bag size: " + bag.getSize());
        }
    }
}
