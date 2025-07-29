package HashMaps;
import java.util.HashMap;
import java.util.Map;
public class TopKEle {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Step 1: Count frequency
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int[] res = new int[k];

        // Step 2: Brute-force pick top K frequent elements
        for (int i = 0; i < k; i++) {
            int maxFreq = 0;
            int mostFrequent = 0;

            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                if (entry.getValue() > maxFreq) {
                    maxFreq = entry.getValue();
                    mostFrequent = entry.getKey();
                }
            }

            res[i] = mostFrequent;
            freq.remove(mostFrequent); // Remove so it doesn't get picked again
        }

        return res;
    }
}
