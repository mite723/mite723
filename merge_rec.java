import java.util.*;
class merge_rec
{
    public static int[] sort_array(int [] a,int[] b)
    { 
                
       int[] c = new int[a.length+b.length];
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
    public static int[] merge(int[] arr,int lo,int hi)
    {
        if(lo==hi)
        {
            int [] baseres = new int[1];
            baseres[0]=arr[lo];
            return baseres;
        }
       mid=(lo+hi)/2;
       int[] left = merge(arr,lo,mid);
       int [] right = merge(arr,mid+1,hi);
       int[] sorted = sort_array(left,right);
       return sorted;
    }
    public static void main(String [] args)
    { 
        int [] a ={-1,1,5,23,18,20,22,25};
        a=merge(ar,0,a.length-1);
        for(int val: arr)
        System.out.print(val+" ");
       
    }
}