import java.util.Scanner;
public class stringfun {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        //to calculate the length of string

        int length= name.length();
        System.err.println(length);
    
        //to make upper case and lower case

        String upper= name.toUpperCase();
        String lower = upper.toLowerCase();

        System.err.println(upper +" "+ lower);

        //to find the index of specific text or char

        int index = name.indexOf("s");
        System.err.println("the index of is ==>> "+index);

        //to find  the specific index character

        char at = name.charAt(3);
        System.err.println("for charat "+at);

    


        sc.close();
    }
    
}
