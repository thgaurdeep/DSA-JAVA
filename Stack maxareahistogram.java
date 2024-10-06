import java.util.Stack;

public class maxareahistogram {
    
    public static void maxArea(int arr[])
    {
        int maxarea=0;
        Stack<Integer> s=new Stack<>();
        int nsr[]=new int[arr.length];
        int nsl[] =new int[arr.length];
      
         
        // for next smaller rigth

        for(int i=arr.length-1 ;i>=0;i--)
        {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nsr[i]=arr.length;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        s=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i])
            {
                s.pop();

            }
            if(s.isEmpty())
            {
                nsl[i]=-1;
            }
            else{
                nsl[i]=s.peek();
            }

            s.push(i);
        }

        //area

        for(int i=0;i<arr.length;i++)
        {
            int hight=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currarea=hight*width;
             maxarea=Math.max(currarea,maxarea);
           
        }
        System.err.println("max area of histogram is ="+maxarea);
    }

      
    public static void main(String[] args)
    {
        int hight[] ={2,1,5,6,2,3};
        maxArea(hight);
    
    }
    
}
