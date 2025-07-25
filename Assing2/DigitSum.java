package Assing2;

import java.util.Scanner;
public class DigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = input.nextInt();

        int sum = 0;
        int rem;
        while(num!=0)
        {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("Sum of digit :" + sum);
        input.close();
    }
}
