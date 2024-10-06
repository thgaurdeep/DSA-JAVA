public class trappedwater {

    public static int trappedwater2(int arr[])
    {
        int n=arr.length;
        int maxright[]=new int[n];
        maxright[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            maxright[i]=Math.max(arr[i],maxright[i+1]);
        }

        int maxleft[]=new int[n];
        maxleft[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            maxleft[i]=Math.max(arr[i],maxleft[i-1]);
        }

        int trapped=0;
        for(int i=0;i<n;i++)
        {
            int waterlevel=Math.min(maxleft[i],maxright[i]);
            trapped=trapped+(waterlevel-arr[i]);
        }

        return trapped;




        

        //concept of finding rigth and left max without using math.max function

    //     int ml[]=new int[n];
    //     //
    //     int max=0;
    //     for (int i=0;i<n;i++)
    //     {
    //         if(arr[i]>max)
    //     {
    //         max=arr[i];
    //         }
    //         ml[i]=max;


    //      }

        
    //     int max1=0;
    
    // int mr[]=new int[n];
    
    // for(int i=n-1;i>=0;i--)
    // {
    //     if(arr[i]>max1)
    //     {
    //         max1=arr[i];
    //     }
    //     mr[i]=max1;
    // }


    

        



    }

    public static void main(String[] args)
    {
        int arr[]={4,2,0,6,3,2,5};
        int tra=trappedwater2(arr);
        System.err.println(tra);

    }
    
}
