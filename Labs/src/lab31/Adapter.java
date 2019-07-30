package lab31;

public class Adapter implements Stack, Queue{
	private Adaptee adaptee;
	
	public Adapter(){
		adaptee = new Adaptee();	
	}
		
	@Override
	public void push(String str) {
		adaptee.add(str);
	}
	
	@Override
	public String pop() {
		int end = adaptee.getEnd();
		String str = adaptee.get(end);
		adaptee.remove(end);
		return str;
	}
	
	@Override
	public boolean isEmpty() {
		return adaptee.empty();
	}

	@Override
	public void enqueue(String str) {
		adaptee.add(str);
		
	}

	@Override
	public String dequeue() {
		int start = adaptee.getStart();
		String str = adaptee.get(start);
		adaptee.remove(start);
		return str;
	}

}
