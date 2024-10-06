public class subArray {
    public static void subarray(int arr[])
    {
        int count=0;
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i;j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.err.print(arr[k]+" ");
                }
                count++;
                System.err.println();
            }
            System.err.println();
        }
        System.err.println("total subarray is => "+count);
    }

    public static void main(String[] args)
    {
        int arr[]={3,5,3,6,7};
        subarray(arr);
    }
    
}
