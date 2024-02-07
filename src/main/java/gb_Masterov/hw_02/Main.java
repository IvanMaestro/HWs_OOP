package gb_Masterov.hw_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Урок 2. Принципы ООП Абстракция и интерфейсы. Пример проектирования
//Домашнее задание на закрепление :
//
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

        List<Creator> playerList = new ArrayList<>(Arrays.asList(
                new Human("Алексей", 1.30, 3.40),
                new Human("Евгений", 1.50, 3.80),
                new Cat("Барсик", 2.15, 9.10),
                new Cat("Сима", 2.50, 8.40),
                new Robot("Robo", 0.5, 3.50)
        ));

        List<Barrier> barrierList = new ArrayList<>(Arrays.asList(
                new Wall("Стена1", 0.5),
                new Wall("Стена2", 1.0),
                new Wall("Стена3", 1.5),
                new Pathway("Дорожка1", 1.5),
                new Pathway("Дорожка2", 2.5),
                new Pathway("Дорожка3", 3.5)
        ));


        for(Creator creator: playerList){
            System.out.println(creator.getName() + ":");
            creator.run();
            for (Barrier barrier: barrierList){
                if( barrier instanceof Wall){
                    creator.jump(((Wall) barrier).getDistance());
                } else if (barrier instanceof Pathway){
                    creator.runTest(((Pathway) barrier).getDistance());
                }
            }
            creator.endRace();
            System.out.println();
        }
    }
}