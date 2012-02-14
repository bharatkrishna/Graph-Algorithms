package test;

import graph.Vertex;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VertexTest {
	
	@Test
	public void SimpleTest()
	{
		Vertex v = new Vertex('a');
		assertEquals('a', v.getLabel());
		
		assertEquals(false, v.wasVisited());		
		v.visit();
		assertEquals(true, v.wasVisited());
		
		v.reset();
		assertEquals(false, v.wasVisited());	
		
	}	

}
