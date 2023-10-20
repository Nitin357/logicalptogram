package string_program;

public class PallindromeString {

    public static void main(String[] args) {

        String name="nitiN";
        StringBuilder rev= new StringBuilder();
        rev.append(name);
        rev.reverse();
        if(name.equalsIgnoreCase(rev.toString()))
        {
            System.out.println(name + " :-String is Pallindreome");
        }
        else
        {
            System.out.println(name + " :-String is Not Pallindreome");

        }
    }
}
