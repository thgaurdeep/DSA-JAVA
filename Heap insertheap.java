import java.util.*;
public class insertheap {
    public class Heap{
        ArrayList<Integer>arr=new ArrayList<>();
        public void add(int data)
        {
            arr.add(data);
            int x=arr.size()-1;
            int par=(x-1)/2;
            while(arr.get(x)<arr.get(par))
            {
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);

                x=par;
                par=(x-1)/2; 
            }
        }

        public int peek()
        {
             return arr.get(arr.size()-1);
        }

        public boolean isEmpty()
        {
            return arr.size()==0;
        }


        public void heapify(int i)
        {
            int left=2*i+1;
            int right=2*i+2;
            int min=i;
            if(left<arr.size()&&arr.get(min)>arr.get(left))
            {
                min=left;
            }

            if(right<arr.size()&& arr.get(min)>arr.get(right))
            {
                min=right;
            }

            if(min!=i)
            {
                int temp=arr.get(i);
                arr.set(i,arr.get(min));
                arr.set(min,temp);

                heapify(min);
            }
        }

        public int remove()
        {
            int data =arr.get(0);
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);
            
            //heapify
            heapify(0);
            return data;

        }
        
        

    }


    public static void main(String[] args)
    {
        Heap h= new Heap();
        h.add(3);
        h.add(2);
        h.add(9);
        h.add(1);

        while(!h.isEmpty())
        {
            System.err.println(h.peek());

            h.remove();
        }

    }
    
}
