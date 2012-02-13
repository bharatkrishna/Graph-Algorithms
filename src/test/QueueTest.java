package test;

import util.Queue;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class QueueTest {
	private Queue q = new Queue(5);
	
	@Test
	public void enqueuePeekTest()
	{
		q.enqueue(1);
		assertEquals(1,q.peekFront());
		q.enqueue(2);
		assertEquals(1,q.peekFront());
		q.enqueue(3);
		assertEquals(1,q.peekFront());
		q.enqueue(4);
		assertEquals(1,q.peekFront());
		q.enqueue(5);
		assertEquals(1,q.peekFront());
	}
	
	@Test 
	public void dequeueTest()
	{
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);		
		assertEquals(1,q.dequeue());
		assertEquals(2,q.dequeue());
		assertEquals(3,q.dequeue());
		assertEquals(4,q.dequeue());
		assertEquals(5,q.dequeue());
		// Negative cases - dequeuing from empty queue.
		assertEquals(-1,q.dequeue());
		assertEquals(-1,q.dequeue());
	}
	
	@Test 
	public void EmptyFullTest()
	{
		assertEquals(false,q.isFull());
		assertEquals(true,q.isEmpty());
		q.enqueue(1);
		assertEquals(false,q.isFull());
		assertEquals(false,q.isEmpty());
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		assertEquals(true,q.isFull());
		assertEquals(false,q.isEmpty());
	}	
	
}
