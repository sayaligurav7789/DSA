package Binary;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr= {3,5,7,9,10,90,100,130,140,160,170};
        int target=170;
        System.out.println(range(arr,target));
    }
    static int range(int[] arr,int target){
        int start = 0;
        int end = 1;                     //adding chunks

        //condition for the target to lie in the range
        while(target > arr[end]){
            int newStart = end+1;
            end = end+(end-start+1)*2;        //end = previous end + sizeofbox *2     //double the box value for next chunk

            if (end >= arr.length) {  // Prevent going out of bounds
                end = arr.length - 1;
            } 
            start = newStart;
        }
        return Search(arr, target, start, end);
    }
    static int Search(int[] arr, int target,int start,int end){

        while(start <= end){
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
