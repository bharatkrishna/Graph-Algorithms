package util;

/**
 * Array Based Stack.
 * 
 * @author Bharat 
 * @version 1.0
 */

public class Stack {
	private int size;
	private int[] st;
	private int top;
	
	/**
     * Constructor to set stack size and initialize the stack.
     */
	public Stack(int s)
	{
		size = s;
		st = new int[size];
		top = -1;
	}
	
	/**
     * Method to check if the stack is full.
     * 
     * @param  void   
     * @return     Boolean value indicating of the stack is full.
     */
	public boolean isFull()
	{
		return (top == size-1);
	}
	
	/**
     * Method to check if the stack is empty.
     * 
     * @param  void   
     * @return     Boolean value indicating of the stack is empty.
     */
	public boolean isEmpty()
	{
		return (top == -1);
	}
	
	/**
     * Push an element into the stack.
     * 
     * @param  n -  Integer to be pushed.
     * @return     void
     */
	public void push(int n)
	{
		if (!isFull()){
			st[++top]= n;	
		}
		else System.out.println("Stack full");
	}
	
	/**
     * Pop an element from the stack.
     * 
     * @param  void   
     * @return     Popped element.
     */
	public int pop()
	{
		if (!isEmpty()){
			return st[top--];	
		}
		else return -1;		
	}
	
	/**
     * Peek at the top of the stack.
     * 
     * @param  void   
     * @return     Element at the top of the stack.
     */
	public int peek()
	{
		return st[top];
	}
}
