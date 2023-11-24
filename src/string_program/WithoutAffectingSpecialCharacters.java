package string_program;

public class WithoutAffectingSpecialCharacters {

    public static void main(String[] args) {

        reverseString("S@A$JE@T");

    }
    public static void reverseString(String str)
    {
        int loopEnd = str.length();
        char[] arr=new char[loopEnd];
        for(int i=0; i<loopEnd; i++)
        {
            char c = str.charAt(i);
            if(Character.isAlphabetic(c))
            {
                arr[loopEnd-1-i] = c;
            }
            else
            {
                arr[i] = c;
            }
        }
        System.out.println(new String(arr));

    }
}
