import java.util.*;
public class HashMapcode {
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;

            public Node(K key,V value )
            {
                this.key=key;
                this.value=value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node>bucket[];

        @SuppressWarnings("Unchecked")
        public HashMap()
        {
            this.N =4;
            this.bucket=new LinkedList[4];
            for(int i=0;i<4;i++)
            {
                this.bucket[i]=new LinkedList<>();

            }
        }

        //hash function
        private int hashfun(K key)
        {
            int hc=key.hashCode();
            return Math.abs(hc)%N;
        }


        //search function for put fun
        private int search(K key ,int bi)
        {
            LinkedList<Node>ll=bucket[bi];
            int di=0;
            for(int i=0;i<ll.size();i++)
            {
                Node node=ll.get(i);
                if(node.key==key)
                {
                    return di;
                }
                di++;
            }

            return -1;
        }


        // rehash function for put fun
        @SuppressWarnings("Unchecked")
        private void rehash()
        {
            LinkedList<Node>oldbuck[]=bucket;
            bucket=new LinkedList[N*2];
            N=2*N;
            for(int i=0;i<bucket.length;i++)
            {
                LinkedList<Node>ll=oldbuck[i];
                for(int j=0;j<ll.size();j++)
                {
                    Node node=ll.remove();
                    put(node.key,node.value);
                }
            }
        }

        

        public void put(K key,V value)
        {
            int bi=hashfun(key);
            int di=search(key, bi);
            if(di!=-1)
            {
                Node node = bucket[bi].get(di);
                node.value=value;

            }
            else{
                bucket[bi].add(new Node(key,value));
                n++;
            }

            double lambda=(double)n/N;
            if(lambda>2)
            {
                rehash();
            }
        }



        public boolean containsKey(K key)
        {
            int bi=hashfun(key);
            int di=search(key, bi);
            if(di!=-1)
            {
                return true;

            }
            else{
                return false;
            }

        }



        public V get(K key)
        {
            int bi = hashfun(key);
            int di=search(key, bi);

            if(di!=-1)
            {
                Node node=bucket[bi].get(di);
                return node.value;
            }
            else {
                return null;
            }
        }


        public V remove(K key)
        {
            int bi = hashfun(key);
            int di = search(key, bi);
            if(di!=-1)
            {
                Node node = bucket[bi].remove(di);
                n--;
                return node.value;
            }
            return null;
        }
        
        
        public ArrayList<K>keySet()
        {
            ArrayList<K>keys=new ArrayList<>();

            for (int i=0;i<bucket.length;i++)
            {
                LinkedList<Node>ll=bucket[i];
                for (Node node : ll) {
                    keys.add(node.key);
                    
                }
            }
            return keys;


        }

        public boolean isEmpty()
        {
            return n==0;
        }
    }

    public static void main(String[] args)
    {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("india", 100);
        hm.put("china",150);
        hm.put("us",50);
        hm.put("nepal",5);

        System.err.println(hm.get("india"));
    }
    
}
