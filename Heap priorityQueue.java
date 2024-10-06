import java.util.PriorityQueue;
public class priorityQueue
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer>pq=new PriorityQueue<>();

        pq.add(3);
        pq.add(4);
        pq.add(1);

        while(!pq.isEmpty())
        {
            System.err.print(pq.peek()+" ");
            pq.remove();
        }
    }
}