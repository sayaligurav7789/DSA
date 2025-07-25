package Assing2;
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input values for principal, rate of interest, time, and number of compounds per year
        System.out.print("Enter the principal amount (P): ");
        double principal = input.nextDouble();

        System.out.print("Enter the annual interest rate (r in %): ");
        double annualRate = input.nextDouble();

        System.out.print("Enter the time (t in years): ");
        int time = input.nextInt();

        System.out.print("Enter the number of times interest is compounded per year (n): ");
        int compoundsPerYear = input.nextInt();

        // Convert annual rate from percentage to decimal
        double rate = annualRate / 100;

        // Calculate the final amount after interest
        double amount = principal * Math.pow(1 + (rate / compoundsPerYear), compoundsPerYear * time);

        // Calculate the compound interest
        double compoundInterest = amount - principal;

        // Display the results
        System.out.printf("The compound interest is: %.2f\n", compoundInterest);
        System.out.printf("The final amount after interest is: %.2f\n", amount);

        input.close();
    }
}


