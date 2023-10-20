package array_program;

public class SecondHighestNumberInArray {

    public static void main(String[] args) {

        int[] number={1,2,3,4,5,6,12,78,67};

        int loopEnd = number.length-1;
        int first=0;
        int second=0;

        for(int i=0; i<=loopEnd; i++)
        {
            if(number[i]>first)
            {
                second = first;
                first=number[i];
            }
            else if(number[i]>second)
            {
                second= number[i];
            }

        }
        System.out.println("largestNumber:-"+first);
        System.out.println("SecondHingest:-"+second);


    }
}
