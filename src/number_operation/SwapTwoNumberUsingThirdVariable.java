package number_operation;

public class SwapTwoNumberUsingThirdVariable {
    public static void main(String[] args) {

        int x=3;
        int y=4;

        System.out.println("before swapping:-" + x + " "+ y);
        int z=x;
         x=y;
         y=z;
        System.out.println("After swapping:-" + x + " "+ y);


    }
}
