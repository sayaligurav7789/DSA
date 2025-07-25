package Assing2;

import java.util.Scanner;

public class nCrAndnPr {

    // Method to calculate factorial
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
   

    // Method to calculate nCr (Combinations)
    public static long nCr(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    // Method to calculate nPr (Permutations)
    public static long nPr(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get n and r from the user
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        System.out.print("Enter the value of r: ");
        int r = input.nextInt();

        // Calculate and print nCr and nPr
        System.out.println("nCr (Combinations) = " + nCr(n, r));
        System.out.println("nPr (Permutations) = " + nPr(n, r));

        input.close();
    }
}

