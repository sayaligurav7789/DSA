package Recursion.Level1;

public class NumPrint {
    public static void main(String[] args) {
        print1(1);
    }
    // more generlized recursion way
    static void print1(int n){
        // Base condition
        if(n == 5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print1(n+1);
    }
    // static void print2(int n){
    //     System.out.println(n);
    //     print3(3);
    // }
    // static void print3(int n){
    //     System.out.println(n);
    //     print4(4);
    // }
    // static void print4(int n){
    //     System.out.println(n);
    //     print5(5);
    // }
    // static void print5(int n){
    //     System.out.println(n);
    // }
}
