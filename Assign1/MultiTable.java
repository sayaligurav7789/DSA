package Assign1;

import java.util.Scanner;
public class MultiTable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any no. :");
        int num=input.nextInt();
        
        for(int i=1;i<=10;i++)
        {
            System.out.println(num*i);
        }

        input.close();

    }
}
