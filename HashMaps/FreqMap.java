package HashMaps;
import java.util.HashMap;
public class FreqMap {
    public static void main(String[] args) {
    String str = "aabccc";
    HashMap<Character, Integer> freq = new HashMap<>();

    for (char c : str.toCharArray()) {
        freq.put(c, freq.getOrDefault(c, 0) + 1);
    }
    System.out.println(freq);  // {a=2, b=1, c=3}
    }
    
}
