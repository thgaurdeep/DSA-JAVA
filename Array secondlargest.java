public class secondlargest {
    public static int secondlarge_ele(int arr[],int length)
    {
        int lfirst =0;
        int lsecond = 0;
        for(int i=0;i<length;i++)
        {
            if(arr[i]>lfirst)
            {
                lsecond=lfirst;
                lfirst=arr[i];
            }
            else if( arr[i]>lsecond && arr[i]!= lfirst)
            {
                lsecond=arr[i];
        
            }
            
        }
        return lsecond;

    }

    public static void main(String[] args)
    {
        int arr[] = {2,5,3,6,44,8,9};
        int length = arr.length;
        System.err.println(secondlarge_ele(arr, length));
    }
}
