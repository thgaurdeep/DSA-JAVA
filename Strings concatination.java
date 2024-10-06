public class concatination {

    public static void printchar(String str)
    {
        for (int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+" ");

        }
        System.err.println();
    } 

    public static void main(String[] args)
    {
        String firstname= "Deepak";
        String lastname = "gaur";

        String fullname = firstname+" "+lastname;
        System.err.println(fullname);

        printchar(fullname);
    }
    
}
