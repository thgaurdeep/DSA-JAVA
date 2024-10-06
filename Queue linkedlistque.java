import java.util.*;
import java.util.Queue;
public class linkedlistque{

    static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    static class Queue{
        static Node head=null;
        static Node tail=null;
        
        public static boolean isempty()
        {
            return head==null&&tail==null;
        }

        public static void add(int data)
        {
            Node newnode=new Node(data);
            if(head ==null)
            {
                head=tail=newnode;
            }
            tail.next=newnode;
            tail=newnode;
        }

        public static int remove()
        {
            if(isempty())
            {
                return -1;
            }

            int front=head.data;
            if(head ==tail)
            {
                head =tail=null;
            }
            else{
                head=head.next;
            }
            return front;

        }

        public static int peek()
        {
            if(isempty())
            {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String args[])
    {
        Queue q= new Queue(); 
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        q.add(4);
        q.add(5);
        q.remove();

        while(!q.isempty())
        {
            System.err.println(q.peek());
            q.remove();
        }
            
       
    }


    
}
