import java.util.*;
public class llinkedHashmap {

    public static void main(String[] args)
    {
        LinkedHashMap<String,Integer>lhm=new LinkedHashMap<>();
        lhm.put("india",100);
        lhm.put("china", 150);
        lhm.put("us",50);
        // insert in a ordered mannor.
        lhm.remove("india");
        System.err.println(lhm.containsKey("india"));
        System.err.println(lhm.isEmpty());
        System.out.println(lhm.get("china"));
        System.err.println(lhm.size());
        Set<String>keys=lhm.keySet();
        System.err.println(keys);
        System.err.println(lhm);
    }
    
}
