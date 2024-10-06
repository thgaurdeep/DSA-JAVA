public class clearithbit {


    public static int clearithb(int n,int i)
    {
        int bitmask = ~(1<<i);
        return n&bitmask;
    }

    public static void main(String[] args)
    {
        int i=2;
        int n=10;
       System.out.println( clearithb(n,i));
    }
    
}
