package Linear;

public class SearchRange {
    public static void main(String[] args) {
        int arr[] = {2,3,4,-1,67,45,90};
        int target = 4;
        int ans = linearSearch(arr, target,1,4);
        System.out.println("Target found at index: "+ans);
    }

    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
        return -1;
        }

        for(int i=start; i<end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
