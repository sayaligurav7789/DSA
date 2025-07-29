package HashMaps;
import java.util.HashSet;
class IntersectionSolution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int n1 : nums1){
            set.add(n1);
        }

        HashSet<Integer> resultSet = new HashSet<>();
        for(int n2 : nums2){
            if(set.contains(n2)){
                resultSet.add(n2);
            }
        }

        int[] resultArray = new int[resultSet.size()];
        int i = 0;
        for(int n3 : resultSet){
            resultArray[i] = n3;
            i++; 
        }

        return resultArray;
    }
}
