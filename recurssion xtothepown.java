public class xtothepown {
    
public static int xpow(int x,int n)
{
    if (n==1)
    {
        return x;

    }

    return x*xpow(x,n-1);
}

public static int pow(int x,int n)
{
    if(n==1)
    {
        return x;

    }
    int halfpow=pow(x,n/2);

    if(n%2==0)
    {
        return halfpow*halfpow;
    }

    return x*halfpow*halfpow;


}

public static void main(String[] args){
    System.err.println(pow(2,1));
}
     
}
