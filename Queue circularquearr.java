import java.util.*;
import java.util.Queue;
class circularquearr {

    static class queue{
        static int arr[];
        static int rear;
        static int size;
        static int front;

        queue(int n)
        {
            arr=new int[n];
            rear=-1;
            front =-1;
            size=n;
        }

        public static boolean isempty()
        {
            return rear==-1&&front==-1;
        }

        public static boolean isfull()
        {
            return (rear+1)%size==front;
        }

        public static void add(int data)
        {
            if(isfull())
            {
                System.err.println("queue is full");
                return;
            }

            if(front ==-1)
            {
                front =0;
            }
            rear= (rear+1)%size;
            arr[rear]=data;
        }

        public static int remove()
        {
            if(isempty())
            {
                return -1;
            }
            int result=arr[front];
            if(rear==front)
            {
                rear=front=-1;
            }
            else{
                front = (front+1)%size;
                return result;
            }
            return result;
        }


            public static int peek()
            {
                if(isempty()){
                    return -1;
                }

                return arr[front];

            }
        
        
    }
   
    public static void main(String[] args)
    {
        
        queue q= new queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        while(!q.isempty())
        {
            System.err.println(q.peek());
            q.remove();
        }
    }
    
}
