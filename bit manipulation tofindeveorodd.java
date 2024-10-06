import java.util.Scanner;
public class tofindeveorodd {

    public static void evenORodd(int n)
    {
        int bitMask =1;
        
        if((n & bitMask) ==0)
        {
            System.out.println("n is even :"+n);

        }
        else{
            System.out.println("n is odd :"+n);
        }

    }

    public static void main(String[] args)
    {
        System.err.println("please enter your number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        evenORodd(n);
        
        sc.close();
    }
    
}
