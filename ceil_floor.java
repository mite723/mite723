import java.util.*;

public class ceil_floor {

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

	static String cp; // ceilpath
	static String fp; // floorpath
	static int cpc = Integer.MAX_VALUE; // cp cost
	static int fpc = Integer.MIN_VALUE; // fp cost

	static void CeilfloorPath(ArrayList<ArrayList<edge>> graph, int src, int dest, int factor,boolean visited[],String path,int cost){
	    if(src==dest){
	        path=path+dest;
	        if(cost>factor && cost<cpc ){
	            cpc=cost;
	            cp=path;
	            
	        }
	        if(cost<factor && cost>fpc)
	        {
	            fpc=cost;
	            fp=path;
	        }
	        return;
	        
	    }
		visited[src]=true;
		for(int i =0;i<graph.get(src).size();i++){
		    edge cr=graph.get(src).get(i);
		    if(!visited[cr.v2]){
		        CeilfloorPath(graph,cr.v2,dest,factor,visited,path+src+"-",cost+cr.wt);
		    }
		}
		visited[src]=false;
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
		int factor=scn.nextInt();
		
		String path="";
		int cost;
        boolean visited[]=new boolean[graph.size()]	;
		CeilfloorPath(graph, a, b,factor,visited,path,0);
		System.out.println(cp + "@" + cpc);
		System.out.print(fp + "@" + fpc);
	}	}
