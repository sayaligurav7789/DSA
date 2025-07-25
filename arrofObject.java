import java.util.Arrays;
import java.util.Scanner;

public class arrofObject {
    public static void main(String[] args) {
        String[] str = new String[6];
        Scanner in = new Scanner(System.in);

        System.out.println("Enter elements:");
        for (int i = 0;i < str.length;i++) {
            str[i] = in.next(); 
        }

        // for(int i=0 ;i < str.length ;i++){
        //     System.out.println(str[i]);
        // }

        //for each loop
        for (String strelem : str) {
            System.out.println(strelem);
        }
        System.out.println("String: "+Arrays.toString(str));
        in.close();
    }
}
