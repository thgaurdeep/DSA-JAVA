public class reversearray {
    public static  void reverse(int arr[])
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            int temp =arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
       
    }


    public static void main(String[] args) {
    int arr[] = {1,2,3,5,6,7};
    for(int i=0;i<arr.length;i++)
    {
        System.err.print(arr[i]+" ");
    }
    System.err.println();
   
    reverse(arr);
    for(int i=0;i<arr.length;i++)
    {
        System.err.print(arr[i]+" ");
    }
        
    }
    
    
}
