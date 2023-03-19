package co.edu.unac.poo2.cl06.p2;

import java.util.*;

public class Bag {

    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        if (!isFull()) {
            this.items.add(item);
        }
    }

    public int getSize() {
        return this.items.size();
    }

    public boolean isFull() {
        return this.items.size() >= 5;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
