public class clearlastibit {

    public static int clearith(int n,int i)
    {
        int bitmask =(-1)<<i;  //(~0<<i)

        return   n & bitmask;
    }

    public static void main(String[] args)
    {
        int i=2;
        int  n=15;
        System.out.println(clearith(n,i));
    }


    
}
