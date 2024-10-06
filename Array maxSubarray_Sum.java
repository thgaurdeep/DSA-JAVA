public class maxSubarray_Sum {
public static void maxSubarr_Sum(int arr[])
    {
    
        int currsum =0;
        int maxsum = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                currsum=0;
                for(int k=i;k<=j;k++)
                {
                    currsum=currsum+arr[k] ;

                }
                System.err.println(currsum);
                if(currsum>maxsum)
                {
                    maxsum=currsum;
                }
            }
        }
        System.err.println("the sum of maxsubarray is => "+maxsum);
    }

    public static void main(String[] args)
    {
        int arr[]={4,5,3,6,2,8};
        maxSubarr_Sum(arr);
    }
    
}
