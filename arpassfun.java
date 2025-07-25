
import java.util.Arrays;


// import java.util.Arrays;
// public class arpassfun {
//     public static void main(String[] args) {
//         int[] nums={3,4,5,6};
//         System.out.println("Actual array: "+Arrays.toString(nums));
//         change(nums);
//         System.out.println("Changed array: "+Arrays.toString(nums));
//     }
//     static void change(int[] arr)
//     {
//         arr[0]=99;
//     }
// }
public class arpassfun{
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5};
        System.out.println("Actual array: "+Arrays.toString(ar));
        change(ar);
        System.out.println("Changed Array: "+Arrays.toString(ar));     
        }
        
        public static void change(int[] nums) {
               nums[0] = 9;
        }
}


