import java.util.*;
 class quick
{
    public static int partition(int[] a, int low,int high )
    { int i =low,j=high;
     int pivot=a[0];
     while(i<j)
     {
         do
         {
             i++;
         }while(a[i]<=pivot);
         do{
             j--;
         }while(a[j]>pivot);
        if(i>j)
        {
         int temp=a[j];
         a[i]=a[j];
         a[j]=temp;
        }
        int temp=a[j];
        a[j]=a[low];
        a[low]=temp;
    } return j;
 }
    public static void quick_sort( int [] a,int low,int high)
    {
        if(low>=high)
        {
            return;
        }
        int c =partition(a,low,high);
        quick_sort(a,low,c);
        quick_sort(a,c+1,high);
        for(int i =0;i<a.length;i++)
        System.out.print(a[i]);
    }

    public static void main(String[] args)
    {
        int [] arr = {7,3,25,2,6,8,10,1};
        int low=0;
        int high =arr.length;
      quick_sort(arr,low,high);
      
    }
}   