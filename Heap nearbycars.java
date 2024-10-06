import java.util.PriorityQueue;

public class nearbycars {

    public class point implements Comparable<point>{
        int x;
        int y;
        int ind;
        int distsq;
        public point(int x,int y,int ind,int distsq)
        {
            this.x=x;
            this.y=y;
            this.ind=ind;
            this.distsq=distsq;
        }

        @Override

        public int compareTo(point p2)
        {
            return this.distsq - p2.distsq;
        }
        

    }

    public static void main (String[] args)
    {
        int pts[][]={{3,3},{5,-1},{-2,4}};
        int k=2;
        PriorityQueue<point>pq=new PriorityQueue<>();
        for(int i=0;i<pts.length;i++)
        {
            int distsq=pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];
            pq.add(new point(pts[i][0],pts[i][1],i,distsq));

            for(int  j=0;j<k;j++)
            {
                System.err.println("C"+pq.remove().ind);
            }
        }
    }
    
}
