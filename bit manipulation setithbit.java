public class setithbit {

    public static int  setithb(int n,int i)
    {
        int bitmask= 1<<i;
        return n|bitmask;

    }
    public static void main(String[] args)
    {
        int i=1;

        int n=10;

       System.out.println(setithb(n,i));
    }
    
}
