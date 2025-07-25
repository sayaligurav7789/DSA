package Linear;

public class pgm1 {

    public static void main(String[] args) {
        int[] arr = {23,45,6,54,7,8};
        int target = 6;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }
    public static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i =0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
   
}
