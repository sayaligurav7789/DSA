package Recursion.Level1;

public class reverse {
    public static void main(String[] args) {
        revNum(10200);
    }
    static void revNum(int n){
        if(n == 0){
            return;
        }
        else{
            System.out.print(n % 10);
            revNum(n/10);
        }
    }
}
