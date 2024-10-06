import java.util.*;
public class A_activityselection {


    public static void main(String[] args)
    {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        int maxact=0;
        ArrayList<Integer>ans=new ArrayList<>();
        maxact=1;
        ans.add(0);
        int lastend=end[0];
        for (int i=0;i<end.length;i++)
        {
            if(start[i]>=lastend)
            {
                maxact++;
                ans.add(i);
                lastend=end[i];


            }
        }
        System.err.println("maxactivies ="+maxact);
        for(int i=0;i<ans.size();i++)
        {
            System.err.print("A"+ans.get(i)+" ");
        }

    }
    
}
