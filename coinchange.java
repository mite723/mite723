public class coinchange
{
    public static int coinchange(int [] arr, int target)
    {
    int[] dp= new int[target+1];
    dp[0]=1;
    for(int i=1;i<=target;i++)
    {
        for(int j =0;j<arr.length;j++) 
        {
            if(i-arr[j]>=0)
            {
                dp[i]=dp[i]+dp[i-arr[j]];
            }
        }
    } return dp[target];
    }
    public static void main(String[] args)
    {
        int [] arr={2,3,5};
        System.out.print(coinchange(arr,7));
    } 
}