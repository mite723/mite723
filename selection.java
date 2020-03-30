public class selection
{
    public static void sort(int [] arr)
    { int sort,temp;
        for(int i =0;i<arr.length;i++)
        { int index = i;
            for(int j=i+1;j<arr.length-1;j++)
            {
                if(arr[index]>arr[j])
                {temp=arr[index];
                arr[index]=arr[j];
                arr[j]=temp;
                }
                

            }
        }
        for(int i=0;i<arr.length;i++)
        {
        System.out.print(arr[i]+" ");
        }
    }

 public static void main(String [] args)
    {
        int [] arr = {2,5,-1,3,6,1};
        sort(arr);
    }

}