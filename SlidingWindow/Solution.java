package SlidingWindow;

class Solution {
    public int countSubarrays(int[] nums) {
        int count = 0;
        for (int i = 1; i  < nums.length - 2; i++) {
            if ((nums[i - 1] + nums[i + 1]) == nums[i + 1] / 2) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,1,4,1};
        System.out.println(solution.countSubarrays(nums)); // Output: 0
    }
}
