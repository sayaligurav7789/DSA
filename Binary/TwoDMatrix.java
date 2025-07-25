package Binary;
public class TwoDMatrix {
    public static void main(String[] args) {
        int[] result = BsearchInMat();
        if (result[0] == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at index: [" + result[0] + "][" + result[1] + "]");
        }
    }

    public static int[] BsearchInMat() {
        int[][] arr= {
            {18, 9, 12},
            {36, -1, 91},
            {44, 33, 16}
        };
        int target = 91;

        for (int r = 0; r < arr.length; r++) {  
            for (int c = 0; c < arr[r].length; c++) {  
                if (arr[r][c] == target) {
                    return new int[]{r, c}; // Returning index as an array
                }
            }
        }
        return new int[]{-1, -1}; // Return -1, -1 if not found
    }
}
