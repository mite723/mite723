import java.util.*;
public class subse{
    public static void subseq(String que,String ans)
    {
        if(que.length()==0)
        {
            System.out.println(ans);
            return;
        }
        char ch=que.charAt(0);m
        String roq=que.substring(1);
        subseq(roq,ans+ch);
        subseq(roq,ans);\
    }
    public static ArrayList<String> subseq1(String que)
    {
        if (que.length()==0)
        {
            ArrayList<String> baseres= new ArrayList<>();
            baseres.add("");
            return baseres;
        }
        String roq = que.substring(1);
        ArrayList<String> recans = subseq1(roq);
        ArrayList<String> myans = new ArrayList<String>();
        char ch = que.charAt(0);
        // for (string str : recans )
       // {
         //   myans.add(str.ch)
        //}
        for(int i =0;i<recans.size();i++)
          myans.add(ch + recans.get(i));
        for(int i =0;i<recans.size();i++)
            myans.add(recans.get(i));
        return myans;

    }
    public static int stairpath(int n)
    {
        if(n==0)
        {return 1;
         }
        int myans=0;
        if(n-1>=0)
        myans=myans+stairpath(n-1);
        if(n-2>=0)
        myans=myans+stairpath(n-2);
        if(n-3>=0)
        myans=myans+stairpath(n-3);
        return myans;
    }
    // GIVEN IN LEC11 OF GITHUB 

   /* public static ArrayList<String> stairpath1(int n)
    {
        if(n==0)
        { ArrayList<Str
         }
        int myans=0;
        ArrayList<Integer> arr =new ArrayList<Integer>();
       // ArrayList<Integer> arr1 =new ArrayList<Integer>();
       // ArrayList<Integer> arr2 =new ArrayList<Integer>();
        arr.add("");
       // arr1.add("");
       // arr2.add("");
        if(n-1>=0)
        {
        arr.add(stairpath1(n-1));
        System.out.print("a");
        }
        if(n-2>=0)
        {
        arr.add(stairpath1(n-2));
        Sytem.out.print("b");
        }
        if(n-3>=0)
        {
        arr.add(stairpath1(n-3));
        System.out.print("c");
        }
       /* return arr;*/
    }*/

    
    public static void main(String[] args )
    {
        String que="abc";
        String ans="";
        subseq(que,ans);
        ArrayList<String> newans = subseq1(que);
        System.out.println(newans);
        System.out.print(stairpath(7));
      //  System.out.print(stairpath1(4))

    }
}