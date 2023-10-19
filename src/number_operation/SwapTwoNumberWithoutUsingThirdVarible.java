package number_operation;

public class SwapTwoNumberWithoutUsingThirdVarible {

    public static void main(String[] args) {

        int x=3;
        int y=4;
        System.out.println("before swapping:- "+x+ " "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("after swapping:- "+x+ " "+y);


    }
}
