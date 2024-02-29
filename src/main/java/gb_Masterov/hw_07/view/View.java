package gb_Masterov.hw_07.view;

import gb_Masterov.hw_07.model.ComplexNumber;

public class View {
    public void print(ComplexNumber complexNumber){
        if (complexNumber.getImaginary() < 0){
            System.out.println(complexNumber.getReal() + " " + complexNumber.getImaginary() + "i");
        } else {
            System.out.println(complexNumber.getReal() + " + " + complexNumber.getImaginary() + "i");
        }

    }
}
