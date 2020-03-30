public class thief
{
    public static int knapsack(int[] cost,int [] wt,int cap)
    {
        int [] dp = new int [cost.length+1][cap+1];
        for(int i =1;i<dp.length;i++)
         {
             for(int j =0;j<dp[0].length;j++)
             {dp[i][j]=dp[i-1][j];// na ki call
               if(j=wt[i-1]>=0) //han ki call valid hai ya nahi 
               {
                 if(dp[i][j]<(cost[i-1]+dp[i-1][j-wt[i-1]]))// agr h toh utha 
                 dp[i][j]=cost[i-1]+dp[i-1][j-wt[i-1]];
               }

             }
         }
         return dp[cost.length][cap];
    }

    public static void main(String[] args)
    {
        int [] cost ={45,20,30,25,15};
        int[] wt={3,4,1,2,5};
        System.out.print(knapsack(cost,wt,7));
    }
}