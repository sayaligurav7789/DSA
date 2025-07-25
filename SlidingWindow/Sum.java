package SlidingWindow;

public class Sum {
    public static int slide(int[] nums, int k){
        int left = 0;
        int sum = 0;
        int maxLen = 0;

        for(int right = 0; right < nums.length; right++){ 
            sum += nums[right];

            while(sum > k){
                sum -= nums[left];
                left++;
            }

            if(sum <= k){
                maxLen = Math.max(maxLen, right - left +1);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 7, 10};
        int k = 14;
        System.out.println(slide(nums, k));

    }
}
