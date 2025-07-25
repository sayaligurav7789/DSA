package SlidingWindow;

public class SubString {
    public static void main(String[] args) {
        String s = "abc";
        printAllSubstrings(s);
    }

    public static void printAllSubstrings(String s) {
        int n = s.length();
       
        for (int i = 0; i < n; i++) {
                String sub = "";
            for (int j = i; j < n; j++) {
                sub = sub + s.charAt(j);
                System.out.println(sub);
            }
        }
    }
}
