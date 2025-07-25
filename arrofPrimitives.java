import java.util.Arrays;
import java.util.Scanner; 

public class arrofPrimitives {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner in = new Scanner(System.in);
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt(); 
        }

        System.out.println("Array elements are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); 
        }

        System.out.println("Array: " + Arrays.toString(arr));
        in.close();
    }
}
