package Assing2;

import java.util.Scanner;
public class DistBetTwoP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter x1 :");
        float x1 =  input.nextFloat();

        System.out.println("Enter y1 :");
        float y1 =  input.nextFloat();

        System.out.println("Enter x2 :");
        float x2 =  input.nextFloat();

        System.out.println("Enter y2 :");
        float y2 =  input.nextFloat();

        double Distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println(Distance);

        input.close();
    }
}
