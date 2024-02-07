package gb_Masterov.hw_03;

public class Answer {
    private Integer cowCounter;
    private Integer bullCounter;
    private Integer tryCount;

    public Answer(Integer cowCounter, Integer bullCounter, Integer tryCount) {
        this.cowCounter = cowCounter;
        this.bullCounter = bullCounter;
        this.tryCount = tryCount;
    }
    public Integer getAttemptCounter() {
        return tryCount;
    }

    public Integer[] getCounters() {
        return new Integer[]{cowCounter,bullCounter};

    }

    @Override
    public String toString() {
        return cowCounter + " коровы, " + bullCounter + " быков, осталось попыток : " + tryCount;
    }
}