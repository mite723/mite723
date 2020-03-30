import java.util.*;   
public class string12
{ 
    public static void rev(String input,char[] temparray,int right )
{
    for (int left=0; left < right ; left++ ,right--) 
        { 

            char temp = temparray[left]; 
            temparray[left] = temparray[right]; 
            temparray[right]=temp; 
        } 
  
        for (char c : temparray) 
            System.out.print(c); 
            
        System.out.println(); 
}
    public static void main(String[] args) 
    { 
        String input = "jack and jill up a hill"; 
        char[] temparray = input.toCharArray(); 
        int right=0; 
        right = temparray.length-1;
     rev(input,temparray,right);
  
    }
} 