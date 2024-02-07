package gb_Masterov.hw_03;

import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game {
//    abstract List<String> generateCharList();

    private String word;
    private Integer tryCount;
    private  GameStatus gameStatus = GameStatus.INIT;
    private Integer wordSize;
    private HistoryGame historyGame;
    @Override
    public void start(Integer wordSize, Integer tryCount) {
        word = generateWord(wordSize);
        this.tryCount = tryCount;
        gameStatus = GameStatus.START;
        historyGame = new HistoryGame();
    }

    private String generateWord(Integer wordSize) {
        List<String> alphabet = generateCharList();
        Random rnd = new Random();
        String result = "";
        for (int i = 0; i < wordSize; i++) {
            int randomIndex = rnd.nextInt(alphabet.size());
            result += alphabet.get(randomIndex);
            alphabet.remove(randomIndex);
        }
        return result;
    }

    @Override
    public Answer inputValue(String value) {
        if (!getGameStatus().equals(GameStatus.START)) {
            throw new RuntimeException("Игра не запущена");
        }
        int cowCounter = 0;
        int bullCounter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (value.charAt(i) == word.charAt(i)) {
                cowCounter++;
                bullCounter++;
            } else if (word.contains(String.valueOf(value.charAt(i)))) {
                cowCounter++;
            }
        }
        tryCount--;
        if (tryCount == 0){
            gameStatus = GameStatus.LOOSE;
        }
        if (bullCounter == word.length()){
            gameStatus = GameStatus.WIN;
        }
        Answer result = new Answer(cowCounter, bullCounter, tryCount);
        historyGame.addHistory(result, value);
        return result;
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public HistoryGame getHistoryGame() {
        return historyGame;
    }

    public abstract List<String> generateCharList();
    public abstract Integer getCharListSize();
    @Override
    public void stop() {
        gameStatus = GameStatus.INIT;
    }

    @Override
    public void restart() {
        gameStatus = GameStatus.RESTART;
        start(wordSize, tryCount);
    }

    @Override
    public void exit() {
        gameStatus = GameStatus.EXIT;
    }

    public abstract String getTypeGame();
    public String getGenerateWord(){
        return word;
    }
    public Integer getCount(){
        return tryCount;
    }
}