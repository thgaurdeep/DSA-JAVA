public class grideways {
    public static int grideway(int i,int j, int n,int m)
    {
        if(i==n-1||j==n-1)
        {
            return 1;
        }
        else if(i==n||j==n)
        {
            return 0;
        }

        int w1= grideway(i+1,j,n,m);
        int w2=grideway(i,j+1,n,m);

        return w1+w2;
    }

    public static void main(String[] args)
    {
        int m=5;
        int n=5;
        System.out.println("\nthe total gride ways are  "+grideway(0,0,n,m));
    }
    
}
