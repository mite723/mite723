import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class generic {
    static node root=null;
  static class node {
        int data=0;
        ArrayList<node> child;// it will contain its bcche 
        node(int d)//constructor 
        {
            this.data=d;
            this.child=new ArrayList<>();
        }

    }

public static void construct(int [] data)
{
    ArrayList<node> stack = new ArrayList<>();
    for(int i =0;i<data.length;i++)
    {
        if(data[i]==-1)
        {
            stack.remove(stack.size()-1);
        }
        else 
        {
            if(root==null)
            {
            node n =new node(data[i]);
            root=n;
            stack.add(n);
            }
            else{
                node cp=stack.get(stack.size()-1);
                node n =new node(data[i]);
                cp.child.add(n);
                stack.add(n);

            }  
        }
    }
}
public static void display(node croot)
{
    if (croot==null)
    {
        return ;
    }
    System.out.print(croot.data+"->");
    for(int i =0;i<croot.child.size();i++)
    {
        System.out.print(croot.child.get(i).data+" ");
    }   
    System.out.println(".");
    for(int i =0;i<croot.child.size();i++)
    {
        display(croot.child.get(i));
    }

}
public static int size(node root)
{
    if(root==null)
    {
        return 0;
    }
    int mysize=1;
    for(int i =0;i<root.child.size();i++)
    {
        mysize+=size(root.child.get(i));
    }
  return mysize;
}
public static int maxi(node root)
{
    if(root==null)
    {
        return Integer.MIN_VALUE;
    }
    int mymax=root.data;
    for(int i =0;i<root.child.size();i++)
    {
       int recmax= maxi(root.child.get(i));
       if(mymax<recmax)
       {
           mymax=recmax;
       }
    }
    return mymax;
}

public static int find(node root,int num)
{ int flag=0;
 System.out.println(root.data);
if(root.data==num)
   return 1 ;
    
 for(int i =0;i<root.child.size();i++)
    {
        int reans=find(root.child.get(i),num);
        if(reans==1)
        {
            return 1;
        }
    }
 return flag;  
} 
 public static ArrayList<Integer> n2rp (node root,int data)
 {
  if (root==null)
  {
      return null;
  }
  if(root.data==data)
  {
      ArrayList<Integer> myans= new ArrayList<>();
      myans.add(data);
      return myans;
  }
  for(int i =0;i<root.child.size();i++)
  {
      ArrayList<Integer> recans=n2rp(root.child.get(i),data);
      if(recans!=null)
      {
          recans.add(root.data);
          return recans;
      }
  } return null;
 }




public static int lca(node root,int d1,int d2)
{
    ArrayList<Integer> ans1=n2rp(root,d1);
    ArrayList<Integer> ans2=n2rp(root,d2);
    int i =ans1.size()-1;
    int j=ans2.size()-1;
    while(i>=0 &&j>=0 )
    {
        if(ans1.get(i)!=ans2.get(j))
        {
            break;
        }
        i--;j--;
    }
    return ans1.get(i+1);
}



public static void levelorder(node root)
{
    Queue<node> qu=new LinkedList<>();
    qu.add(root);
    while(qu.size()!=0)
    {
        node cp= qu.peek();
        qu.remove();
        System.out.print(cp.data+ " ");
        for(int i =0;i<cp.child.size();i++)
        {
            qu.add(cp.child.get(i));
        }
    }
}
                   
public static void zigzag(node root)
{
    ArrayList<node> stack =new ArrayList<>();
    Queue<node> qu=new LinkedList<>();
    qu.add(root);
    boolean flag=true;
    while(qu.size()!=0 )
    {
        node cp=qu.peek();
        qu.remove();
        System.out.print(cp.data + " ");
        if(flag==true)
        {
        for(int i =0;i<cp.child.size();i++)
        {
             stack.add(cp.child.get(i));
    

        }
        }
        else 
        {
        for(int i =cp.child.size()-1;i>=0;i--)
        {
            stack.add(cp.child.get(i));
        }
        }
        if(qu.size()==0)
        {
            while(stack.size()>0)
            {
                  qu.add(stack.remove(stack.size()-1));
            }
            flag=!flag;
        }
    }

}


public static void main(String [] args )
{
    int [] data={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100};
   construct(data);
    System.out.println(root.data);   
   display(root); 
   System.out.println(size(root));
     System.out.println(maxi(root));
     System.out.println(find(root,75));
     ArrayList<Integer> ans=n2rp(root,110);
    System.out.print(ans);
    System.out.println(lca(root,110,90));
     levelorder(root);
    zigzag(root);
  
}
}