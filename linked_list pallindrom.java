public class pallindrom {
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

    public Node findmiddle(Node head)
    {
        Node fast= head;
        Node slow= head;

        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast = fast.next.next;
        }

        return slow; //here slow is middle
      
    }

    public boolean ispalli()
    {
        if(head==null||head.next==null)
        {
            return true;
        }

        //to find middle

        Node midnode=findmiddle(head);

        //reverse the ll from middle

        Node curr= midnode;
        Node prev=null;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node left=head;
        Node right= prev;

        while(right!=null)
        {
            if(left.data!=right.data)
            {
                return false;
            }
            left=left.next;
            right= right.next;
        }

        return true;

    }

    public static void main(String[] args)
    {
       pallindrom ll= new pallindrom();
       ll.addfirst(2);
       ll.addfirst(2);
       ll.addfirst(11);
       ll.addlast(1);
       
       ll.print();
       System.out.println(ll.ispalli());
      
    }

    
}
