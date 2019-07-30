package lab31;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Adapter();
		Queue queue = new Adapter();
		
		stack.push("Amazon");
		stack.push("Battushig");
		stack.pop();
		stack.push("Gantushig");
		
		queue.enqueue("Elsa");
		queue.enqueue("Pororo");
		queue.dequeue();
		queue.enqueue("Bumbaarai");
		
		
		if (!queue.isEmpty()) {
			System.out.println(queue.dequeue());
		} else {
			System.out.println("Stack is empty!");
		}
	
	}

}
