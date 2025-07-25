package Assing2;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Limit:");
        int n = sc.nextInt();

        System.out.print("Fibonacci Series: [");
        for(int i = 2; i <= n; i++){
            c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
        System.out.println("]");
        sc.close();
    }
}
