package CountSort;

import java.util.Arrays;

public class SimpleCountSort {
    public static void main(String[] args) {
        int[] array = {1,5,2,4,3,6,8,3};
        CountSort(array);
        System.out.println(Arrays.toString(array));

    }
    static void CountSort(int[] array){
        if(array == null || array.length <= 1){
            return;                                               //base case
        }

        int max = array[0];                                       //Finding max 
        for(int num: array){
            if(num > max){
                max = num;
            }
        }

        int[] countArray = new int[max + 1];                      //creating new array of length max+1

        for(int num: array){                                      //traversing original array
            countArray[num]++;                                    //getting frequency array  
        }

        int index = 0;                                            //index for original array                               
        for(int i = 0; i <= max; i++){                            //running through the frequency array
            while(countArray[i] > 0){                             //if frequency is greater than 0
                array[index] = i;                                 //updating original array
                index++;                                          //incrementing index
                countArray[i]--;                                  //decrementing frequency array
            }
        }
    }
}
