package Binary;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(CountRotations(arr));
    }
    public static int CountRotations(int[] arr){
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    //finding pivot without duplicates;
     
    static int findPivot(int[] arr){
    int start = 0;
    int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid-1] > arr[mid]){
                return mid-1;
            }
            if(start >= arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    // finding pivot with duplicates
    // static int findPivotWithDuplicates(int[] arr) {
    //     int start = 0;
    //     int end = arr.length - 1;

    //     while (start <= end) {
    //         int mid = start + (end - start) / 2;

    //         if (mid < end && arr[mid] > arr[mid + 1]) {
    //             return mid;
    //         }
    //         if (mid > start && arr[mid - 1] > arr[mid]) {
    //             return mid - 1;
    //         }

    //         // elements at mid, start, end are equal then skip the duplicates
    //         if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
    //             // skips the duplicates
    //             // NOTE: what if the element at start and end that we skipped were the pivot??

    //             // check if start is pivot
    //             if (arr[start] > arr[start + 1]) {
    //                 return start;
    //             }
    //             start++;

    //             if (arr[end] < arr[end - 1]) {
    //                 return end - 1;
    //             }
    //             end--;
    //         }
    //         // left side is sorted, so pivot should be in right
    //         else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[end] < arr[mid]) {
    //             start = mid + 1;
    //         } else {
    //             end = mid - 1;
    //         }
    //     }
    //     return -1;
    // }

}
