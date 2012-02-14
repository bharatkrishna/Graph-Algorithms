package graph;

/**
 * Graph Vertex.  
 * 
 * @author Bharat 
 * @version 1.0
 */
public class Vertex {
	private char label;
	private boolean visited;
	
	/**
     * Constructor to initialize the label and set the visited status to unvisited.
     */
	public Vertex(char label)
	{
		this.label = label;
		visited = false;
	}
	/**
     * Method return the label of the Vertex.
     * 
     * @param  void   
     * @return     The label of the Vertex.
     */
	public char getLabel(){
		return label;
	}
	
	/**
     * Method to mark a Vertex as visited.
     * 
     * @param  void   
     * @return     None.
     */
	public void visit(){
		visited = true;
	}
	
	/**
     * Method to check if a Vertex is visited or unvisited.
     * 
     * @param  void   
     * @return     The status of the Vertex.
     */
	public boolean wasVisited(){
		return visited;
	}
	
	/**
     * Method to mark a Vertex as unvisited.
     * 
     * @param  void   
     * @return     None.
     */
	public void reset()
	{
		visited = false;
	}
}
