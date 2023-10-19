public class RevereseSequenceOfWordOfSting {

    public static void main(String[] args) {

        String stat= "I Love Bharat";

        String str[]=stat.split(" ");

        for(int i=str.length-1; i>=0; i--)
        {
            System.out.print(str[i]+ " ");
        }

    }
}
