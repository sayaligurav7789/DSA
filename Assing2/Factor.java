package Assing2;

import java.util.Scanner;
public class Factor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a No. :");
        int num=sc.nextInt();

        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
