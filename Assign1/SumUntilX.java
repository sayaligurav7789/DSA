package Assign1;

import java.util.Scanner;
public class SumUntilX {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;

        while(true)
        {
            System.out.println("Enter a no. :");
            String num=sc.next();

            if(num.equals("X"))
            {
                break;
            }

             int number = Integer.parseInt(num);
            sum += number;
        }
        System.out.println("Sum of all numbers: " + sum);
        sc.close();

    }

}
