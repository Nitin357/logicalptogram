package string_program;

public class DuplicateWordInString {

    public static void main(String[] args) {

        String stat="I Love India I Love Myself";

        String[] words= stat.split(" ");
        int count=0;

        int loopEnd=words.length-1;

        for(int i=0; i<=loopEnd; i++)
        {
            for(int j=i+1; j<=loopEnd; j++)
            {
                if(words[i].equalsIgnoreCase(words[j]))
                {
                    System.out.println(words[j]);
                    count++;
                    break;
                }
            }
        }
    }
}
