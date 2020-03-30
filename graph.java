import java.util.*;
class graph
{
    static class edge{
        int v1;
        int v2;
        int wt;
        edge(int a ,int b ,int cost)
        {
            this.v1=a;;
            this.v2=b;
            this.wt=cost;
        }
    }
    public static void addedge(ArrayList<ArrayList<edge>> graph,int v1,int v2,int wt)
    {
        graph.get(v1).add(new edge(v1,v2,wt)); // v1 se v2 ka rasta 
        graph.get(v2).add(new edge(v2,v1,wt));//v2 se v1 ka rasta kyunki bidirectional hai

    }
    public static void display(ArrayList<ArrayList<edge>> graph)
    {
        for(int i=0;i<graph.size();i++)//ek ek vertex pe jayega 
        {  System.out.print(i+" -> ") ;//vertex ki value print krwaega
            for(int j =0;j<graph.get(i).size();j++) // ek ek vertex ke ander vwaali values mein jayega
        {        edge cedge=graph.get(i).get(j); //ander vale edge ki pehli position 
            System.out.print("(" +cedge.v2+ ";" +cedge.wt+") -");
        }
         System.out.println();      
        }
    }
    public static boolean haspath(int s,int d ,boolean[] visited,ArrayList<ArrayList<edge>>graph)
    {
        if(s==d)
        {
            return true;
        }
      visited[s]=true;
      for(int i =0;i<graph.get(s).size();i++)
      {
          edge ce=graph.get(s).get(i);
          if(visited[ce.v2]==false)
          {
              boolean ans=haspath(ce.v2,d,visited,graph);
              if(ans)
              {
                
                  return true;
              }
          }
      } 
      return false;
        
    }
    public static boolean singlepath(int s,int d , boolean[] visited1,ArrayList<ArrayList<edge>>graph,String path)
    {
        if(s==d)
        { 
            System.out.print(path+" "+d);
              System.out.println();
            return true;
        }
      visited1[s]=true;// coming value ko true krdega taaki vo spot ek b
      for(int i =0;i<graph.get(s).size();i++)
      {
          edge ce=graph.get(s).get(i);
          if(!visited1[ce.v2])
          {
              boolean ans1=singlepath(ce.v2,d,visited1,graph,path+" "+s);
              if(ans1)
              {
                  return true;
              }
          }
      } 
      return false;
        
    }
       public static void allpath(int s,int d , boolean[] visited1,ArrayList<ArrayList<edge>>graph,String path)
    {
        if(s==d)
        { 
            System.out.print(path+" "+d);
              System.out.println();
            return ;
        }
      visited1[s]=true;
      for(int i =0;i<graph.get(s).size();i++)
      {
          edge ce=graph.get(s).get(i);
          if(!visited1[ce.v2])
          {
              allpath(ce.v2,d,visited1,graph,path+" "+s);
        
          }
        
      } 
      visited1[s]=false;// ye true wale block ko false krdgega just lyk flood fill ye eeche jaake check krega ki agr false hai toh dubara rasta khul jayega 

        
    } 
    public static void main(String[] args)
    { 
        ArrayList<ArrayList<edge>> graph=new ArrayList<ArrayList<edge>>();
        for(int i =0;i<=7;i++)
        {
            graph.add(new ArrayList<edge>());
        }
        addedge(graph,1,4,40);
        addedge(graph,1,2,10);
        addedge(graph,2,3,10);
        addedge(graph,3,4,10);
        addedge(graph,4,5,2);
        addedge(graph,5,6,3);
        addedge(graph,5,7,8);
        addedge(graph,6,7,3);
        display(graph);

        boolean visited[] = new boolean[graph.size()];
        System.out.print(haspath(1,7,visited,graph));

        System.out.println();
        boolean visited1[] = new boolean[graph.size()];
        String path=" " ;
       // System.out.print(singlepath(1,7,visited1,graph ,path));
        allpath(1,7,visited1,graph,path);
    }
}
