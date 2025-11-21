package PatternPrinting;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt(); 
        }

        for (int i = 0; i <= n; i++) {
            // Leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            // Stars
            for (int j = 0; j < 2*n - (2 * i - 1); j++){
                System.out.print("* ");
            }

            // Trailing spaces (optional)
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            System.out.println();
        }
    }
}
