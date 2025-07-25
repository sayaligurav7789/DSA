import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        
        // Handle case for numbers less than 2 (1 is not a prime number)
        if (num <= 1) 
        {
            System.out.println("It is not a prime number.");
        } 
        else 
        {
            boolean isPrime = true;
            int c = 2;
            while (c <=Math.sqrt(num)) {
                if (num % c == 0) {
                    isPrime = false;
                    break;
                }
                c++;
            }
            
            if (isPrime) 
                {
                    System.out.println("It is a prime number.");
                } 
            else 
                {
                    System.out.println("It is not a prime number.");
                }
        }
        sc.close();
    }
}
