package arraylist_program;

import java.util.ArrayList;
import java.util.Iterator;

public class IteraterArrayListUsingWhileLoop {

    public static void main(String[] args) {

        ArrayList list=new ArrayList();

        list.add("Delhi");
        list.add("Mumbai");
        list.add("Pune");
        list.add("Delhi");
        list.add("Indore");
        list.add("Pune");

        Iterator itr = list.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
