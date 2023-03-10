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
		Queue temp = new Queue(5);
		temp.enqueue(temp);
		assertEquals(0, temp.size());
	}

	void testEnqueue(){
		temp.enqueue()
	}

}
