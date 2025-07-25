package Linear;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {12,34,-7,99,-1,0};
        System.out.println(Search(arr));
    }
        
    static int Search(int[] arr) {
        int min = arr[0];
            for(int i=1; i<arr.length; i++){
                if(arr[i]<min){
                    min= arr[i];
                }
            }
        return min;
    }

}
