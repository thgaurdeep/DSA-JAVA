import java.util.*;

public class C_fractionalKnapsack {
    public static void main(String[] args)
    {
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int w=50;
        double ratio[][] =new double[val.length][2];
        {
            for(int i=0;i<val.length;i++)
            {
                ratio[i][0]=i;
                ratio[i][1]=val[i]/(double)weight[i];
            }
            Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));

            //accending order sorting

            int capacity=w;
            int finalval=0;
            for(int i=ratio.length-1;i>=0;i--)
            {
                int ind=(int)ratio[i][0];
                if(capacity>=weight[ind])
                {
                    finalval=finalval+val[ind];
                    capacity=capacity-weight[ind];

                }
                else{
                    finalval=(int) (finalval+(ratio[i][1]*capacity));
                    capacity=0;
                    break;
                }
            }
            System.err.println("final value ="+finalval);

        }
    }
    
}
