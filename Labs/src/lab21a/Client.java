package lab21a;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonLazy instance = SingletonLazy.getInstance();
		System.out.println(instance);
		
		SingletonLazy instance1 = SingletonLazy.getInstance();
		System.out.println(instance1);

	}

}
