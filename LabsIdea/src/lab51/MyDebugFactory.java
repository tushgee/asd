package lab51;

public class MyDebugFactory implements TraceFactory {
    private static TraceFactory factory = new MyDebugFactory(); // Make it a Singleton
    private MyDebugFactory() {} // Private Constructor

    public static TraceFactory getFactory() {
        return factory;
    }

    public Trace createDebugger(String type) {
        Trace trace = null;

        if (type.equals("console")) {
            trace = new ConsoleTrace();
        } else if (type.equals("trace.log")) {
            trace = new FileTrace();
        } else if (type.equals("virtual")) {
            trace = new VirtualTrace();
        }

        return trace;
    }
}
