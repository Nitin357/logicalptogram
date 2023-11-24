package string_program;

public class a2b3a1 {

    public static void main(String[] args) {


        String str="aabbba";

        int count=1;

        for(int i=0; i<str.length(); i= i+count)
        {
            count=1;
            for(int j= i+1; j<str.length(); j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    count=count+1;
                }
                else
                {
                    break;
                }
            }
            System.out.print(str.charAt(i)+""+count);

        }
    }
}
