public class arrayrec {



public static boolean issorted(int arr[] ,int i)
    {
        if(i==arr.length-1)
        {
            return true;
        
    }
    if(arr[i]>arr[i+1])
    {
        return false;
    }

    return issorted(arr, i+1);
    
}

public static int firstacc(int arr[],int i,int key)
{
    if(i==arr.length)
    {
        return -1;
    }

    if(arr[i]==key)
    {
        return i;
    }
    return firstacc(arr,i+1,key);

}

public static int lastacc(int arr[],int i,int key)
{
    if(i==arr.length)
    {
        return -1;
    }
    int isfound=lastacc(arr,i+1,key);

    if(isfound !=-1)
    {
        return isfound;
    }
    if(arr[i]==key)
    {
        return i;
    }
    return isfound;
}


public static void main(String[] args)
{
    //int arr[]={1,2,3,4,5,3,2,5};
    // System.out.println( issorted(arr,0));

    // System.out.println(firstacc(arr, 0, 6));
    // System.out.println(lastacc(arr, 0, 5));

    System.out.println("x to the power n is "+xpow(2,4));
}

}
