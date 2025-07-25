package CyclicSort;

import java.util.Arrays;

public class SimpleCyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2,6,7,9,8,10};
        Cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Cyclicsort(int[] arr){
        int i = 0;

        while(i < arr.length){
            int correct = arr[i] - 1;        //in case of elements starts from 1 to n
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++; 
            }
        }
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
