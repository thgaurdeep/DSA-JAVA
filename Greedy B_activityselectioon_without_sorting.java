import java.util.*;
public class B_activityselectioon_without_sorting {
    public static void main(String[] args)
    {
        int start[] ={1,3,0,5,8,5};
        int end[] ={2,4,6,7,9,9};

        //sorting 

        int activity[][] =new int[start.length][3];
        for (int i=0;i<start.length;i++)
        {
            activity[i][0]=i;
            activity[i][1]=start[i];
            activity[i][2]=end[i];
        }
        
        Arrays.sort(activity,Comparator.comparingDouble(o->o[2]));
        int maxact=0;
        ArrayList<Integer>ans=new ArrayList<>();
        maxact=1;
        ans.add(activity[0][0]);
        int lastend=activity[0][1];
        for(int i=1;i<end.length;i++)
        {
            if(activity[i][1]>=lastend)
            {
                maxact++;
                ans.add(activity[i][0]);
                lastend=activity[i][1];

            }
        }
        System.err.println("maxactivity ="+maxact);
        for(int i=0;i<ans.size();i++)
        {
            System.err.print("A"+ans.get(i)+" ");
        }

        
    }
    
}
