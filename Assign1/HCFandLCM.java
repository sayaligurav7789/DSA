package Assign1;

public class HCFandLCM {

    // Method to compute HCF (GCD) using Euclid's algorithm
    public static int computeHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to compute LCM
    public static int computeLCM(int a, int b) {
        return (a * b) / computeHCF(a, b);  // LCM formula
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;

        int hcf = computeHCF(num1, num2);

        int lcm = computeLCM(num1, num2);

        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
