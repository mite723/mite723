
public class string
{
    public static String toggle(String a)
    { String ans="";
      for(int i =0;i<a.length();i++)
        {char ch =a.charAt(i);
        if(ch>='a' && ch<='z')
         ch =(char)(ch-'a'+'A');//greater number
        else
         ch =(char) (ch-'A'+'a');//smaller number 
         ans=ans+ch;
        
        }
    return ans; 
    }

  public static void main(String [] args)
  {
      String a="aAbkL";
      System.out.println(toggle(a));
  }
}