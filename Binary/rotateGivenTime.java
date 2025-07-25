package Binary;

import java.util.Arrays;

public class rotateGivenTime{
    public static void rotate(int[] nums, int k){
        int n = nums.length;
        k = k % n; 

        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[i] = nums[(i + k) % n]; 
        }

        for (int i = 0; i < n; i++) {
            nums[i] = rotated[i];
        }
    }

    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 2;

        rotate(nums, k);
        System.out.println("Rotated array: " + Arrays.toString(nums));
    }
}