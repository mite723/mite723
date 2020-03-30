public class stair
{
    public static int stairpath(int n )                            
    {
        int []  a =new int[n+1];
        for(int i =a.length-1 ;i>=0;i--)
        { 
            if(i==a.length-1)
                a[i] = 1;
            else if (i==a.length-2)
            a[i]=a[i+1];
            else if  ( i==a.length-3)
            a[i]=aa[i+2];
            else if (i==length-4);
            a[i]=a[i+1]+a[i+2]+a[i+3];
            

        }
    }
}