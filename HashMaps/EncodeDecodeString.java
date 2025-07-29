package HashMaps;
import java.util.*;

class EncodeDecodeString {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s.length()).append("#").append(s);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        EncodeDecodeString sol = new EncodeDecodeString();
        List<String> input = Arrays.asList("hello", "world", "java");
        String result = sol.encode(input);
        System.out.println("Encoded: " + result);
    }
}
