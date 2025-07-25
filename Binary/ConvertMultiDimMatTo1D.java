package Binary;

public class ConvertMultiDimMatTo1D {
    int row, col;
    int[][] arr;

    public ConvertMultiDimMatTo1D(int[][] arr) {
        this.arr = arr;
        this.row = arr.length;
        this.col = arr[0].length;
    }

    public int get(int r, int c) {
        return arr[r][c];
    }

    public int get(int i) {
        return arr[i / col][i % col];
    }

    public int[] to1DArray() {
        int[] result = new int[row * col];
        int index = 0;
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                result[index++] = arr[r][c];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        ConvertMultiDimMatTo1D obj = new ConvertMultiDimMatTo1D(arr);
        System.out.println(obj.get(5));

        int[] oneDArray = obj.to1DArray();
        for (int i : oneDArray) {
            System.out.print(i + " ");
        }
    }
}