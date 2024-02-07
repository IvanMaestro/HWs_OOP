package gb_Masterov.hw_03;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AbstractGame ag = null;
        int result = -1;
        while (result != 0) {
            if (Objects.isNull(ag) || ag.getGameStatus().equals(GameStatus.INIT)) {
                result = getAnswer(choiceTypeGame, scanner);
            }
            ag = getTypeGame(result);
            if (Objects.isNull(ag)) {
                result = 0;
                continue;
            }

            Integer wordSize = getAnswer(String.format(choiceValue, "размер слова: "), scanner);
            Integer tryCount = getAnswer(String.format(choiceValue, "количество попыток: "), scanner);

            if (checkParameters(ag, wordSize, tryCount)) {
                ag.start(wordSize, tryCount);
            }

            while (ag.getGameStatus().equals(GameStatus.START)) {
                System.out.println(ag.getTypeGame());
                System.out.println("Загаданное слово " + ag.getGenerateWord());
                result = getAnswer(choiceCommand, scanner);
                switch (result) {
                    case 1:
                        ag.stop();
                        break;
                    case 2:
                        ag.restart();
                        break;
                    case 3:
                        String value = getString(String.format(choiceValue, "ваш вариант загаданного слова: "), scanner);
                        Answer answer = ag.inputValue(value);
                        System.out.println(answer);
                        if (ag.getGameStatus().equals(GameStatus.WIN)){
                            System.out.println("Вы победили!");
                        }
                        else if (ag.getGameStatus().equals(GameStatus.LOOSE)){
                            System.out.println("Вы проиграли!");
                        }
                        if (!ag.getGameStatus().equals(GameStatus.START)) {
                            result = getAnswer(choiceContinue, scanner);
                            if (result == 1) {
                                ag.stop();
                            } else {
                                ag.exit();
                            }
                        }
                        break;
                    case 4:
                        HistoryGame history = ag.getHistoryGame();
                        if (!Objects.isNull(history)) {
                            history.showHistory();
                        } else System.out.println("Еще нет истории.");
                        break;
                    case 0:
                        ag.exit();
                        break;
                    default:
                        System.out.println("Выберите нужную команду.");
                        break;

                }
            }
            if (ag.getGameStatus().equals(GameStatus.EXIT)) result = 0;
        }
        System.out.println("Пока.");
        scanner.close();
    }

    public static final int maxWordSize = 5;

    public static String choiceTypeGame = String.format("Выберите формат игры:%n" +
            "1 - игра с цифрами%n" +
            "2 - игра с русским алфавитом%n" +
            "3 - игра с английским алфавитом%n" +
            "0 - завершить игру%n" +
            "Введите ответ: ");

    public static String choiceCommand = String.format("Доступные действия:%n" +
            "  1 - начать новую игру%n" +
            "  2 - рестарт текущей игры%n" +
            "  3 - продолжить игру(ввести значение)%n" +
            "  4 - история текущей игры%n" +
            "  0 - завершить игру%n" +
            "Введите ответ: ");

    public static String choiceContinue = String.format("Хотите продолжить игру?%n" +
            "  1 - Да%n" +
            "  2 - Нет%n" +
            "Введите ответ: ");

    public static String choiceValue = "Введите %s";

    public static AbstractGame getTypeGame(int typeGame) {
        AbstractGame result;
        result = switch (typeGame) {
            case 1 -> new GameNumber();
            case 2 -> new RuGame();
            case 3 -> new EngGame();
            default -> null;
        };
        return result;
    }

    public static int getAnswer(String choice, Scanner scanner) {
        System.out.printf(choice);
        int result = -999;
        try {
            result = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Ошибка. Введено не число.");
        }
        return result;

    }
    private static boolean checkParameters(AbstractGame ag, Integer wordSize, Integer tryCount) {
        if (wordSize <= 0 || wordSize > maxWordSize) {
            System.out.println("Размер слова должен быть меньше " + maxWordSize + "  и больше нуля.");
            return false;
        }
        return tryCount != 0;
    }
    public static String getString(String choice, Scanner scanner) {
        System.out.printf(choice);
        String result = scanner.next();
        return result;
    }
}