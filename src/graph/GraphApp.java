package graph;

public class GraphApp {
	public static void main(String[] args)
	{
		Graph newGraph = new Graph(10);
		newGraph.addVertex('A');
		newGraph.addVertex('B');
		newGraph.addVertex('C');
		newGraph.addVertex('D');
		newGraph.addVertex('E');
		
		newGraph.addEdge(0, 1);
		newGraph.addEdge(1, 3);
		newGraph.addEdge(3, 2);
		newGraph.addEdge(3, 4);
		
		newGraph.dfs();
		
	}

}
