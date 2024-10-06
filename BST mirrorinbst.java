public class mirrorinbst {
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

    public static void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.err.print(root.data+" ");
        preorder(root.left);
       
        preorder(root.right);

    }

    public static Node mirror(Node root)
    {
        if(root==null)
        {
            return null;
        }

        Node left=mirror(root.left);
        Node right=mirror(root.right);

        root.left=right;
        root.right=left;
        return root;
    }

    public static void main(String[] args)
    {
        int values[]={5,1,3,4,2,7,6};
        Node root=null;
        for(int i=0;i<values.length;i++)
        {
            root=insert(root,values[i]);

        }

        preorder(root);
        System.err.println(root.data);

        mirror(root);
        preorder(root);
        
    }
    
}
