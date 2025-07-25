import java.util.Scanner;
public class multi {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements for a 3x3 matrix:");
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col] = sc.nextInt();
            }
        }

        System.out.println("The entered 2D array is:");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");  
            }
            System.out.println();  
          }
          sc.close();
        }
}