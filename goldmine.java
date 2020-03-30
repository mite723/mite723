public class goldmine
{
    public static int goldmine (int [] [] arr)
    
    {
        int [] [] dp = new int[arr.length][arr.length];
        
        for(int j = dp[0].length-1;j>=0;j--)
        {
            for(int i= dp.length-1;i>=0;i--)
            {
            if(j==dp[0].length-1)
            { dp[i][j]= arr[i][j];
            }
            else if(i==dp.length-1)
            {
             dp[i][j]=arr[i][j];
             dp[i][j]+=Math.max(dp[i-1][j+1],dp[i][j+1]);
            }
            else if (i==0)
            { 
                dp[i][j]=arr[i][j];
                dp[i][j]+=Math.max(dp[i+1][j+1],dp[i][j+1]);

            }
            else {
            dp[i][j]=arr[i][j];
            int max = Math.max(dp[i-1][j+1],dp[i][j+1]);
            max = dp[i][j]+Math.max(max,dp[i+1][j+1]);
            dp[i][j]=max;
            }
        }
        
    }
  int ans =Integer.MIN_VALUE;
  for(int i =0;i<dp.length;i++)
  {
      if(dp[i][0]>ans)
      {
          ans=dp[i][0];
      }
  }

    return  ans;
    } 




 public static void main(String[] args)
 {
    
int [] [] arr ={
                    {4,8,2,7,9,4},
                    {3,7,6,4,3,1},
                    {5,1,2,3,5,6},
                    {4,3,6,8,4,2},
                    {1,2,6,4,2,6},
                    {2,8,1,9,3,7}
                  };
                  System.out.print(goldmine(arr));

                  }
    }