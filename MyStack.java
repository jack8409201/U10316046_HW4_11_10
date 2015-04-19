/**
 * Name: Jou Dan-Haur
 * ID: U10316046
 * Ex: 11.10
 */
import java.util.ArrayList;

public class MyStack extends ArrayList<String>{
	
	//Create an ArrayList store objects
	private ArrayList<String> list = new ArrayList<String>();

	//Bollean method if stack is empty that return true
	public boolean isEmpty() {
		return super.isEmpty();
	}

	//Method return amount of element in the stack
	public int getSize() {
		return super.size();
	}

	//Method return top object of the stack but not delete
	public Object peek() {
		return super.get(getSize() - 1);
	}

	//Method delete top object in the stack and return it
	public Object pop() {
		Object o = super.get(getSize() - 1);
		super.remove(getSize() - 1);
		return o;
	}

	//Method store object on the top 
	public void push(String o) {
		super.add(o);
	}

	//Override the toString in the Object class
	@Override
	public String toString() {
		return "stack: " + super.toString();
	}
}
