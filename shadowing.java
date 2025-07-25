public class shadowing {
    static int a=90;                   //shadowed by a=40
    public static void main(String[] args) {
        System.out.println(a);
        int a=40;
        System.out.println(a);
        fun();
    }
    static void fun(){
        System.out.println(a);
    }
}
