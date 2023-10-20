package hasmap_program;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMapUsingForLoop {

    public static void main(String[] args) {

        HashMap<Integer, String> map=new HashMap<Integer, String>();

        map.put(1, "Delhi");
        map.put(2, "Moscow");
        map.put(3, "London");
        map.put(4, "Paris");
        map.put(5, "Kabul");

        Iterator itr= map.entrySet().iterator();

        for(Map.Entry me: map.entrySet())
        {
            System.out.println("Key = "+ me.getKey() + " Value = "+ me.getValue());
        }
    }
}
