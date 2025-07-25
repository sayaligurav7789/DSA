package Assing2;

import java.util.Scanner;
public class SI {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Principal amount :");
        float P=input.nextFloat();
        System.out.println("Enter Rate of interest per year :");
        float R=input.nextFloat();
        System.out.println("Enter Time the money is invested or borrowed for :");
        float T=input.nextFloat();

        float SimpleInterest=(P*R*T)/100;
        System.out.println("=> SimpleInterest is "+SimpleInterest);

        input.close();
    }
}
