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
		for (int i = push.size() - 1; i > 1; i--) {
			pop.push(push.pop());
		}
		if (pop.size() == 0) {
			return null;
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
		return "";
	}

	/* return the # of elements in the queue */
	public int size() {
		return -1;
	}

	/* return true if the queue is empty, false otherwise */
	public boolean empty() {
		return false;
	}

}