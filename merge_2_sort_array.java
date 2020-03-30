import java.util.*;
class merge_2_sort_array
{
    public static int[] sort_array(int [] a,int[] b)
    {  int[] c = new int[a.length+b.length];
       int i=0,j=0,k=0;
       while(i<a.length && j<b.length)
       {
           if(a[i]<b[j])
           {
               c[k]=a[i];
               i++; k++;
           }
           else 
           { c[k]=b[j];
           j++;k++;}
       }
       while(i<a.length)
       {
           c[k]=a[i];
           i++;k++;
       }
        while(j<b.length)
        {
            c[k]=b[j];
            j++;k++;
        }
        
        return c;
    }
    public static void main(String [] args)
    { 
        int [] a ={3,5,8,9,15,18,20,22,25};
        int [] b={1,2,10,11,17,19};
        int [] c=sort_array(a,b);
        for(int i =0;i<c.length;i++)
        System.out.print(c[i]+" ");
    }
}