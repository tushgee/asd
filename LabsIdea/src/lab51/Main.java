package lab51;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TraceFactory factory = MyDebugFactory.getFactory();
        //Trace debugger = factory.createDebugger("console");
        //Trace debugger = factory.createDebugger("trace.log");
        //Trace debugger = factory.createDebugger("virtual");

        Trace debugger = factory.createDebugger(args[0]);

        debugger.debug("Hello World!");
        debugger.error("Goodbye!");

    }

}
