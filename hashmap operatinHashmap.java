import java.util.HashMap;
public class operatinHashmap{

    public static void main(String[] args)
    {
        HashMap<String,Integer>hm=new HashMap<>();


        //For insert the element in hashmap
        hm.put("india",100);
        hm.put("china",150);
        hm.put("us",50);
        hm.put("dubai",30);
       
        // to print the hashmap

        System.err.println(hm);

        //get (key)

         //int val=hm.get("india");
         System.err.println(hm.get("jjoi"));

         // containsKey(key)  true / false
         System.err.println(hm.containsKey("china"));

         // remove(key)  return the value and remove the element

         System.err.println(hm.remove("us"));
         System.err.println(hm);

         hm.clear();
         System.err.println(hm);

    }
}