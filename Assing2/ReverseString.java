package Assing2;

// public class ReverseString {
//     public static void main(String[] args) {
//         String original = "Hello, World!";
        
//         // Using StringBuilder's reverse() method
//         StringBuilder sb = new StringBuilder(original);
//         String reversed = sb.reverse().toString();
        
//         System.out.println("Original: " + original);
//         System.out.println("Reversed: " + reversed);
//     }
// }

public class ReverseString {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) 
        {
            reversed += original.charAt(i);
        }

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}



