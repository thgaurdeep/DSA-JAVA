public class tillingproblem {
    

    public static int tile(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        return tile(n-1)+tile(n-2);
    }

    public static void main(String[] args)
    {
        System.err.println("the numbers of ways to fill the board bt tiles is -->"+tile(41));
    }
}
