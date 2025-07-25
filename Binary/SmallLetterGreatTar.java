package Binary;

public class SmallLetterGreatTar {
    public static void main(String[] args) {
        char letters[] = {'a','b','c','d','e','f','g'};
        char target = 'd';
        char res = LetterSearch(letters,target);
        System.out.println(res);
    }

    static char LetterSearch(char letters[],char target){
        int start = 0;
        int end = letters.length-1;

        while(start<=end){
            int mid = start + (end-start) / 2;

            if(letters[mid]<=target){
                start = mid+1;
            }
            else if(letters[mid]>target){
                end = mid-1;
            }
        }
        return letters[start%letters.length];      //only change to print letter instead of index 
    } 
}

// package Binary;
//Smallest number greater than or eqal to the target
// public class Cieling {
//     public static void main(String[] args) {
//         int arr[] = {12,23,45,56,78,89};
//         int target = 44;
//         int res = CielSearch(arr,target);
//         System.out.println(res);
//     }

//     static int CielSearch(int arr[],int target){
//         int start = 0;
//         int end = arr.length-1;

//         while(start<=end){
//             int mid = start + (end-start) / 2;

//             if(arr[mid]<target){
//                 start = mid+1;
//             }
//             else if(arr[mid]>target){
//                 end = mid-1;
//             }
//             else{
//                 return mid;
//             }
//         }
//         return start;       //only change
//     }
// }

