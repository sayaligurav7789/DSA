package Binary;
public class RotatedArraySearch {
  public static void main(String[] args) {
    int[] arr = {4,5,6,7,0,1,2};
    int target = 6;

    //Search Range
    int pivot = findPivot(arr);
    
    //if pivot not found
    if(pivot == -1){
        System.out.println(BSearch(arr, target, 0, arr.length - 1));
    }

    //if pivot  found
    if(arr[pivot] == target){
        System.out.println(pivot);
    }
    if(target > arr[0]){
        System.out.println(BSearch(arr, target, 0, pivot-1));
    }
    else{
        System.out.println(BSearch(arr, target, pivot+1, arr.length-1));
    }
    
  }

//   static int Search(int[] arr,int target){
//     int pivot = findPivot(arr);
    
//     if(pivot == -1){
//         return BSearch(arr, target, 0, arr.length - 1);
//     }
//     if(arr[pivot] == target){
//         return pivot;
//     }
//     if(target > arr[0]){
//         return BSearch(arr, target, 0, pivot-1);
//     }
//     return BSearch(arr, target, pivot+1, arr.length-1);
//   }


//finding pivot
static int findPivot(int[] arr){
    int start = 0;
    int end = arr.length - 1;

    while(start<=end){
        int mid = start + (end - start) / 2;

        if(mid < end && arr[mid] > arr[mid+1]){
            return mid;
        }
        if(mid > start && arr[mid-1] > arr[mid]){
            return mid - 1;
        }
        if(start >= arr[mid]){
            end = mid-1;
        }
        else{
            start = mid+1;
        }
    }

    return -1;
}

  //if pivote not found performing BSearch
  static int BSearch(int[] arr, int target, int start, int end) {
    
    while(start<=end){
     int mid = start+(end-start)/2;

     if(target<arr[mid]){
         end = mid - 1;
     }
     else if(target>arr[mid]){
         start = mid + 1;
     }
     else{
         return mid;
     }
    }
    return -1;  
}  
}
