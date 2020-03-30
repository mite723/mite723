import java.util.*;
class bst
{
    static node root=null;
   static class node
    {
        int data;
        node left;
        node right;
         node(int d)
        {
            this.data=d;
            this.left=this.right=null;
        }
    }

            
    public static void display(node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" -> ");
        if(root.left!=null) System.out.print(root.left.data+" ");
        if(root.right!=null) System.out.print(root.right.data+" ");
        System.out.println(".");
        if(root.left!=null) display(root.left);
        if(root.right!=null) display(root.right);
    }
    public static node sort2bst(int[] data,int start,int last)
    {   
        if(start>last)
        {
            return null;
        }
        int mid=(start+last)/2;
        node n=new node(data[mid]);
        n.left=sort2bst(data,start,mid-1);
        n.right=sort2bst(data,mid+1,last);
        return n;

    }
    public static int height( node root)
    { if(root==null)
    {
        return 0;
    }
    int h1=height(root.left);
    int h2=height(root.right);
    int myheight=Math.max(h1,h2)+1;
    return myheight;
    }
    public static int max(node root)
    { while(root.right!=null)
    {
      root=root.right;
    }
    return root.data;
    }    
    public static int min(node root)
    {
        while(root.left!=null)
        {
            root=root.left;
        }
        return root.data;
    }
    public static node lca(node root,int a,int b )
    {
        //root=lca
    if(root.data==a || root.data==b || a<root.data || b>root.data)
        return root;
        //root/left
         else if(a<root.data &&b<root.data )
        return lca(root.left,a,b);
        //root//right
          else
         return lca(root.right,a,b);

    }
    public static int suminrange(node root,int lo,int hi)
    {
        int mysum=0;
        
    }
    
    public static void main(String[] args)
    {
        int [] data={10,20,30,40,50,60,70,80,90,100,110};
       // construct(data);
       
        node myans=sort2bst(data,0,data.length-1);
        display(myans);
        int y =max(myans);
        int z=min(myans);
        System.out.println("height of the bst tree is "+height(myans));
        System.out.print("max value is "+ y);
        System.out.println("");
        System.out.print("min value is " + z);
        node myans1=lca(myans,30,90);
        System.out.println("");
        System.out.print(myans1.data);
        



    }

}