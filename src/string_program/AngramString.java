package string_program;

import java.util.Arrays;

public class AngramString {

    public static void main(String[] args) {

        String str1="abcd";
        String str2="bcda";
        System.out.println("Given String " +str1+" And " + str2 + " is Angram? =" +isAngram(str1, str2));
    }

    public static boolean isAngram(String str1, String str2)
    {
        boolean value = false;
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2))
        {
            value=true;
        }
        return value;
    }
}
