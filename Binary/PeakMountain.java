package Binary;

public class PeakMountain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 3, 2};
        int ans = Search(arr);
        System.out.println(ans);
    }
        
    private static int Search(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            int mid = start + (end - start) / 2;

            int max1 = arr[start];
            for (int i = start + 1; i <= mid; i++) {
                if (arr[i] > max1) {
                    max1 = arr[i];
                }
            }

            int max2 = arr[mid + 1];
            for (int i = mid + 2; i <= end; i++) {
                if (arr[i] > max2) {
                    max2 = arr[i];
                }
            }

            if (max1 > max2) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
