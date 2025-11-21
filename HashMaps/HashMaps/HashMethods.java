package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class HashMethods {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // put(): Add key-value pairs
        map.put("apple", 2);
        map.put("banana", 4);
        map.put("orange", 3);

        // get(): Get value for a key
        System.out.println("Value for 'apple': " + map.get("apple")); // 2

        // getOrDefault(): Get value or return default
        System.out.println("Value for 'grapes' (default 0): " + map.getOrDefault("grapes", 0)); // 0

        // containsKey(): Check if key exists
        System.out.println("Contains 'banana'? " + map.containsKey("banana")); // true

        // containsValue(): Check if value exists
        System.out.println("Contains value 4? " + map.containsValue(4)); // true

        // keySet(): Get all keys
        System.out.println("Keys: " + map.keySet()); // [apple, banana, orange]

        // values(): Get all values
        System.out.println("Values: " + map.values()); // [2, 4, 3]

        // entrySet(): Get key-value pairs
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // replace(): Replace value for a key
        map.replace("apple", 10);
        System.out.println("Replaced value for 'apple': " + map.get("apple")); // 10

        // remove(): Remove by key
        map.remove("banana");
        System.out.println("After removing 'banana': " + map);

        // isEmpty(): Check if map is empty
        System.out.println("Is map empty? " + map.isEmpty());

        // size(): Get number of entries
        System.out.println("Size of map: " + map.size());

        // clear(): Remove all entries
        map.clear();
        System.out.println("Map after clear: " + map); // {}
    }
}
