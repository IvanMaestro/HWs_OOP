package gb_Masterov.hw_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameNumber extends AbstractGame {
    @Override
    public List <String> generateCharList() {
        return new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
    }

    @Override
    public Integer getCharListSize() {
        return 10;
    }

    @Override
    public String getTypeGame() {
        return "'Игра с цифрами'";
    }
}