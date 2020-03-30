public class mazepath_dp
{
    public static int mazepath_tab(int sr,int sc,int er,int,ec)
    {
        int [] [] dp = new int[er+1][ec+!];
        for(int i = dp.length-1;i>=0;i--)
            for(j= dp[0].length-1;j>=0;j--)
               if(i==dp.length-1 && j=dp[0].length-1)
                  dp[i][j]=1;
                else  if(i==dp.length-1)
                 dp[i][j]=dp[i][j+1];
               else if(j==dp[0].length-1)
                  dp[i][j]=dp[i+1][j];
               else 
                dp[i][j]=dp[i+1][j]+dp[i][j+1] ;
                 
    return dp[0][0];
    }
 public static void main(String[] args)
 {
     mazepath(4,3,0,0);
 }
                  
    }