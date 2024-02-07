package gb_Masterov.hw_01;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<Category> categories;


    public Shop(String name) {
        this.name = name;
        this.categories = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCategory(Category category) {
        categories.add(category);

    }

    public void sell(User user, Product product) {
        user.addProductToBasket(product);
        for (Category category : categories) {
            category.removeProduct(product);
        }
    }

    public void showCatalog() {
        for (Category category : categories) {
            System.out.println(category.getName());
            ArrayList<Product> products = category.getProducts();
            for (Product product : products) {
                System.out.println("Наименование: " + product.getName() +
                        ", цена= " + product.getPrice() +
                        ", рейтинг= " + product.getRating());
            }
        }
    }
}