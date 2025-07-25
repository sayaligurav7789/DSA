import java.util.Scanner;
public class returnfun {
    public static void main(String[] args) {
        int ans=sum();                            //assigned returned value to ans
        System.out.println("sum: "+ans);         //to print 
    }
    static int sum()
    {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter first no. : ");
       int num1=sc.nextInt();
       System.out.println("Enter second no. : ");
       int num2=sc.nextInt();
       int sum=num1+num2;
       sc.close(); 
       return sum;       
                     
    }
  
}
