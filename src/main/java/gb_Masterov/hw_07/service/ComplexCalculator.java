package gb_Masterov.hw_07.service;

import gb_Masterov.hw_07.model.ComplexNumber;

public class ComplexCalculator {
    public ComplexNumber calculate(ComplexNumber number1, ComplexNumber number2, char symbol){
        switch (symbol){
            case '+':
                return new Addition().add(number1, number2);
            case '*':
                return new Multiplication().multiplication(number1, number2);
            case '/':
                return new Division().division(number1, number2);
            default:
                return new ComplexNumber(0, 0);
        }

    }
}
