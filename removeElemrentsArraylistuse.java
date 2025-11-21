import java.util.ArrayList;
import java.util.Scanner;

public class removeElemrentsArraylistuse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int val = sc.nextInt();
        int ans =removeElement(arr, val);
        System.out.println(ans);
        for(int i = 0; i < ans; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    public static int removeElement(int[] nums, int val){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                res.add(nums[i]);
            }
        }
        //need to convert ArrayList back to int as it return type is int not arraylist
        for(int i = 0; i < res.size(); i++){
            nums[i] = res.get(i);
        }
        return res.size();
    }
}
