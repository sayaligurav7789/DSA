package Recursion;

public class Nsum {
    public static void main(String[] args) {
        System.out.println(find(5));
    }
    static int find(int n){
        if(n == 0){
            return 0;
        }
        else{
            return n + find(n-1);
        }
    }
}
