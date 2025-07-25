import java.util.ArrayList;
import java.util.Scanner;

public class arlist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        Scanner sc= new Scanner(System.in);

         System.out.println("Enter Array Elemens: ");
         for(int i=0;i<5;i++){
            list.add(sc.nextInt());
         }

         System.out.println("Arraylist:");
         System.out.println(list);

        //  System.out.println("Arraylist: ");               
        //  for(int i=0;i<5;i++){                                   //This loop will print the arraylist vertically
        //     System.out.println(list.get(i));
        //  }
        sc.close();
    }    
}
