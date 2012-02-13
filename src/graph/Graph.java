package graph;

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
		stack = new Stack(s);
	}
	public void addVertex(char label)
	{
		vertexList[numVertices++]= new Vertex(label);
	}
	
	public void addEdge(int start, int end)
	{
		adjMatrix[start][end]=1;
		adjMatrix[end][start]=1;
	}
	
	public void displayVertex(int v)
	{
		System.out.print(vertexList[v].getLabel()+" ");
	}
	
	public void dfs()
	{
		vertexList[0].visit();
		displayVertex(0);
		stack.push(0);
		
		while (!stack.isEmpty()){
			int v = getAdjUnvisitedVertex(stack.peek());
			if (v==-1)
				stack.pop();
			else{
				vertexList[v].visit();
				displayVertex(v);
				stack.push(v);
			}
		}
	}
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

}
