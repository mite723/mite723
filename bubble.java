public class bubble
{

 public static void bubblesort(int [] arr ){ 
  int temp;
    for(int i =0;i<arr.length-1;i++)
    {
        for(int j =0 ;j<arr.length-i-1;j++)
        { 
            if (arr[j]>arr[j+1])
            { temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            }
            
        }                                                    
    }
 for(int i =0;i<arr.length;i++)
 System.out.print(arr[i]+" ");
 }


 public static void main(String[] args)
 {
 int []  arr={2,8,-2,4,6,7,8};
 bubblesort(arr);

 }
}



    