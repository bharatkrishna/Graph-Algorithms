package graph;

import util.Queue;
import util.Stack;

/**
 * Graph Algorithms. Based on code from Robert Lafore, Data Structures & Algorithms in Java, 2nd Edition.  
 * 
 * @author Bharat 
 * @version 1.0
 */
public class Graph {
	private int size;
	private Vertex[] vertexList;
	private int[][] adjMatrix ;
	private int numVertices;
	private Stack stack;
	private Queue q;
	
	/**
     * Constructor to initialize the Adjacency Matrix and initialize the graph.
     */
	public Graph(int s)
	{
		size = s;
		vertexList = new Vertex[size];
		numVertices=0;
		adjMatrix = new int[s][s];
		for (int i = 0;i<size;i++){
			for (int j=0;j<size;j++){
				adjMatrix[i][j]=0;
			}
		}		
	}
	
	/**
     * Method to add a Vertex to the graph.
     * 
     * @param  label The label for the vertex.
     */
	public void addVertex(char label)
	{
		vertexList[numVertices++]= new Vertex(label);
	}
	
	/**
     * Method to add an edge between two vertices.
     * 
     * @param  start The vertices between which the edge has to be added.
     */
	public void addEdge(int start, int end)
	{
		adjMatrix[start][end]=1;
		adjMatrix[end][start]=1;
	}
	
	/**
     * Display the Vertex.
     * 
     * @param  v  	The vertex whose label is to be displayed.
     */
	public void displayVertex(int v)
	{
		System.out.print(vertexList[v].getLabel()+" ");
	}
	
	/**
     * Depth First Search  - Prints vertices in DFS order.     
     */
	public void dfs()
	{
		stack = new Stack(size);
		vertexList[0].visit();
		displayVertex(0);
		stack.push(0);
		
		while (!stack.isEmpty()){
			int v = getAdjUnvisitedVertex(stack.peek());
			if (v == -1)
				stack.pop();
			else{
				vertexList[v].visit();
				displayVertex(v);
				stack.push(v);
			}
		}
		reset();
	}
	
	/**
     * Breadth First Search  - Prints vertices in BFS order.     
     */
	public void bfs()
	{
		q = new Queue(size);
		vertexList[0].visit();
		displayVertex(0);
		q.enqueue(0);
		int v2;
		
		while (!q.isEmpty())
		{
			int v1 = q.dequeue();
			while( (v2=getAdjUnvisitedVertex(v1)) != -1 )
			{
				vertexList[v2].visit();
				displayVertex(v2);
				q.enqueue(v2);				
			}
		}
		reset();
	}
	
	// Helper methods
	/**
     * Helper method to get the adjacent unvisited vertex.
     * 
     * @param  v The vertex   
     * @return     Adjacent unvisited vertex.
     */
	public int getAdjUnvisitedVertex(int v)
	{
		for (int i=0;i<numVertices;i++)
		{
			if (adjMatrix[v][i]==1 && vertexList[i].wasVisited()==false){
				return i;
			}			
		}
		return -1;
	}
	
	/**
     * Helper method to reset all the vertices to unvisited.
     */
	private void reset()
	{
		for (int i=0;i<numVertices;i++){
			vertexList[i].reset();
		}
	}

}
