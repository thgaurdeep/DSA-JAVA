public class prefixSumoOFmaxSubArr {

    public static void prefixSumoOFmaxSubArray(int arr[])
    {
        
            int currsum=0;
            int maxsum=Integer.MIN_VALUE;
            int prefix[]=new int[arr.length];
            prefix[0]=arr[0];
            for(int i=1;i<prefix.length;i++)
            {
                //to calculate the the  prefix array using the original array.

                prefix[i]= prefix[i-1]+arr[i]; 
    
            }
    
            for(int i=0;i<prefix.length;i++)
            {
                for(int j=0;j<prefix.length;j++)
                {
                    currsum= i==0 ? prefix[j] :prefix[j]-prefix[i-1]; //prefix array ka end -(strart-1)to calculate the sum
    
    
                    if(currsum>maxsum)
                    {
                        maxsum=currsum;
                    }
                }
              
            }
    
            System.err.println("total sum of max subarray is => "+maxsum);
    
    }
    
        public static void main(String[] args)
        {
            int arr[]={4,5,3,6,2,8};
            prefixSumoOFmaxSubArray(arr);
    
        }
    
    
}
