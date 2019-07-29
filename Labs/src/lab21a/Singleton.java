package lab21a;

public class Singleton {
	private static Singleton uniqueInstance = null;
	
	/*
	 * Returns a reference to the single instance. Creates the instance if it
	 * does not yet exist. (This is called lazy instantiation.)
	 */

	public static Singleton getInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new Singleton();
		return uniqueInstance;
	}
	
	/* The Singleton Constructor. Note that it is private! No client can
	 * instantiate a Singleton object directly!
	 */
	private Singleton() {} 
	// Accessors and mutators here!
	
}
