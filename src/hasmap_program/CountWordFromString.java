package hasmap_program;

import java.util.HashMap;

public class CountWordFromString {
    public static void main(String[] args) {

        //declare String
        String stat="This is my people and this people I love and I love India";
        //split sting at space create array
        String [] split=stat.split(" ");
        //declare map pair of string and integer
        HashMap<String, Integer> map=new HashMap<String, Integer>();

        //declare for loop

        for(int i=0; i<split.length; i++)
        {
            if(map.containsKey(split[i]))
            {
                int count= map.get(split[i]);
                map.put(split[i], count+1);

            }
            else
            {
                map.put(split[i], 1);

            }
        }
        System.out.println(map);

    }
}
