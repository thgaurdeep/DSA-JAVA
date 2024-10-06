public class Linkedlistadd {

    public static class Node{

        int data;
        Node next;

        public Node(int data)
        {
            this.data= data;
            this.next= null;

        }
    }
    public static Node head;
    public static Node tail;
    public static int size;



    // add at the first of the linkedlist
    
    public void addfirst(int data)
    {
        Node newnode= new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newnode;
            return;
        }

        newnode.next=head;
        head=newnode;
    }

    //add at the last of the linkedlist

    public void addlast(int data)
    {
        Node newnode= new Node(data);
        size++;
        if(head==null)
        {
            tail=head=newnode;
            return;
        }

        tail.next=newnode;
        tail=newnode;
    }

    // add element at middle

    public void addmiddle(int ind, int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            addfirst(data);
            return;
        }
        size++;
        Node temp= head;
        int i=0;
        while(i<ind-1)
        {
            temp=temp.next;
            i++;

        }
        newnode.next=temp.next;
        temp.next=newnode;
    }

    // Remove element from first

    public int removefirst()
    {
        if(size==0)
        {
            System.err.println("linked list is empty");
            return -1;
        }

        else if(size==1)
        {
            int value= head.data;
            head=tail=null;
            size=0;
            return value;
        }

        int value=head.data;
        head= head.next;
        size--;
        return value;
    }
    public int removelast()
    {
        if(size==0)
        {
            System.err.println("linked list is empty");
            return -1;
        }
        else if(size==1)
        {
            int val= head.data;
            head=tail=null;
            size=0;
            return val;

        }

        Node prev = head;
        for(int i=0;i<size-2;i++)
        {
            prev=prev.next;
        }
        int val= prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }


    // to print the linked list
    public void printlist()
    {
        if(head==null)
        {
            System.err.println("linked list is empty");
            return;
        }
        Node temp=head; 

        while(temp!=null)
        {
            System.err.print( temp.data +" -> ");
            temp=temp.next;
        }
        System.err.println("null");
    }

    
    public static void main(String[] args)
    {
        Linkedlistadd ll=new Linkedlistadd();
        ll.printlist();
       // ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.printlist();

        // ll.addlast(4);
        // ll.addlast(5);
        ll.addlast(6);

    ll.addmiddle(2,4);
    ll.addmiddle(3,5);
        ll.printlist();

        ll.removefirst();
        ll.printlist();
        // ll.removelast();
        // ll.removelast();
        // ll.removelast();
        ll.removelast();
        ll.printlist();

        System.err.println("size of linked list is -: "+ll.size);
 
    }

    
}
