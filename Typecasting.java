import java.util.Scanner;
public class Typecasting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //implicit: smaller to larger
        System.out.println("Typecasting1:");
        System.out.print("Enter no. :");
        float num1=sc.nextFloat();
        System.out.println(num1);
        
        //explicit: larger to smaller
        System.out.println("\nTypecasting2:");
        System.out.print("float to int:");
        int num2=(int)(67.56f);
        System.out.println(num2);

        System.out.println("\nTypecasting3:");
        byte b=42;
        char c='a';
        short s= 1024;
        int i=500000;
        float f=5.67f;
        double d= 0.1234;
        double result=(f*b)+(i/c)-(d-s);
        System.out.println((f*b)+ " " +(i/c)+ " " +(d-s));
        System.out.println(result);
        

        sc.close();
    }
    
}
//Typecasting: converting one data type to other