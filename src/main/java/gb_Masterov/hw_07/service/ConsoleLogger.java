package gb_Masterov.hw_07.service;

public class ConsoleLogger implements Loggable{

    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
