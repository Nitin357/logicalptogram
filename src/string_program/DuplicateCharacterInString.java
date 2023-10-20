package string_program;

public class DuplicateCharacterInString {

    public static void main(String[] args) {

        String name = "Sakeett";
        int count=0;

        char[] chr= name.toCharArray();

        for(int i=0; i<=name.length()-1; i++)
        {
            for (int j=i+1; j<=name.length()-1; j++ )
            {
                if(chr[i]==chr[j])
                {
                    System.out.println(chr[j]);
                    count++;
                    break;
                }

            }
        }

    }
}
