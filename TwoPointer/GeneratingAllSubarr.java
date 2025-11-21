package TwoPointer;

public class GeneratingAllSubarr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        generateSubarrays(arr);

    }
    public static void generateSubarrays(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            String sub = "";
            for (int j = i; j < n; j++) {
                sub += arr[j] + " ";
                System.out.println(sub); // Print the current subarray trim is used to remove trailing spaces

            }
        }
    }

}
