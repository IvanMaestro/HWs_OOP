package gb_Masterov.hw_04;

public class BinaryTranslation<T> extends Calculator{

    public BinaryTranslation() {
        super();
    }
    public String toBinary(T number) {
        Integer num = Integer.parseInt(number.toString());
        if (num<=0) return null;
        return Integer.toBinaryString(num);
    }
    public Integer fromBinary(T number) {
        String str = number.toString();
        return  Integer.parseInt(str, 2);
    }

}