package PatternPrinting;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        sc.close();

        for (int i = 1; i <= n; i++) {
            // Leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            // Trailing spaces (optional)
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            System.out.println();
        }
    }
}
/*
        *
      * * *
    * * * * *
  * * * * * * * 
*/