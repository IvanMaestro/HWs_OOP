package gb_Masterov.hw_01;

import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Product> products;


    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }
}