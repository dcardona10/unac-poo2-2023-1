package co.edu.unac.poo2.cl06.p2;

public class Purchase extends Thread {

    private Bag bag;

    public Purchase (Bag bag) {
        this.bag = bag;
    }

    public void run() {
        if (!bag.isFull()) {
            try {
                synchronized (bag) {
                    bag.wait();
                }
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println("Sending bag with " + bag.getSize() + " items");
        }
    }

    public Bag getBag() {
        return bag;
    }

    public void setBag(Bag bag) {
        this.bag = bag;
    }
}
