package Assing2;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter currency in rupees: ");
        double rupees = input.nextDouble();  
        
        double exchangeRate = 83.0;  // Set the exchange rate as a double
        double USD = rupees / exchangeRate;  // Perform the division
        
        System.out.println("Currency in USD: " + USD);  

        input.close();
    }
}

