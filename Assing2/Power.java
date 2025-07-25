package Assing2;

import java.util.Scanner;
public class Power {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter base :");
    double base = input.nextDouble();

    System.out.print("Enter exponent :");
    double exponent = input.nextDouble();

    System.out.print("You Entered : " + base + "^" + exponent );

    double result = (double) Math.pow(base,exponent);

    System.out.println("\nPower Anwser :" + result);

    input.close();
   } 
}
