package gb_Masterov.hw_07.service;

import gb_Masterov.hw_07.model.ComplexNumber;

public class Multiplication {
    private Loggable loggable = new ConsoleLogger();
    public ComplexNumber multiplication(ComplexNumber number1, ComplexNumber number2){
        loggable.log("Умножение");
        ComplexNumber complexNumber = new ComplexNumber(
//                number1.getReal() * number2.getImaginary() +
//                        number1.getImaginary() * number2.getReal(),
//                number1.getReal() * number2.getReal() -
//                        number1.getImaginary() * number2.getImaginary()
                number1.getReal() * number2.getReal() -
                        number1.getImaginary() * number2.getImaginary(),
                number1.getReal() * number2.getImaginary() +
                        number1.getImaginary() * number2.getReal()
        );
        return complexNumber;
    }
}
