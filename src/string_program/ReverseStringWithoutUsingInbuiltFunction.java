package string_program;

public class ReverseStringWithoutUsingInbuiltFunction {

    public static void main(String[] args) {

        String str = "Automation";
        char[] chr = str.toCharArray();

        for(int i=chr.length-1; i>=0; i--)
        {
            System.out.print(chr[i]);
        }
    }
}
