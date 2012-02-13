package graph;

public class Vertex {
	private char label;
	private boolean visited;
	
	public Vertex(char label)
	{
		this.label = label;
		visited = false;
	}
	
	public char getLabel(){
		return label;
	}
	
	public void visit(){
		visited = true;
	}
	public boolean wasVisited(){
		return visited;
	}
}
