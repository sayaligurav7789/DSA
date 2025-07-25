package Assing2;

import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter original Price :");
        double Oprice =  input.nextDouble();

        System.out.println("Enter Discount in persentage :");
        double Dprice =  input.nextDouble();

        double DiscountAmount = Oprice * Dprice / 100;

        double ResultAmount = Oprice - DiscountAmount;
        System.out.println("Total amount after discount :" + ResultAmount);


        input.close();
    }
}
