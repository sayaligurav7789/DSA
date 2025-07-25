package InsersionSort;

import java.util.Arrays;

public class SimpleInsersionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Insertion(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);     
                }
            }
        }
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

//or I can directly swap instead creating another method like 

// int temp = arr[j];
//arr[j] = arr[j-1];
//arr[j-1] = temp; 
