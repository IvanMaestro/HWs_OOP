package gb_Masterov.hw_01;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> basket;

    public Basket() {
        this.basket = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return basket;
    }

    public void addProduct(Product product) {
        basket.add(product);
    }

    public void removeProduct(Product product) {
        basket.remove(product);
    }

    public boolean hasProduct(Product product) {
        return basket.contains(product);
    }

}