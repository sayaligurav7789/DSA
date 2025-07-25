import java.util.Scanner;

class plindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        int temp = n, sum = 0, rem;
        
        while (n != 0) {  // Fix: Use a loop to reverse the number
            rem = n % 10;
            sum = (sum * 10) + rem;
            n = n / 10;
        }

        if (temp == sum) {
            System.out.println(temp + " is a palindrome number.");
        } else {
            System.out.println(temp + " is not a palindrome number.");
        }
        
        sc.close();
    }
}
