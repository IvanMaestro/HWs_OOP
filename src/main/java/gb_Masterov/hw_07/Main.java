package gb_Masterov.hw_07;

import gb_Masterov.hw_07.model.ComplexNumber;
import gb_Masterov.hw_07.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new ComplexNumber(5, 2),
                new ComplexNumber(2, -5));
        controller.start();
    }
}
