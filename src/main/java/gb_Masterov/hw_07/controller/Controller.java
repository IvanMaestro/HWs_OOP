package gb_Masterov.hw_07.controller;

import gb_Masterov.hw_07.model.ComplexNumber;
import gb_Masterov.hw_07.service.ComplexCalculator;
import gb_Masterov.hw_07.view.View;

public class Controller {
    private ComplexNumber number1;
    private ComplexNumber number2;
    private ComplexCalculator calculator = new ComplexCalculator();
    private View view = new View();

    public Controller(ComplexNumber number1, ComplexNumber number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void start(){
        ComplexNumber res1 = calculator.calculate(number1, number2, '+');
        System.out.println(number1 + " + " + number2 + " = ");
        view.print(res1);
        ComplexNumber res2 = calculator.calculate(number1, number2, '*');
        System.out.println(number1 + " * " + number2 + " = ");
        view.print(res2);
        ComplexNumber res3 = calculator.calculate(number1, number2, '/');
        System.out.println(number1 + " / " + number2 + " = ");
        view.print(res3);
    }
}
