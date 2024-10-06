public class buyANDsellstocks {

    public static int sellnbuy(int arr[])
    {

        int buy=Integer.MAX_VALUE;
        int maxprofit=0;

        for (int i=0;i<arr.length;i++)
        {
            if(buy<arr[i])
            {
                int profit=arr[i]-buy; //profit
                maxprofit=Math.max(profit,maxprofit); //todays profit
            }
            else{
                buy=arr[i];  //buy the stock if selling price profit is lesser;
            }
            
        
        
        }
        return maxprofit;
    }

    
    public static void main(String[] args)
    {
        int arr[]={7,1,5,3,6,4};
        int pro=sellnbuy(arr);
        System.err.println(pro);

    }
    
}
