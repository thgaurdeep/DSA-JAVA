import java.util.*;

public class ropesconnection {

    public static void main(String[] args)
    {
        int ropes[]={4,3,2,6};
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<ropes.length;i++)
        {
            pq.add(ropes[i]);
        }

        int cost=0;
        while(pq.size()>1)
        {
            int min1=pq.remove();
            int min2=pq.remove();
            cost+=min1+min2;
            pq.add(min1+min2);
        }

        System.err.println("the minimum cost of rope is = "+ cost);
    }
    
}
