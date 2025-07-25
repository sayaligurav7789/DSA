package SlidingWindow;
class Subarray{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        System.out.println("All Subarrays (Optimal Way):");
        printAllSubarrays(arr);
    }
    public static void printAllSubarrays(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {     //for each starting point

            for (int j = i; j < n; j++) {  //for each ending point

                System.out.print("[");

                for (int k = i; k <= j; k++) {  //for each element in the subarray to be printed
                    System.out.print(arr[k] + (k == j ? "" : ", "));
                }
                System.out.println("]");
            }
        }
    }       

}