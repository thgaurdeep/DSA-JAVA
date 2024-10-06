public class diameter {

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



    
    public static int hight(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh=hight(root.left);
        int rh=hight(root.right);

        return Math.max(lh,rh)+1;
    }

    public static int diam(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int ld=diam(root.left);
        int lh=hight(root.left);
        int rd=diam(root.right);
        int rh=hight(root.right);
        int selfdia=lh+rh+1;
        return Math.max(selfdia,Math.max(ld,rd));
    }

    static class Info{
        int dia;
        int ht;

        public Info(int dia,int ht)
        {
            this.dia=dia;
            this.ht=ht;
        }
    }

    public static Info diameter(Node root)
    {
        if(root==null)
        {
            return new Info(0,0);
        }
        Info leftinfo=diameter(root.left);
        Info rightinfo=diameter(root.right);
        int fd=Math.max(Math.max(leftinfo.dia,rightinfo.dia),leftinfo.ht+rightinfo.ht+1);
        int ht=Math.max(leftinfo.ht,rightinfo.ht)+1;

       
        return new Info(fd,ht);


    }


    public static void main(String[] args)
    {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
         root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.err.println(diameter(root).dia);
     


    }

    
}
