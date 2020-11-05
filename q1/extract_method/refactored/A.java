package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
	  extractedMethod(nodes, p);
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
	  extractedMethod(edgeList, p);
      return null;
   }
//extracted method:
  <T extends Graph> void extractedMethod(List<T> objects, String p)
  {
	  for (T obj : objects) {
			if (obj.contains(p))
				System.out.println(obj);
		}
  }

}