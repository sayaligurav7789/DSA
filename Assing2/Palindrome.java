package Assing2;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a No. :");
        int num=input.nextInt();
       
        int rem, sum=0;
        int temp=num;

        while(num>0)
        {
            rem=num%10;
            sum= (sum*10)+rem;
            num=num/10;
        }
        
        if (temp==sum)
        {
            System.out.println("It is a Palindrome No.");
        }
        else
        {
            System.out.println("It is not a Palindrome No.");
        }

        input.close();
    }

}
