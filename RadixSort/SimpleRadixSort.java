package RadixSort;
import java.util.*;
public class SimpleRadixSort {

  public static void radixSort(int[] arr) {
    int max = Arrays.stream(arr).max().getAsInt();

    // do count sort for every digit place
    for(int exp = 1; max/exp > 0; exp *= 10) {
      countSort(arr, exp);
    }
  }
 
  private static void countSort(int[] arr, int exp) {
    int n = arr.length;
    int[] output = new int[n];
    int[] count = new int[10];

    // Initialize count array with 0
    Arrays.fill(count, 0);     

    // Store count of occurrences in count[]
    for(int i=0; i<n; i++) {
      count[(arr[i] / exp) % 10]++;
    }

    System.out.println("\nCount array for " + exp + " : " + Arrays.toString(count));

    // Change count[i] so that count[i] contains actual position of this digit in output[]
    for(int i=1; i<10; i++) {
      count[i] = count[i] + count[i-1];
    }

    System.out.println("Updated count array " + Arrays.toString(count));
    // Build the output array
    for(int i=n-1; i>=0; i--) {
      output[count[(arr[i] / exp) % 10] - 1] = arr[i];
      count[(arr[i] / exp) % 10]--;
    }

    System.out.println("Output array " + Arrays.toString(output));
    
    // Copy the output array to arr[], so that arr[] now contains sorted numbers according to current digit
    System.arraycopy(output, 0, arr, 0, n);
    
  }
  
  public static void main(String[] args) {
    int[] arr = {29, 83, 471, 36, 91, 8};

    System.out.println("Origin array: " + Arrays.toString(arr));
    radixSort(arr);
    System.out.println("Sorted array: " + Arrays.toString(arr));
  }
}

