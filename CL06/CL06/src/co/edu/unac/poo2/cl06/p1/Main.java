package co.edu.unac.poo2.cl06.p1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<ShoppingCart> items1 = new ArrayList<ShoppingCart>();
        items1.add(new ShoppingCart(2, "Item 1"));
        items1.add(new ShoppingCart(4, "Item 2"));
        items1.add(new ShoppingCart(3, "Item 3"));
        List<ShoppingCart> items2 = new ArrayList<ShoppingCart>();
        items2.add(new ShoppingCart(4, "Item 1"));
        items2.add(new ShoppingCart(3, "Item 2"));
        items2.add(new ShoppingCart(5, "Item 3"));

        Client c1 = new Client("Jose", items1);
        Client c2 = new Client("Juan", items2);

        long init = System.currentTimeMillis();

        Cashier cs1 = new Cashier("Pablo", c1, init);
        Cashier cs2 = new Cashier("Mauricio", c2, init);

        cs1.start();
        cs2.start();
    }
}