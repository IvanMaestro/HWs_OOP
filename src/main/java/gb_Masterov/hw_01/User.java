package gb_Masterov.hw_01;

import java.util.ArrayList;

public class User {
    private String login;
    private String password;
    private Basket basket;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void addProductToBasket(Product product) {
        basket.addProduct(product);
    }

    public void removeProductFromBasket(Product product) {
        if (basket.hasProduct(product)) {
            basket.removeProduct(product);
        }
    }

    public void showUserBasket(User user) {
        System.out.println(user.getLogin() + " - Покупки: ");
        ArrayList<Product> userProducts = user.getBasket().getProducts();
        for (Product product : userProducts) {
            System.out.println("Наименование: " + product.getName() + " цена: " + product.getPrice() + " рейтинг: " + product.getRating());
        }
    }

    @Override
    public String toString() {
        return "User{" +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}