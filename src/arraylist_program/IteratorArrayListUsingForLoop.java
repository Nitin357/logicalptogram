package arraylist_program;

import java.util.ArrayList;

public class IteratorArrayListUsingForLoop {

    public static void main(String[] args) {

        ArrayList list= new ArrayList();

        list.add("Chai");
        list.add("Cofee");
        list.add("Cold Cofee");
        list.add("Black Tee");
        list.add("Lemon Tee");
        list.add("Mango Juice");
        list.add("Pineapple Juice");

        for(int i = 0 ; i<=list.size()-1 ; i++)
        {
            System.out.println(list.get(i));
        }

    }
}
