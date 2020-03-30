public class zero_one
{
    public static void swap0_1(int[] arr)
    {
       int i =0,j=0;
       while(i<=arr.length-1)
       {
         if (arr[i]==0)
           { int temp =arr[i];
             arr[i]=arr[j];
             arr[j]=arr[temp];
               i++;j++;
           }
           else
           i++;
       } 
       for(int k =0;k<arr.length;k++)
        System.out.print(arr[k]);
    }
     public static void main(String [] args)
     {
         int a[] ={0,1,1,0,1,0,0};
         swap0_1(a);
     }
}