import java.util.Arrays;
import java.util.Scanner;

public class AlphaOrder {
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 1; j < n - i; j++) {
                if (arr[j - 1].compareTo(arr[j]) > 0) {
                    String temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 10;
        String[] words = new String[n];

        System.out.println("Enter 10 strings:");
        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }

        bubbleSort(words);

        System.out.println("Sorted strings: " + Arrays.toString(words));

        scanner.close();
    }
}