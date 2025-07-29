package HashMaps;

import java.util.HashMap;

class SingleNum{
    // Method to find the single number
    public int Single(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>(); // Create HashMap

        // Precalculation: Count frequency of each number
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Find the number with frequency 1 using keySet
        for (int i = 0; i < nums.length; i++) {
            if (freqMap.get(nums[i]) == 1) {
                return nums[i];
            }
        }

        // //or i can write above loop like this 
        // for (int key : freqMap.keySet()) {
        //     if (freqMap.get(key) == 1) {
        //         return key;
        //     }
        // }



        return -1; // If no unique element found
    }

    // Main method to test the function
    public static void main(String[] args) {
        SingleNum solution = new SingleNum();

        int[] nums = {4, 1, 2, 1, 2};
        int result = solution.Single(nums);

        System.out.println("The element that appears only once is: " + result);
    }
}
