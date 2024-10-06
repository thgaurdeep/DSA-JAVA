import java.util.*;
public class weakestsoldier {
    static class Row implements Comparable<Row>
    {
        int soldier;
        int ind;

        public Row(int soldier,int ind)
        {
            this.soldier=soldier;
            this.ind=ind;
        }
        @Override
        public int compareTo(Row r2)
        {
            if(this.soldier==r2.soldier)
            {
                return this.ind-r2.ind;
            }
            else{
                return this.soldier-r2.soldier;
            }
        }
    }

    public static void main(String[] args)
    {
        int army[][]={{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int k=2;
        PriorityQueue<Row>pq=new PriorityQueue<>();
        for(int i=0;i<army.length;i++)
        {
            int count=0;
            for(int j=0;j<army[0].length;j++)
             {
                if(army[i][j]==1)
                {
                    count+=1;
                }
                else{
                    count+=0;
                }
             }
                pq.add(new Row(count,i));

            }
            
            for(int i=0;i<k;i++)
            {
                System.err.println("R"+pq.remove().ind);
            }
    
       }    
}
