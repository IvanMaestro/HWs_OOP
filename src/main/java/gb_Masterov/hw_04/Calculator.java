package gb_Masterov.hw_04;


import java.util.List;

public class Calculator {


    public double sum (List<? extends Number> array) {
        double res = 0;
        for (int i = 0; i < array.size(); i++) {
            res += array.get(i).doubleValue();
        }
        return res;
    }

    public Double mult(List<? extends Number> array){
        double res = 1;
        for (int i = 0; i < array.size(); i++) {
            res *= array.get(i).doubleValue();

        }
        return res;
    }

    public Double div(List<? extends Number> numbers){
        double res = numbers.get(0).doubleValue();
        for (int i = 1; i < numbers.size(); i++) {
            res /= numbers.get(i).doubleValue();

        }
        return res;
    }
}