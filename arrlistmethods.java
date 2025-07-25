import java.util.ArrayList;
public class arrlistmethods {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(5);

        //methods to perform operation on Arraylist
        list.add(45);
        list.add(453);
        list.add(345);
        list.add(455);
        list.add(145);
        list.add(345);
        list.add(545);
        list.add(945);

        
                  
        list.contains(453);
        list.remove(7);
        list.set(0, 44);

        System.out.println("Arraylist: " + list);
    }
}
