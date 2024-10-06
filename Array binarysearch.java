public class binarysearch {
    public static int binarySea(int arr[],int key)
    {
        int start =arr[0];
        int end = arr.length-1;
        //int res =-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]==key)
            {
                
                return mid;
            }
            if(arr[mid]<key)
            {
                start=mid+1;
            }
            else
            {
                end = mid-1;
            }
        }

        return -1;


    }

    public static void main(String[] args)
    {
        int arr[] ={1,2,3,4,5,6,7,8,9,10,11,12};
        //int length = arr.length;
        int key =4;
        
        System.err.println(" key is found"+binarySea(arr,key));
        //System.err.println(index);

    }
    
}
