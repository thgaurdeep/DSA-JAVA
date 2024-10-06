public class permutation{
    public static void findpermutation(String str,String newstr)
    {
        if(str.length()==0)
        {
            System.err.println(newstr);
            return;
        }

        for(int i=0;i<str.length();i++)
        {
            char curr= str.charAt(i);
            String nstr=str.substring(0, i)+str.substring(i+1);
            findpermutation(nstr,newstr+curr);

        }
    }

    public static void main(String[] args)
    {
        String str ="abcdfgdgdh";
        findpermutation(str,"");
    }

}