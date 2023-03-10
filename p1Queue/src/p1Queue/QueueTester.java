package p1Queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueTester {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	void testSize() {
		Queue temp = new Queue();
		assertEquals(0, temp.size());
	}

	void testAdd(){
		Queue temp = new Queue();
		temp.add(T el);
		assertEquals(1, temp.size());
	}

}
