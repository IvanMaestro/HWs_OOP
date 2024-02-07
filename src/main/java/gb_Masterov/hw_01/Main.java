package gb_Masterov.hw_01;

//        1) Создайте три класса: Человек, Кот, Робот, которые не наследуются от одного класса но есть общий класс родитель. Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.
//2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
//должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
//печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
//        (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
//3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
//этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
//списку он препятствий не идет.

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop("Копеечка");

        Product cabbage = new Product("Капуста", 2.60, 4);
        Product cucumber = new Product("Огурец", 4.50, 5);
        Product tomato = new Product("Помидор", 5.00, 5);
        Product eggplant = new Product("Баклажан", 3.70, 4);
        Product apple = new Product("Яблоко", 3.15, 3);
        Product banana = new Product("Банан", 5.60, 4);
        Product grape = new Product("Виноград", 8.50, 3);
        Product pomelo = new Product("Помело", 12.00, 5);

        Category category1 = new Category("Овощи:");
        category1.addProduct(cabbage);
        category1.addProduct(cucumber);
        category1.addProduct(tomato);
        category1.addProduct(eggplant);

        Category category2 = new Category("Фрукты:");
        category2.addProduct(banana);
        category2.addProduct(apple);
        category2.addProduct(grape);
        category2.addProduct(pomelo);

        shop.addCategory(category1);
        shop.addCategory(category2);


        shop.showCatalog();
        System.out.println();

        User user1 = new User("Иван", "password1");
        User user2 = new User("Алексей", "password2");

        shop.sell(user1, cabbage);
        shop.sell(user1, banana);
        shop.sell(user2, cucumber);
        shop.sell(user2, tomato);
        shop.sell(user2, pomelo);

        user1.showUserBasket(user1);
        user2.showUserBasket(user2);

        System.out.println();
        shop.showCatalog();
    }
}