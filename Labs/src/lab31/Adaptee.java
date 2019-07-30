package lab31;

public class Adaptee {
	private String[] data = new String[100];
	private int start;
	private int end = -1;
	
	public String startString() {
		return data[start];
	}
	
	public String endString() {
		return data[end];
	}
	
	public boolean empty() {
		return (end == -1);
	}
	
	public void add(String str) {
		end++;
		data[end] = str;
		
	}
	
	public void remove(int pos) {
		// remove the String object at position 'pos' and bring forward all items after it
		for (int i = pos; i < end; i++) {
			data[i] = data[i+1];
		}
	}
	
	public String get(int pos) {
		return data[pos];
	}
	
	public int getEnd() {
		return end;
	}
	
	public int getStart() {
		return start;
	}


}
