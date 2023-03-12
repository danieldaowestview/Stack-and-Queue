package p1Queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueTester {

	@Test
	void test() {
		//fail("Not yet implemented");
	}

	@Test
	void testSize() {
		Queue<Integer> temp = new Queue<Integer>();
		assertEquals(0, temp.size());
	}
	@Test
	void testAdd() {
		Queue<Integer> temp = new Queue<Integer>();
		temp.add(1);
		temp.add(1);
		temp.add(1);
		assertEquals(3, temp.size());
	}
	@Test
	void testToString() {
		Queue<Integer> temp = new Queue<Integer>();
		temp.add(1);
		temp.add(2);
		temp.add(3);
		assertEquals("[1, 2, 3]", temp.toString());
	}
	@Test
	void testEmpty() {
		Queue<Integer> temp = new Queue<Integer>();
		assertEquals(true, temp.empty());
	}
	@Test
	void testRemove() {
		Queue<Integer> temp = new Queue<Integer>();
		temp.add(1);
		temp.add(2);
		temp.remove();
		assertEquals(1, temp.size());
	}
}
