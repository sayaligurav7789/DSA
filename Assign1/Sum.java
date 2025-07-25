package Assign1;

import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Taking number input
        System.out.print("Enter two numbers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int sum=number1+number2;
        System.out.println("Sum:"+sum);
        sc.close();
    }
}

