public class bitwiseoperators{

    public static void main(String[] args)
    {

        //AND (&) operator  0&0=0 ; 0&1=0 ;1&0=0 ;1&1=1

        System.out.println(5&2);

        // OR ( | )  operator 0&0=0 ; 0&1=1 ;1&0=1 ;1&1=1

        System.out.println(5|2);

        // XOR (^)  operator [ 0&0=0 ; 0&1=1 ;1&0=1 ;1&1=0 ]

        System.out.println(5^2);

        //one's complement(~)  {0=1,1=0}

        System.out.println(~5);
        
        // Shift left(<<)  (a<<b =a*2^b);

        System.out.println(5<<2);

        //rigth shift (>>)  (a>>b=a/2^b);
        System.out.println(5>>2);
    }
}