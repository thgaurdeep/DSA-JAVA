public class sorted_array_to_balnced_bst {

    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static Node createbst(int arr[],int st,int end)
    {
        if(st>end)
        {
            return null;
        }
        int mid=(st+end)/2;

        Node root=new Node(arr[mid]);
        root.left=createbst(arr, st, mid-1);
        root.right=createbst(arr, mid+1, end);
        return root;

    }

    public static void preorder(Node root)
    {
        if(root==null)
        {
            return ;
        }
        System.err.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args)
    {
        int arr[]={3,5,6,8,10,11,12};
         Node root=createbst(arr, 0, arr.length-1);
        preorder(root);

 ;   }

    
}
