public class duplicate_element {
    public static int duplicateforunsorted(int arr[],int length)
    {
        for(int i=0;i<length-1;i++)
        {
            for(int j=i+1;j<length;j++)
            {
                if(arr[i]==arr[j]){
                    return 1;
                }
            }

        }
        return -1;
    }

    public static int duplicateforsorted(int arr1[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            if(arr1[i]==arr1[i+1])
            {
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int arr[] = {2,3,43,2,23,56,54,32};
        int arr1[] = {1,2,3,4,5,5,6,7};
        int length = arr.length;
        int n = arr1.length;
        int index = duplicateforunsorted(arr,length);
        int ind = duplicateforsorted(arr1,n);
        System.err.println("duplicate element for unsorted array --> "+index);
        System.err.println("duplicate element for sorted array --> "+ind);
    }
}
