import java.util.ArrayList;




public class arraystack{

   static class Stack{

        static ArrayList<Integer>list=new ArrayList<>();

        public static boolean isempty()
        {
            return list.size()==0;
        }

       public static void push(int  data)
        {
            list.add(data);
          
        }

        public static int pop()
        {
            if(isempty())
            {
                return -1;
            }

            int top= list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public static int peek()
        {
            if(isempty())
            {
                return-1;
            }
            return list.get(list.size()-1);       
        }



    }
   // @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while(!s.isempty()){
            System.err.println(s.peek()+" ");
             s.pop();
        }
       //System.err.println(s.pop());
       System.err.println(s.peek());
       s.push(6);
       System.err.println(s.peek());



    }
}