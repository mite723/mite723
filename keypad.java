import java.util.*;
public class keypad
                                                   {
    public static ArrayList<String> nokia(String[]codes,String que)
    {
        if(que.length()==0)
        {
            ArrayList<String> baseres = new ArrayList<>(); 
            baseres.add("");
            return baseres;
        }
        char ch =que.charAt(0);
        String roq=que.substring(1);
        int idx= ch - '0';// type cast as val of char string is in ascii value so it will not take index instead take its ascii value
        String code =codes[idx];
        ArrayList<String> myans= new ArrayList<>();
        ArrayList<String> recans=nokia(codes,roq);
        for(int i =0;i<code.length();i++)
        {
            for(String str: recans)
            {
                myans.add(code.charAt(i)+str);
            }
        }
        return myans;

    }
    public static void main(String[] args)
    {
        String [] codes={"?.","./","abc","def","ghi","jkl","mno","pqrs","tuvw","xyz"};
        String que ="234";
        ArrayList<String> ans= nokia(codes,que);
        System.out.print(ans);

    }

}

