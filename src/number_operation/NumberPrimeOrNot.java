package number_operation;

import java.util.Scanner;

public class NumberPrimeOrNot {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        boolean isPrime=true;

        int num= in.nextInt();

        for(int i=2; i<num/2; i++)
        {
            int temp=num%i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }

        }
        if(isPrime)
        {
            System.out.println(num+" :-number is Prime");
        }
        else
        {
            System.out.println(num+" :-number is Not Prime");
        }

    }





}
