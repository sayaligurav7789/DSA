import java.util.Scanner;

public class removeElementsInPlace {
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
    }
    public static int removeElement(int[] arr, int val){
        int i = 0;
        for(int j = 1;j < arr.length; j++){
            if(arr[j] != val){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}
