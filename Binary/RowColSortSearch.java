package Binary;

public class RowColSortSearch {
    public static void main(String[] args) {
       int matrix[][] = {
           {1,3,5,7},
           {10,11,16,20},
           {23,30,34,60}
       };
        int target = 60;
        System.out.println(Search(matrix,target));
    }
    public static boolean Search(int[][] matrix,int target){
        int r = 0;
        int c = matrix[0].length-1;
        if(matrix.length == 0 || matrix[0].length == 0){
            return false;
        }

        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return true;
                    
            }
            else if(matrix[r][c] > target){
                c--;
            }
            else{
                r++;
            }
        }
        return false;
    }
    
}
