import java.util.ArrayList;

public class leafpath {

    static class Node{
        int data;
        Node left;
        Node right;
        

        Node(int data)
        {
            this.data=data;
        }
    }

    public static Node insert(Node root,int val)
    {
        if(root==null)
        {
            root=new Node(val);
            return root;
        }

        if(root.data>val){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }

        return root;
    }

    public static void Printfun(ArrayList<Integer>path)
    {
        for(int i=0;i<path.size();i++)
        {
            System.err.print(path.get(i)+"->");
        }
        System.err.println("null");
    }

    public static void printpath(Node root,ArrayList<Integer>path)
    {
        if(root==null)
        {
            return;
        }

       
    
    path.add(root.data);
        if(root.left==null&&root.right==null)
        {
            Printfun(path);
        }

        printpath(root.left,path);
        printpath(root.right,path);
        path.remove(path.size()-1);
    } 
   

    
    public static void main(String[] args)
    {
        int values[]={8,5,3,1,4,6,10,11,14};

        ArrayList<Integer>path=new ArrayList<>();
        Node root=null;
        for(int i=0;i<values.length;i++)
        {
            root=insert(root,values[i]);

        }
        printpath(root, path);

       

        
        
    }
    
}
