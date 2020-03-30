import java.util.*;
class binarytree
{  static node root=null;
   static  class node
    {
        int data=0;
        node left;
        node right;
     node (int d )
     {
         this.data=d;
     }
       
    }
    public static void construct(ArrayList<Integer> data)
    { 
        ArrayList<node> stack=new ArrayList<>();
        for(int i =0;i<data.size();i++)
        {
            if (data.get(i)==-1)
            {
                stack.remove(stack.size()-1);
            }
            else 
            { node n =new node(data.get(i));
                if(root==null)
                 root=n;
                 else
                 {
                     node cp = stack.get(stack.size()-1);
                     if(cp.left==null)
                     {
                         cp.left=n;
                     }
                     else {
                         cp.right=n;
                     }
                 } stack.add(n);
            }   
        }
         

    }
    public static void display(node croot)
    { if (croot==null)
          {
              return;
          }
          System.out.print(croot.data+"->");
             
             if(croot.left!=null)
             {
                 System.out.print(croot.left.data+".");
             }
             if(croot.right!=null)
             {
                 System.out.print(croot.right.data+".");
             }
             System.out.println(".");
             if(croot.left!=null)
             {
                 display(croot.left);
             }
             if(croot.right!=null)
             {
                 display(croot.right);
             }
     }
     public static void rootleftright(node croot)//pre order
     {
         if(croot==null)
         {
             return;
         }
         System.out.print(croot.data+" ");
         if(croot.left!=null)
         {
             rootleftright(croot.left);
         }
         if(croot.right!=null)
         {
             rootleftright(croot.right);
         }
     }
    public static void leftrootright(node croot)// inorder
     {
         if(croot==null)
         {
             return;
         }
         
         if(croot.left!=null)
         {
             rootleftright(croot.left);
         }
         System.out.print(croot.data+" ");
         if(croot.right!=null)
         {
             rootleftright(croot.right);
         }
     }
public static void leftrightroot(node croot)//post order 
     {
         if(croot==null)
         {
             return;
         }
         
         if(croot.left!=null)
         {
             rootleftright(croot.left);
         }
         
         if(croot.right!=null)
         {
             rootleftright(croot.right);
         }
         System.out.print(croot.data+" ");
    

     }
 
     public static node create_in_pre( int [] pre,int ps,int pe,int[]in,int is,int ie)
     {
         if(ps==pe||is==ie)
         {
             return new node(pre[ps]);
         }
         node croot=new node(pre[ps]);
         int i =is;
         while(pre[ps]!=in[i])
         {
             i++;
         }
         int count =i-is;
         croot.left=create_in_pre(pre,ps+1,ps+count,in,is,i-1);
         root.right=create_in_pre(pre,ps+count+1,pe,in,i+1,ie);
         return croot;
     }
     static int max =Integer.MIN_VALUE;
     public static int maxi(node root)
     {
         if(root==null)
         {
             return max;
         }
       int mymax=root.data;
         if(root.left!=null)
         {
             mymax=maxi(root.left);
         }
         if(root.right!=null)
         {
             mymax=Math.max(mymax,maxi(root.right));
         }
         return mymax;
     }

     public static int size (node root)
     {if(root==null)
     {
         return 0;
     }
     int left =size(root.left);
     int right=size(root.right);
     return left+right+1;
        
     }
         public static int height (node root)
         {
             if(root==null)
             { 
                 return 0;
             }
             int myheight=0;
             if(root.left!=null)
             {
                 myheight=height(root.left);
             }
             if(root.right!=null)
             {
                 myheight=Math.max(myheight,height(root.right));
             }
             return myheight+1;

         }
         static class helper{
             boolean bal;
             int height;
         }
         public static helper balanced(node root)
         {if (root==null)
         {
             helper baseAns=new helper();
             baseAns.bal=true;
             baseAns.height=0;
             return baseAns;
         }
             helper lans=balanced(root.left);
             helper rans=balanced(root.right);
             helper myans= new helper();
             myans.bal = lans.bal && rans.bal && ((lans.height-rans.height)>=-1 && (lans.height-rans.height)<=1);
            myans.height=Math.max(lans.height,rans.height)+1;
            return myans;
         }
    public static void main(String[] args)
    {
    ArrayList<Integer> data= new ArrayList<>(Arrays.asList(50,70,20,-1,8,-1,-1,30,90,-1,100));
   int[] pre= {50,70,20,8,30,90,100};
    int[] in= {70,20,8,50,30,90,100};
    construct(data);
    display(root);
    rootleftright(root);
    System.out.println();
    leftrootright(root);
     System.out.println();
    leftrightroot(root);

    System.out.println();
    System.out.print("max is "+maxi(root));
    System.out.println();
    System.out.print("size is "+size(root));
    System.out.println();
    System.out.print("height is "+height(root));
   // node mynew=create_in_pre(pre,0,pre.length-1,in,0,in.length-1);
    //display(mynew);
    helper recans=balanced(root);
    System.out.print(recans.bal);
    System.out.println();
   // System.out.print(recans.height);


    }

}