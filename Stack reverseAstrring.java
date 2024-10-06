import java.util.*;

public class reverseAstrring {

    public static String reverseString(String str)
    {
        Stack<Character>s=new Stack<>();
        int ind=0;
        while(ind<str.length()){
            s.push(str.charAt(ind));
            ind++;


        }
        StringBuilder result =new StringBuilder(" ");
        while(!s.isEmpty())
        {
            char curr=s.pop();
            result.append(curr);

        }
        return result.toString();


    }

    public static void main(String[] args)
    {
        String str="abcd";
        String result= reverseString(str);
        System.err.println(result);
    }
    
}
