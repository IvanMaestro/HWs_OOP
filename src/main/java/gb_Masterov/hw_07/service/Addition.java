package gb_Masterov.hw_07.service;

import gb_Masterov.hw_07.model.ComplexNumber;

public class Addition {
    private Loggable loggable = new ConsoleLogger();

    public ComplexNumber add(ComplexNumber number1, ComplexNumber number2){
        loggable.log("Сложение");
        ComplexNumber complexNumber = new ComplexNumber(number1.getReal() + number2.getReal(),
                number2.getImaginary() + number1.getImaginary()
                );
        return complexNumber;
    }

}
