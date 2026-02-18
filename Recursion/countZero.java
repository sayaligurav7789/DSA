package Recursion;

public class countZero {
    public static void main(String[] args) {
        System.out.println(count(10200));
    }
    static int count(int n){
        return helper(n, 0);
    }
    static int helper(int n, int count){
        if(n == 0){
            return count;
        }
        int rem = n % 10;
        if(rem == 0){
            count++;
        }
        return helper(n/10, count);
    }
}
