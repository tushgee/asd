package lab51;

public class FileTrace implements Trace {

    public FileTrace() {}

    @Override
    public void debug(String message) {
        System.out.println("Debugging trace.log: " + message);
    }

    @Override
    public void error(String message) {
        System.out.println("Error trace.log: " + message);
    }
}
