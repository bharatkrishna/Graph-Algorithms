package util;

/**
 * Array Based Queue(non circular).
 * 
 * @author Bharat 
 * @version 1.0
 */
public class Queue {
	private int size;
	private int[] que;
	private int front;
	private int back;
	
	/**
     * Constructor to set queue size and initialize the queue.
     */
	public Queue(int s)
	{
		size= s;
		que = new int[s];
		front = 0;
		back = -1;
	}
	
	/**
     * Method to check if the queue is full.
     * 
     * @param  void   
     * @return     Boolean value indicating of the queue is full.
     */
	public boolean isFull()
	{
		return (back==size-1);
	}
	
	/**
     * Method to check if the stack is empty.
     * 
     * @param  void   
     * @return     Boolean value indicating of the queue is empty.
     */
	public boolean isEmpty()
	{
		return (back+1==front );
	}
	
	/**
     * Insert an element to the back of the queue.
     * 
     * @param  n -  Integer to be inserted.
     * @return     void
     */
	public void enqueue(int n)
	{
		if (!isFull()){
			que[++back]= n;
		}		
	}
	
	/**
     * Remove an element from the front of the queue.
     * 
     * @param  void   
     * @return     Removed element.
     */
	public int dequeue()
	{
		if (!isEmpty()){
			return que[front++];
		}
		else return -1;
		
	}
	
	/**
     * Peek at the front of the queue.
     * 
     * @param  void   
     * @return     Element at the front of the queue.
     */
	public int peekFront()
	{
		return que[front];
	}

}
