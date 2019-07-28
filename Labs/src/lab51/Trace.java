package lab51;

public interface Trace {

    // turn on and off debugging
    default public void setDebug(boolean debug) {}
    // write out a debug message
    public void debug(String message);
    // write out an error message
    public void error(String message);

}
