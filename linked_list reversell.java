public class reversell {
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
        public static int size;



        public void addfirst(int data)
        {
            Node newnode=new Node(data);
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
                head=tail=newnode;
                return;
            }
            tail.next=newnode;
            tail=newnode;
        }

        public void addmiddle(int ind,int data){
        Node newnode=new Node(data);
        if(ind==0)
        {
            addfirst(data);
            return;
        }
        size++;
           Node temp=head;
           int i=0;
           while(i<ind-1)
           {
            temp=temp.next;
            i++;
           }
           newnode.next=temp.next;
           temp.next=newnode;
        }

        public void print()
        {
            if(head==null)
            {
                System.err.println("linked lis is empty");
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

        //function for reverse the linked list

        public void reverse()
        {
            Node prev=null;
            Node curr=tail=head;
            Node next;

            while(curr!=null)
            {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;

            }
            head=prev;
        }
    

    public static void main(String[] args)
    {
        reversell ll=new reversell();
        ll.addfirst(4);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(5);
        ll.addmiddle(2,3);
        ll.print();
        ll.reverse();
        ll.print();
    }

    
    
}
