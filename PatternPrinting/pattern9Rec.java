package PatternPrinting;

public class pattern9Rec {
    // public static void main(String[] args) {
    //     int n = 5;
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= n - i + 1; j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    //using recursion
    public static void main(String[] args) {
        triangle(4, 0);
    }
    static void triangle(int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
            System.out.print("* ");
            triangle(row, col+1);
        }
        else{
            System.out.println();
            triangle(row-1, 0);
        }
    }
}
