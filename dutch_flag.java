public class dutch_flag
{
    public static void occur(int[] a)
    {  int i=0,k=0,j=0; // k for traverse i for 1 value j for 2 val
         while(k!=a.length)
         {
             if(a[k]==0)
             { int temp =a[k];
             a[k]=a[j];
             a[j]=temp;
             k++;
             int c =a[i];
             a[i]=a[j];
             a[j]=c;
             i++;j++;
             }
             else  if (a[k]==1)
              {
                int l =a[k];
                a[k]=a[j];
                a[j]=l;
                j++;k++;
                }
               else 
                  {
                   k++;
                   }
       }
     System.out.println(a);
    }
    public static void main(String[] args)
    {  int [] a={0,1,2,0,2,1,0,0};
        occur(a);
    }
}