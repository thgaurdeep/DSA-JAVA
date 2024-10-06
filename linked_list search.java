public class search {

    public static class Node{
        int data;
        Node next;

        public Node( int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

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

    public void addlast(int data)
    {
       
        Node newnode=new Node(data);
        size++;
        if(head==null)
        {
            head= tail=newnode;
            return;
        }

        tail.next=newnode;
        tail=newnode;
    }

    public void print()
    {
        if(head==null)
        {
            System.err.println("linked list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.err.print(temp.data+"->");
            temp=temp.next;
        }
        System.err.println("null");

    }
    public int  iteratesearch(int target)
    {
       
        Node temp=head;
        int i=0;
      while(temp!=null)
        {
            if(temp.data==target)
            {
               
               return i;
            }
            
            temp=temp.next;
            i++;

        }
        return -1;
    }
    public int helper(Node head,int key)
    {
        if(head==null)
        {
            return -1;
        }
        if(head.data==key)
        {
            return 0;
        }
        int ind=helper(head.next,key);
        if(ind==-1)
        {
            return -1;
        }
        return ind+1;
    }
    public int recsearch(int key)
    {
        return helper(head,key);
    }

    public static void main(String[] args)
    {
        search ss=new search();

        ss.addfirst(2);
        ss.addfirst(1);
        ss.addlast(3);
        ss.addlast(4);
        ss.addlast(5);
        ss.print();
        System.err.println(ss.size);
        System.err.println(ss.iteratesearch(5));
        System.err.println(ss.iteratesearch(10));
        System.err.println(ss.recsearch(4));
    

    }
    
}
