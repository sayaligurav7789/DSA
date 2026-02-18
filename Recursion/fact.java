package Recursion;

public class fact {
    public static void main(String[] args) {
        System.out.println(find(5));
    }
    static int find(int n){
        if(n == 0){
            return 1;
        }
        return n * find(n-1);
    }
}
