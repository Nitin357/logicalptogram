package hasmap_program;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMapUsingWhileLoop {

    public static void main(String[] args) {

        HashMap<Integer, String> map=new HashMap<Integer, String>();
        map.put(1, "Nitin");
        map.put(2, "Pooja");
        map.put(3, "Sagar");
        map.put(4, "Akshay");
        map.put(5, "Satish");

        System.out.println(map.size());
        System.out.println("While Loop:-");

        Iterator itr=map.entrySet().iterator();

        while (itr.hasNext())
        {
            Map.Entry me = (Map.Entry) itr.next();
            System.out.println("key = "+me.getKey()+" Value = "+me.getValue());
        }
    }
}
