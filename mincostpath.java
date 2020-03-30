class mincostpath
{



     public static int costpath(int [] [] arr)
    {
        int [] [] dp = new int[arr.length][arr[0].length];
        
        for(int i = dp.length-1;i>=0;i--)
        {
            for(int j= dp[0].length-1;j>=0;j--)
            {
               if(i==dp.length-1 && j==dp[0].length-1)
                   dp[i][j]=arr[i][j];
                else  if(i==dp.length-1)
                 dp[i][j]=arr[i][j]+dp[i][j+1];
               else if(j==dp[0].length-1)
                  dp[i][j]= arr[i][j] + dp[i+1][j];
               else 
                dp[i][j]=arr[i][j]+Math.min(dp[i+1][j],dp[i][j+1]) ; 
            }
        }    
    return dp[0][0];
    }



    public static void minpath(int [][] dp,int i,int j ,String path)
    {
        if(i==dp.length-1&&j==dp[0].length-1)
        {
            System.out.print(path);
            return;
        }
         if(i==dp.length-1)
         {
             minpath(dp,i,j+1,path+"H")
         }
         else if (j==dp[0].length-1)
         {
           minpath(dp,i+1,j,path+"V");
         }
         else 
         {
             int min =dp[i][j+1];
             if(min>dp[i+!][j])
             {
                 min=dp[i+1][j];       
              }
         
         if(min==dp[i][j+1])
          minpath(dp,i,j+!,path+"H");
          if(min==dp[i+1][j])
          minpath(dp,i+1,j,path+"v");
         }

     }

     public static void main(String[] args)
 {
     int[][] arr ={
        {2,0,1,3,1},
        {1,4,6,2,5},
        {1,1,2,6,9} ,
        {4,5,3,8,5},
        {4,9,2,0,0},
        {3,3,1,7,8}
        };

        int [][] new1=costpath(arr);
       minpath(new1,0,0,"");
 }
                  
    }
    }
