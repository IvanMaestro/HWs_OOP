package gb_Masterov.hw_07.service;

import gb_Masterov.hw_07.model.ComplexNumber;

public class Division {
    private Loggable loggable = new ConsoleLogger();
    public ComplexNumber division(ComplexNumber number1, ComplexNumber number2) {
        loggable.log("Деление");
        ComplexNumber complexNumber = new ComplexNumber((number1.getReal() * number2.getReal() +
                number1.getImaginary() * number2.getImaginary()) /
                (number2.getReal() * number2.getReal() +
                        number2.getImaginary() * number2.getImaginary())
                ,
                (number2.getReal() * number1.getImaginary() -
                        number1.getReal() * number2.getImaginary()) /
                        (number2.getReal() * number2.getReal() +
                                number2.getImaginary() * number2.getImaginary())
        );
        return complexNumber;
    }
}
