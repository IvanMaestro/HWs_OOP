package gb_Masterov.hw_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> array1 = new ArrayList<>(Arrays.asList(1, 56, 899, 65));
        Calculator calculator = new Calculator();
        System.out.println("calculator.sum(array1) = " + calculator.sum(array1));
        List<Double> array2 = new ArrayList<>(Arrays.asList(89.0, 2.0, 56.0));
        System.out.println("calculator.sum(array2) = " + calculator.sum(array2));
        List<Integer> array3 = new ArrayList<>(Arrays.asList(14, 56));
        System.out.println("calculator.mult(array3) = " + calculator.mult(array3));
        List<Double> array4 = new ArrayList<>(Arrays.asList(89.0, 2.0));
        System.out.println("calculator.div(array4) = " + calculator.div(array4));
        BinaryTranslation<Integer> bt1 = new BinaryTranslation<>();
        System.out.println("bt1.fromBinary(11101000) = " + bt1.fromBinary(11101000));
        System.out.println("bt1.toBinary(232) = " + bt1.toBinary(232));
        BinaryTranslation<String> bt2 = new BinaryTranslation<>();
        System.out.println("bt2.toBinary(232) = " + bt2.toBinary("232"));
        System.out.println("bt2.fromBinary(\"11101000\") = " + bt2.fromBinary("11101000"));
    }
}