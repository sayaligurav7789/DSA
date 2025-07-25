import java.util.Scanner;
public class ar2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int row=sc.nextInt();
        System.out.println("Enter no. of cols: ");
        int col=sc.nextInt();

        int[][] arr=new int[row][col];
        System.out.println("Enter matrix elements: ");
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                System.out.print("Element at [" + r + "][" + c + "]: ");
                arr[r][c]=sc.nextInt();
            }
        }

        System.out.println("Matrix: ");
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
               System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
