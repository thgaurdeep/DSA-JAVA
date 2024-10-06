public class removedupliString {

    public static void duplicate(String str,int i,StringBuilder newstr ,boolean map[])
    {
        if (i==str.length())
        {
            System.out.println(newstr);
        }

        char curr=str.charAt(i);

        if(map[curr-'a']==true)
        {
            duplicate(str, i+1, newstr, map);
        }
        else{
            map[curr-'a']=true;

            duplicate(str, i+1, newstr.append(curr), map);
        }
    }

    public static void main(String[] args)
    {
        String str ="deepakkumarshree";
      

        duplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
    
}
