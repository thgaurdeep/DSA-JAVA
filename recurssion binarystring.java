public class binarystring {

    public static void bstr(int n,int lastplace,String str)
    {
        if(n==0)
        {
            System.err.println(str);
            return ;

        }
        bstr(n-1,0,str+"0");
        if(lastplace==0)
        {
            bstr(n-1, 1, str+"1");
        }
    }

    public static void main(String[] args)
    {
        bstr(3, 1,"");
    }
    
}
