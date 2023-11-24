package arraylist_program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class removeDuplicates {

    public static void main(String[] args) {

        List<String> duplicatelist = new ArrayList<String>();
        duplicatelist.add("Nitin");
        duplicatelist.add("Pooja");
        duplicatelist.add("Nitin");
        duplicatelist.add("Akshay");
        duplicatelist.add("Pooja");
        duplicatelist.add("Sagar");
        duplicatelist.add("Satish");
        duplicatelist.add("Nitin");


        System.out.println("Duplicate :- "+duplicatelist);
        Set<String> set = new HashSet<String>(duplicatelist);
        List<String> originallist = new ArrayList<String>(set);
        System.out.println("After Remove Duplicate :- "+originallist);





    }
}
