package string_program;

public class ReverseStringUsingCharAt {
    public static void main(String[] args) {


        String str = "Automation";
        StringBuilder rev = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        System.out.println(rev);
    }
}
