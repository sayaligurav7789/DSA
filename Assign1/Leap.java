package Assign1;

import java.util.Scanner;
public class Leap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any Year:");
        int Y=input.nextInt();

        if(Y%4==0)
        {
            System.out.println(Y + " is a leap year.");
        }
        else
        {
            System.out.println(Y + " is not a leap year.");
        }

        input.close();

    }
}
