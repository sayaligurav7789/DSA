import java.util.Arrays;
public class arrReversing {
    public static void reverse(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start < end) {
            // Swap nums[start] and nums[end]
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Original Array: " + Arrays.toString(nums));

        reverse(nums);

        System.out.println("Reversed Array: " + Arrays.toString(nums)); 
        // Output: [7, 6, 5, 4, 3, 2, 1]
    }
}

