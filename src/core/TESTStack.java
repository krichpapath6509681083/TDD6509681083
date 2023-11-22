package core;

import junit.framework.TestCase;

public class TESTStack extends TestCase {
	public void testCreateEmptyStack() {
		Stack s1 = new Stack();
		int size = s1.getSize();
		assertEquals(0,size);
		assertTrue(s1.isEmpty());
	}
	public void testPushElmToTop() {
		Stack s2 = new Stack();
		s2.push(1);
		Object elm = s2.top();
		assertEquals(1,elm);
		assertTrue(s2.isFull());
	}
	public void testLastInFirstOut() {
		Stack s3 = new Stack(3);
		s3.push(1);
		s3.push(2);
		s3.push(3);
		Object elm = s3.pop();
		assertEquals(1,elm);
	}
	public void testPushElmToLimitedSizeStack() {
		Stack s4 = new Stack(4);
		s4.push(1);
		s4.push(2);
		s4.push(3);
		s4.push(4);
		s4.push(5);
		Object elm = s4.top();
		assertEquals(4,elm);
		assertTrue(s4.isFull());
	}
}
