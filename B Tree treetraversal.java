import java.util.LinkedList;
import java.util.Queue;

public class treetraversal {
   static class Node{
        int data;
        Node left;
        Node right;
   

        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int ind=-1;
        public static Node buildtree(int nodes[])
        {
            ind++;
            if(nodes[ind]==-1)
            {
                return null;
            }
            Node newnode=new Node(nodes[ind]);
            newnode.left=buildtree(nodes);
            newnode.right=buildtree(nodes);
            return newnode;
        }

    public static void preorder(Node root)
    {
        if (root==null)
        {
            return ;

        }
        System.err.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
       
    }

    public static void inorder(Node root)
    {
        if(root==null)
        {
            return ;
        }
        inorder(root.left);
        System.err.print(root.data+" ");
        inorder(root.right);
        
    }

    public static void postorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.err.print(root.data+" ");
       
    }
    public static void levelorder(Node root)
    {
        if(root==null)
        {
            return;
        }

        Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node currnode=q.remove();
            if(currnode==null)
            {
                System.err.println();
                if(q.isEmpty())
                {
                    break;

                }else{
                    q.add(null);
                }
            }
            else{
               System.err.print(currnode.data+" ");
               if(currnode.left!=null)
               {
                q.add(currnode.left);
               }
               if(currnode.right!=null)
               {
                q.add(currnode.right);
               }


            }
        }


    }
   
}

    public static void main(String[] args)
    {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildtree(nodes);
        tree.preorder(root);
        System.err.println();
        tree.inorder(root);
        System.err.println();
        tree.postorder(root);
        System.err.println();
        tree.levelorder(root);
        System.err.println(root.data);

        

    }


    
}
