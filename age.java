import java.util.*;
public class age {

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int a=sc.nextInt();

        if(a>=18)
        {
            System.out.println("You can vote!");
        }
        else{
            System.out.println("Opps...!18You can't vote!");
        }

        sc.close();
    }

    
}
