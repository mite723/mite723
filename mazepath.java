public class mazepath{
    public  static int mazepath(int sr,int sc,int er,int ec,String path)
    { if(sr==er && sc==ec)
       {
        System.out.println(path+"  ");
        return 1;
       }
      int count =0;
      if(sc+1<=ec)
      count+=mazepath(sr,sc+1,er,ec,path+"H");
      if(sr+1<=er)
      count+=mazepath(sr+1,sc,er,ec,path+"V");
      return count;
    }

    public static void main(String[] args)
    {
        String path="";
        System.out.println(mazepath(0,0,2,2," "));
    }
    
}