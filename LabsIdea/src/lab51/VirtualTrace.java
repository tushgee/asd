package lab51;

public class VirtualTrace implements Trace{
    @Override
    public void debug(String message) {
        System.out.println("Debugging Virtual: "+message);
    }

    @Override
    public void error(String message) {
        System.out.println("Error Virtual: "+message);
    }
}
