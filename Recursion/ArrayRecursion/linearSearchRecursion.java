package Recursion.ArrayRecursion;

public class linearSearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 3;
        System.out.println(linearSearch(arr, target, 0));
    }
    static int linearSearch(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return linearSearch(arr, target, index+1);
        }
    }
}
