package Binary;

public class rotate {
    public static void main(String[] args) {
        int[] arr = {4, 5, 5, 6, 7, 7, 0, 1, 2};
        int target = 5;

        // Search Range
        int pivot = findPivotWithDuplicates(arr);

        // if pivot not found

        if (pivot == -1) {
            System.out.println(BSearch(arr, target, 0, arr.length - 1));
            return;
        }

        // if pivot found
        if (arr[pivot] == target) {
            System.out.println(pivot);
            return;
        }
        
        
        if (target >= arr[0]) {
            System.out.println(BSearch(arr, target, 0, pivot - 1));
        } else {
            System.out.println(BSearch(arr, target, pivot + 1, arr.length - 1));
        }
    }

    // finding pivot
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }

            // elements at mid, start, end are equal then skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skips the duplicates
                // NOTE: what if the element at start and end that we skipped were the pivot??

                // check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[end] < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // if pivot not found performing BSearch
    static int BSearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}