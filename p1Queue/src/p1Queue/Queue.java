package p1Queue;

//For this problem, you may assume you can use the Stack we started together in class
public class Queue<T> {

	/* to be completed */
	// instance variables
	Stack<T> pop;
	Stack<T> push;
	int data[] = { 1, 2, 3, 4, 5, 6 };

	/* to be completed */
	// constructor
	public Queue() {
		pop = new Stack<T>();
		push = new Stack<T>();
	}

	// remove and return the element at the beginning of the list
	public T remove() {
		if (pop.size() == 0) {
			for (int i = push.size() - 1; i >= 0; i--) {
				pop.push(push.pop());
			}
		}
		return pop.pop();
	}

	// add element at the end of the list
	public void add(T el) {
		/* to be completed */
		push.push(el);
	}

	// return a String representation of the list
	// formatted as [el1, el2, el3, ..., elN]
	public String toString() {
		String res = "[";
		for (int i = 0; i < pop.size(); i++) {
			res += pop.pop() + ",";
		}
		res += "]";
		return res;
	}

	/* return the # of elements in the queue */
	public int size() {
		return push.size() + pop.size();
	}

	/* return true if the queue is empty, false otherwise */
	public boolean empty() {
		if (push.size() == 0 && pop.size() == 0) {
			return true;
		}
		return false;
	}

}