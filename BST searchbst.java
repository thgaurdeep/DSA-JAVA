public class searchbst {
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

    public static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }

        inorder(root.left);
        System.err.print(root.data+" ");
        inorder(root.right);

    }
    public static boolean search(Node root,int key)
    {
        if(root==null)
        {
            return false;
        }

        if(key==root.data)
        {
            return true;
        }

        if(key>root.data)
        {
            return search(root.right,key);
        }
        else{
            return search(root.left,key);
        }
    }

    public static void main(String[] args)
    {
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++)
        {
            root=insert(root,values[i]);

        }

        if(search(root, 6))  
        {
            System.err.println("key is found");
        }
        else{
            System.err.println("key is not found");
        }
    }
    
}
