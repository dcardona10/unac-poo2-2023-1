package co.edu.unac.poo2.cl06.p1;

import java.util.List;

public class Client {

    private String name;
    private int itemNumber;
    private List<ShoppingCart> shoppingCart;

    public Client(String name, List<ShoppingCart> shoppingCart) {
        this.name = name;
        this.shoppingCart = shoppingCart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ShoppingCart> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(List<ShoppingCart> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
