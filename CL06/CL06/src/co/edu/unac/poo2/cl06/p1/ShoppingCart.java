package co.edu.unac.poo2.cl06.p1;

public class ShoppingCart {

    private int index;
    private String item;

    public ShoppingCart(int index, String item) {
        this.index = index;
        this.item = item;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
