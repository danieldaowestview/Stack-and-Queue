
import java.util.ArrayList;

public class Stack<T> {
	// use an Arraylist as the backend structure
	// 1) instance variables?
	ArrayList<T> data;

	public Stack() {
		// 2) what should the constructor do?
		data = new ArrayList<T>();
	}

	/*
	 * 
	 * Add to the stack
	 */

	public void push(T el) {
		data.add(el);
	}

	/*
	 * 
	 * 
	 * Pop from the stack if not empty
	 */
	public T pop() {
		// )3
		if (data.isEmpty()) {
			return null;
		} else {
			data.remove(data.size() - 1);
		}
		return null;
	}

	// return the # of elements in the stack
	public int size() {
		return data.size();
	}

	public boolean empty() {
		if (data.isEmpty()) {
			return true;
		}
		return false;
	}

	public T peek() {
		return data.get(data.size() - 1);
	}
}
