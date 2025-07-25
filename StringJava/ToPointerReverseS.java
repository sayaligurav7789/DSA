package StringJava;

public class ToPointerReverseS {
    public static String main(String[] args) {
        String S = "Sayali!";
        char[] arr = S.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return new String(arr);
    }
    
}
