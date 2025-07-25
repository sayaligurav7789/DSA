package SelectionSort;
import java.util.Arrays;

public class SimpleSelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
        
    public static void selection(int[] arr) {
        for(int i =0; i < arr.length; i++){
            int end = arr.length - i - 1;

            int maxIndex = getMaxIndex(arr,0,end);
            swap(arr,maxIndex,end);
        }
    }
    public static int getMaxIndex(int[] arr,int start,int end){            //finding maxIndex from start to end
        int max = start;
        for(int i = start; i <= end; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
    public static void swap(int[] arr, int first, int second){             //swapping maxIndex with end element 
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}