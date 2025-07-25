import java.util.Scanner;
public class printfun {
    public static void main(String[] args) {
       sum();
    }

    static void sum()
    {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter first no. : ");
       int num1=sc.nextInt();
       System.out.println("Enter second no. : ");
       int num2=sc.nextInt();
       int sum=num1+num2;
       System.out.println("The sum : "+sum);
       sc.close();
    }
}
