public class selectionsort {

    public static void selectionso(int arr[])
    {
        int n= arr.length;
    for(int i=0;i<n-1;i++)
    {
        int min=i;
        for(int j=i+1;j<n;j++)
        {
            if(arr[min]<arr[j])
            {
                min=j;

            }
        }
        if(min!=i)
        {
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
}
public static void main(String[] args)
    {
        int arr[]={5,3,4,2,1};
        selectionso(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
