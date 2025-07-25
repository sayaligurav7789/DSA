package Assign1;

import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        // Find HCF (Greatest Common Divisor)
        int hcf = 1;  // Initialize HCF to 1 (smallest common factor)
        int min = Math.min(num1, num2);  // Find the smaller number to limit the loop

        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }

        // Find LCM using the relation: LCM * HCF = num1 * num2
        int lcm = (num1 * num2) / hcf;

        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);

        input.close();
    }
}

