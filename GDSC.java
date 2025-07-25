import java.util.Scanner;
public class GDSC {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the range:");
        int range=sc.nextInt();
        System.out.println("Even No:");

        for (int i = 0; i <= range; i=i+2) 
        {
                System.out.print(i + " "); 
      
        }
        System.out.println();

        System.out.println("Odd No:");

        for (int i = 1; i <= range; i=i+2) 
        {
           
                System.out.print(i + " "); 
         
        }
        sc.close();
    }
}

