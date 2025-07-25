package Assing2;

import java.util.Scanner;
public class Commission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the sale price :");
        double sale = input.nextDouble();

        System.out.println("Enter the commission price :");
        double commission = input.nextDouble();

        double commissionPer;
        commissionPer = commission / sale *100;

        System.out.println("commission in Persantage :" + commissionPer + " %");

        input.close();
    }
}
