public class Getithbit {

    public static int getithbit(int n,int i)
    {
        int bitmask = 1<<i;
        
        if((n&bitmask)==0)
        {
            return 0;

        }
        return 1;
    }

    public static void main(String[] args)
    {
        int i=5;
        int n=120;
       System.out.println( getithbit(n,i));
    }
    
}
