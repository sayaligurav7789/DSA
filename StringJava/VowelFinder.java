package StringJava;

public class VowelFinder {

    public static int firstVowelIndex(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String input1 = "Technotsav";
        String input2 = "CRYPT";
        String input3 = "engineer";

        System.out.println("First vowel index in \"" + input1 + "\": " + firstVowelIndex(input1));
        System.out.println("First vowel index in \"" + input2 + "\": " + firstVowelIndex(input2));
        System.out.println("First vowel index in \"" + input3 + "\": " + firstVowelIndex(input3));
    }
}

