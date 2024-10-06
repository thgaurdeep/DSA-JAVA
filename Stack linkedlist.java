import java.util.*;
public class linkedlist {
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data =data;
            this.next=null;

        }
    }

    static class Stack
    {

        static Node head = null;

        public static boolean isempty()
        {
            return head == null;
        }

        public static void push(int data)
        {

            Node newnode= new Node(data);
            if(isempty())
            {
                head =newnode;
                return;
            }

            newnode.next=head;
            head=newnode;
        }

        public static int pop()
        {
            if(isempty())
            {
                return -1;

            }

            int top=head.data;
            head = head.next;
            return top;

        }

        public static int peek()
        {
            if (isempty())
            {
                return -1;
            }

            return head.data;
        }



    }

    public static void main(String[] args)
    {
        Stack s=new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isempty())
        {
            System.err.println(s.peek());

            s.pop();
        }

    }
   
    
}

