import java.util.*;

public class hashmapIteration {
    public static void main(String[] args)
    {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("india",100);
        hm.put("china",150);
        hm.put("us",50);
        hm.put("russia",80);

        System.err.println(hm);

        Set<String>keys=hm.keySet();
        for (String k : keys) {
            System.err.println("key = "+k+" , valus = "+hm.get(k));
        }
    }
    
}
