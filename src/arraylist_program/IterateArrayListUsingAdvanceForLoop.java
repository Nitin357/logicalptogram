package arraylist_program;

import java.util.ArrayList;

public class IterateArrayListUsingAdvanceForLoop {

    public static void main(String[] args) {


        ArrayList list = new ArrayList();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        for (Object obj: list)
        {
            System.out.println(obj);
        }

    }
}
