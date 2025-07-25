package StringJava;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Hello World!";
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(rev);
    }
}
