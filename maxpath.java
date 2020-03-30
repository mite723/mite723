    
import java.util.*;

public class maxpath {

	static class edge {
		int v1;
		int v2;
		int wt;

		edge(int a, int b, int wt) {
			this.v1 = a;
			this.v2 = b;
			this.wt = wt;
		}
	}

	static void addEdge(ArrayList<ArrayList<edge>> graph, int a, int b, int wt) {
		graph.get(a).add(new edge(a, b, wt));
		graph.get(b).add(new edge(b, a, wt));
	}

	static int max = Integer.MIN_VALUE;
    static String maxpath=" ";
	static void maxCostPath(ArrayList<ArrayList<edge>> graph, int s, int d, boolean visited[], int cost,String path )
    {
    		if (s == d) 
			
            {
                if (max < cost) 
                {			
				max = cost;
                maxpath=path+d;
			     }
			  return;
		}

		visited[s] = true;
		
		for (int ce = 0; ce < graph.get(s).size(); ce++) {
			edge e = graph.get(s).get(ce);
			if ( ! visited[e.v2] )
				maxCostPath(graph, e.v2, d, visited, cost + e.wt,path+s+" ");
		}
		visited[s] = false;
    }

	

	public static void main(String[] args) {
		ArrayList<ArrayList<edge>> graph = new ArrayList<>();
		for (int i = 0; i < 7; i++) {
			graph.add(new ArrayList<edge>());
		}

		addEdge(graph, 0, 3, 40);
		addEdge(graph, 1, 0, 10);
		addEdge(graph, 2, 1, 10);
		addEdge(graph, 3, 2, 10);
		addEdge(graph, 4, 3, 2);
		addEdge(graph, 5, 4, 3);
		addEdge(graph, 6, 5, 3);
		addEdge(graph, 6, 4, 8);

		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		boolean[] visited = new boolean[graph.size()];
        String path=" ";
		maxCostPath(graph, a, b, visited, 0,path);
		System.out.println(max);
        System.out.print(maxpath);
	}

}
