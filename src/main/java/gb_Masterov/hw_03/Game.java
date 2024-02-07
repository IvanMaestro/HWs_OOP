package gb_Masterov.hw_03;

public interface Game {
    void start(Integer wordSize, Integer tryCount);
    Answer inputValue(String value);
    GameStatus getGameStatus();

    void stop();

    void exit();

    void restart();

}