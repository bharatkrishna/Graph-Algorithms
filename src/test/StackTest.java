package test;

import util.Stack;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StackTest {
	private Stack newStack = new Stack(5);
	
	@Test
	public void PushPeekTest()
	{
		newStack.push(5);
		assertEquals(5,newStack.peek());
		newStack.push(4);
		assertEquals(4,newStack.peek());
		newStack.push(3);
		assertEquals(3,newStack.peek());
		newStack.push(2);
		assertEquals(2,newStack.peek());
		newStack.push(1);
		assertEquals(1,newStack.peek());
				
	}
	@Test
	public void PopTest()
	{
		newStack.push(5);
		newStack.push(4);
		newStack.push(3);
		newStack.push(2);
		newStack.push(1);
		assertEquals(1,newStack.pop());		
		assertEquals(2,newStack.pop());		
		assertEquals(3,newStack.pop());
		assertEquals(4,newStack.pop());
		assertEquals(5,newStack.pop());
		//negative case - pop an empty stack
		assertEquals(-1,newStack.pop());
		assertEquals(-1,newStack.pop());		
	}
	
	@Test
	public void FullEmptyTest()
	{
		assertEquals(true,newStack.isEmpty());
		assertEquals(false,newStack.isFull());
		newStack.push(5);
		assertEquals(false,newStack.isEmpty());
		assertEquals(false,newStack.isFull());
		newStack.push(4);
		newStack.push(3);
		newStack.push(2);
		newStack.push(1);
		assertEquals(false,newStack.isEmpty());
		assertEquals(true,newStack.isFull());
	}
	

}
