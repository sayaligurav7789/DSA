package Assing2;
import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first No.: ");
        int numF = input.nextInt();
        System.out.println("Enter last No.: ");
        int numL = input.nextInt();
        
        for (int i = numF; i <= numL; i++) 
        {
            int temp = i;
            int sum = 0;
            
            while (temp != 0) {
                int rem = temp % 10;
                sum = sum + rem * rem * rem; 
                temp = temp / 10; 
            }
            
            if (sum == i) {
                System.out.println(i + " is an Armstrong number.");
            }
        }
        input.close();
    }
}

