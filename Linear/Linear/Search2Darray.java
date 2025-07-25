package Linear;

import java.util.Arrays;

public class Search2Darray {
    
    //main fun

    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {45,67,22,13},
            {18,12},
        };
        int target = 2;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));

        int greater=max(arr);
        System.out.println("Max No. :"+greater);
    }

    //Search element

    static int[] search(int[][] arr,int target){
        for(int i =0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    
    //Search MAx
    
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        // for(int[] ints:arr){
        //     for(int elements:ints){
        //         if(elements>max){
        //             max=elements;
        //         }
        //     }
        // }
        for (int[] arr1 : arr) {                              //for row
            for (int j = 0; j < arr1.length; j++) {           //for column
                if (arr1[j] > max) {
                    max = arr1[j];
                }
            }
        }
        return max;
    }
}
