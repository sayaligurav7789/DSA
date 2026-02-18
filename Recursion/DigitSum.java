package Recursion;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(find(1234));
    }
    static int find(int n){
        if(n == 0){
            return 0;
        }
        else{
            return n % 10 + find(n/10);
        }
    }
}
