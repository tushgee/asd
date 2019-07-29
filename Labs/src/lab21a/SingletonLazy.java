package lab21a;
/*
 * Bill Pugh Singleton Implementation
 * When the singleton class is loaded, inner class is not loaded and hence doesn’t create 
 * object when loading the class. Inner class is created only when getInstance() method 
 * is called. So it may seem like eager initialization but it is lazy initialization.
 * This is the most widely used approach as it doesn’t use synchronization.
 */
public class SingletonLazy {
	
	private SingletonLazy() {} 
		
	// Inner class to provide instance of class
	private static class Singleton {
		private static final SingletonLazy uniqueInstance = new SingletonLazy();
	}

	public static SingletonLazy getInstance() {
		return Singleton.uniqueInstance;
	}
}
