package string_program;

public class RemoveAllWhiteSpacesString {

    public static void main(String[] args) {

        String str="Sachin  Playing   Cricket at pune in form ";

        String str2=str.replaceAll("\\s", "");
        System.out.println(str);
        System.out.println(str2);
    }
}
