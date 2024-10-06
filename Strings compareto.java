public class compareto {

    public static void comparision(String fruit[])
    {
        String largest = fruit[0];
        for(int i=0;i<fruit.length;i++)
        {
            if(largest.compareTo(fruit[i])<0)
            {
                largest=fruit[i];
            }
        }
        System.out.println(largest);
    }
    

    public static void main(String[] args)
    {
        String fruit[] = {"appple" ,"mango" ,"banana"};

        comparision(fruit);
        
    }
}
        
