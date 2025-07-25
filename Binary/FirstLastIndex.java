package Binary;

import java.util.Arrays;

public class FirstLastIndex {
    // public static void main(String[] args) {
    //     int[] nums = {5, 7, 7, 8, 8, 10};
    //     int target = 8;

    //     int[] result = searchRange(nums, target);

    //     System.out.println("First and Last Position: " + Arrays.toString(result));
    // }

    // public static int[] searchRange(int[] nums, int target) {

    //     int [] ans = {-1, -1}; // initialize to -1 -1

    //     // Handle empty array case
    //     if (nums.length == 0){
    //         return ans;
    //     }
        
    //     // Find first occurrence
    //     ans[0] = search(nums, target, true);
        
    //     // If target is found, find last occurrence
    //     if(ans[0] != -1) {
    //          ans[1] = search(nums, target, false);
    //     }
    //     return ans;
    // }

    // // This function returns the index of the first or last occurrence of target
    // private static int search(int[] nums, int target, boolean findStartIndex) {
    //     int ans = -1;
    //     int start = 0;
    //     int end = nums.length - 1;

    //     while(start <= end){
    //         int mid = start + (end - start) / 2;

    //         if(nums[mid] < target){
    //             start = mid + 1;
    //         }
    //         else if(nums[mid] > target){
    //             end = mid - 1;
    //         }
    //         else{
    //             ans = mid;
    //             if(findStartIndex){
    //                 end = mid - 1;
    //             }
    //             else{
    //                 start = mid + 1;
    //             }
    //         } 
    //     }
    //     return ans;
    // }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 10;
        
        int[] result = SearchRange(nums, target);
        System.out.println("First and last position: " + Arrays.toString(result));
    }

    public static int[] SearchRange(int[] nums, int target){
        int[] ans = {-1,-1};

        ans[0] = Bsearch(nums, target,true);

        if(ans[0] != -1){
            ans[1] = Bsearch(nums, target,  false);
        }
        return ans;
    }

    public static int Bsearch(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] < target){
                start = mid + 1;
            }
            else if(nums[mid] > target){
                end = mid -1;
            }
            else{
                ans = mid;
                if(findStartIndex){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}