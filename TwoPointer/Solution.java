package TwoPointer;
public class Solution {

    // Function to find the length of the longest substring without repeating characters
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            int[] hash = new int[256]; // ASCII character tracker
            for (int j = i; j < n; j++) {
                if (hash[s.charAt(j)] == 1) {
                    break; // character already exists
                }

                hash[s.charAt(j)] = 1;
                int len = j - i + 1;
                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;
    }

    // Main method to test the function
    public static void main(String[] args) {
        Solution solution = new Solution();

        String test1 = "abcabcbb";
        String test2 = "bbbbb";
        String test3 = "pwwkew";
        String test4 = "";

        System.out.println("Length of longest substring in \"" + test1 + "\": " + solution.lengthOfLongestSubstring(test1));
        System.out.println("Length of longest substring in \"" + test2 + "\": " + solution.lengthOfLongestSubstring(test2));
        System.out.println("Length of longest substring in \"" + test3 + "\": " + solution.lengthOfLongestSubstring(test3));
        System.out.println("Length of longest substring in \"" + test4 + "\": " + solution.lengthOfLongestSubstring(test4));
    }
}
