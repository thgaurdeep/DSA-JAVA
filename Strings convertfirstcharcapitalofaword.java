public class convertfirstcharcapitalofaword {


    public static String toUpperCase(String str)
    {       //to make string mutable
        StringBuilder sb = new StringBuilder();
        //to convert starting letter of string into a capital letter.
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==' '&&i<str.length()-1)
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

                //to convert the first char of a word into capital letter


            }
            else{
                sb.append(str.charAt(i)); //to convert into a string
            }
        }
        return sb.toString();
    }


    public static void main(String[] args)
    {
        String str = "hi i am deepak gaur";

        System.out.println(toUpperCase(str));

    }
    
}
