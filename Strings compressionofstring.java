public class compressionofstring {

    public static String compressed(String str)
    {
        StringBuilder sb = new StringBuilder();
        int n= str.length();
        for(int i=0;i<n;i++)
        {
            Integer count =1;
            while(i<n-1&&str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;

            }
            sb.append(str.charAt(i));
            if(count>1)
            {
                sb.append(count.toString());

            }
            
        }
        return sb.toString();
    }
    
    public static void main(String[] args)
    {
        String str = "aaaabbbccd";
        String str1 = "abcde";

        System.err.println();
        System.out.println(compressed(str));
        System.out.println(compressed(str1));
    }
}
