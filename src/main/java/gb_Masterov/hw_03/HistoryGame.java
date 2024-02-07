package gb_Masterov.hw_03;

import java.util.LinkedHashMap;
import java.util.Map;

public class HistoryGame {
    private Map<Answer, String> history;


    public HistoryGame() {
        history = new LinkedHashMap<>();
    }

    public void addHistory(Answer answer, String value){
        history.put(answer, value);
    }

    public void showHistory(){
        for (Answer answer:history.keySet()){
            Integer attempt = answer.getAttemptCounter();
            Integer[] counters = answer.getCounters();
            System.out.printf("На %d ходу вы ввели слово '%s' и угадали %d символов при %d полных совпадениях%n",
                    attempt+1,
                    history.get(answer),
                    counters[0],counters[1]);
        }
    }
}