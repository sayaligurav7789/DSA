package HashMaps;

import java.util.HashMap;

public class CharHashing {
    // public static void main(String[] args) {
    //     String n = "sayali";
    //     char target = 'a';

    //     int count = 0;
    //     char[] name = n.toCharArray();
    //     for(int i = 0; i < name.length; i++){
    //         if(name[i] == 'a'){
    //             count++;
    //         }
    //     }
    //     System.out.println("a cout is: "+ count);
    // }


    public static void main(String[] args) {
        String name = "sayali";
        char target = 'a';

        HashMap<Character, Integer> Map = new HashMap<>();
        char[] narr = name.toCharArray();
        for(char i : narr){
            Map.put(i, Map.getOrDefault(i, 0) + 1);
        }

        // Print the frequency of the target character
        if (Map.containsKey(target)) {
            System.out.println("Frequency of '" + target + "' is: " + Map.get(target));
        } else {
            System.out.println("Character '" + target + "' not found in the string.");
        }
    }
}
