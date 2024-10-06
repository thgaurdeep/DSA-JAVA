import java.util.Arrays;
import java.util.Collections;
public class preuiltf {
    public static void main(String[] args)
    {
     Integer arr[]={3,5,2,1,6,3};
        //Arrays.sort(arr);
        //Arrays.sort(arr,2,4);
        Arrays.sort(arr, Collections.reverseOrder());
        for (Integer i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
} 
