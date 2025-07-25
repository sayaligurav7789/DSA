package Binary;
//facebook interview Question 
import java.util.Arrays;

public class StartEndPos {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target =7;
        int[] result = searchRange(arr, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] searchRange(int[] arr, int target) {
        int[] ans = {-1, -1};
        int start = Position(arr, target, true);  //right
        int end = Position(arr, target, false);   //left

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    static int Position(int arr[], int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; 

            if (target < arr[mid]) {
                end = mid - 1;
            } 
            else if (target > arr[mid]) {
                start = mid + 1;
            } 
            else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1; // Search towards the left
                } else {
                    start = mid + 1; // Search towards the right
                }
            }
        }
        return ans;
    }
}
