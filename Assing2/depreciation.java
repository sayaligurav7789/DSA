package Assing2;

import java.util.Scanner;
public class depreciation{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the original value, salvage value, and useful life of the asset
        System.out.print("Enter the cost of the asset: ");
        double cost = input.nextDouble();

        System.out.print("Enter the salvage value: ");
        double salvageValue = input.nextDouble();

        System.out.print("Enter the useful life of the asset (in years): ");
        int usefulLife = input.nextInt();

        // Calculate depreciation using the Straight-Line Method
        double depreciation = (cost - salvageValue) / usefulLife;

        System.out.println("The annual depreciation using Straight-Line Method is: " + depreciation);

        input.close();
    }
}

