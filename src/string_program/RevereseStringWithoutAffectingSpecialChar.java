package string_program;

public class RevereseStringWithoutAffectingSpecialChar {

    public static void main(String[] args) {
        reverseString("T@E$J#A%S");
    }

    //S@A$JE@T
    private static void reverseString(String s){
        int len = s.length();
        char[] arr = new char[len];
        for(int i=0; i<len; i++){
            char ch = s.charAt(i);
            if(Character.isAlphabetic(ch)){
                arr[len-1-i] = ch;
            }else{
                arr[i] = ch;
            }
        }

        System.out.println(new String(arr));
    }
}
