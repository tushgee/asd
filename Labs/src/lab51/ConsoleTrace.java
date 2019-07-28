package lab51;

public class ConsoleTrace implements Trace {

    public ConsoleTrace() {}

    @Override
    public void debug(String message) {
        System.out.println("Debugging: "+message);
    }

    @Override
    public void error(String message) {
        System.out.println("Error: "+message);
    }

}
