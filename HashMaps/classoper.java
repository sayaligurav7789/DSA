// public class classoper {
//     int id;                        //by default 0
//     String name;                  //by default null
//     public static void main(String[] args) {
//         classoper c1 = new classoper();
//         System.out.println(c1.id);
//         System.out.println(c1.name);
//     }
// }

public class classoper {

    static String name;
    static float price;

    static void get(String n, float p)
    {
        name = n;
        price = p;
        System.out.println("Software name is: " + name);
        System.out.println("Software price is: " + price);
    }
    public static void main(String args[])
    {
       classoper.get("VS Code",0.0f);
    }
}
