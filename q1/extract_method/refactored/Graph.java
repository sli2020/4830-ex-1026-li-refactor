package q1.extract_method.refactored;

public class Graph 
{
	String name;

	public boolean contains(String p) 
	{
	   return name.contains(p);
	}

}
class Node extends Graph{ }


class Edge extends Graph { }

