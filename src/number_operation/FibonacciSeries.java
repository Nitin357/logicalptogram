package number_operation;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        int a=0, b=0, c=1;

        Scanner in=new Scanner(System.in);
        int end=in.nextInt();

        System.out.println(" Fibonacci series is :- ");
        for(int i=0; i<=end; i++)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.print(a + " ");
        }
    }
}
