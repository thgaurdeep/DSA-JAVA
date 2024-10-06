public class create{
    public static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;

        }
    }

    public static Node head;
    public static Node tail;



    public void addfirst(int data)
    {
        Node newnode= new Node(data);
        if(head==null)
        {
            head=tail=newnode;
            return;
        }

        newnode.next=head;
        head=newnode;
    }

    public void addlast(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=tail=newnode;
            return;
        }

        tail.next=newnode;
        tail = newnode;
    }
    
    public void addmiddle(int ind,int data)
    {
        Node newnode= new Node(data);
        if(ind==0)
        {
            addfirst(data);
            return;
        }
        
        Node prev=head;
        int i=0;
        while(i<ind-1)
        {
            prev=prev.next;
            i++;
        }
        newnode.next=prev.next;
        prev.next=newnode;
    }

    public void print()
    {
        if(head==null)
        {
            System.err.println("linked list id empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.err.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.err.println("null");
    }

    public static void main(String[] args)
    {
       create ll= new create();
       ll.addfirst(3);
       ll.addfirst(2);
       ll.addfirst(1);
       ll.addlast(4);
       ll.addlast(6);
       ll.addmiddle(4,5);
       ll.print();
      
    }

    
}