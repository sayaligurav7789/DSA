package LinkedList;
import java.util.LinkedList;
public class AddMethod {
    public static void main(String[] args) {
        //creating the linkedlist
        LinkedList<String> l = new LinkedList<String>();

        //1.adding elements -> Nodes
        l.add("One");
        l.add("Two");
        l.add("Three");
        l.add("Four");
        l.add("Five");
        l.add("Six");
        l.add("Seven");
        l.add("Eight");
   
        System.out.println(l);
        System.out.println();

        // 2.removing elements
        l.remove("Three");  //remove by node name
        l.remove(3);    //remove by index no
        l.removeFirst();      //remove first node
        l.removeLast();       //remove last node

        System.out.println(l);
        System.out.println();

        // 3.Changing Elements i.e-updating
        l.set(1, "Updated!");
        System.out.println(l);
        System.out.println();

        // 4.Iterating the LinkedList
        for(int i = 0; i < l.size(); i++){
            System.out.println(l);
        }

        // 5.linkedlist to array using .toArray()
        Object[] a = l.toArray();
        System.out.println("After converted LinkedList to Array: ");
        for(Object element : a)
        System.out.print(element+" ");
        System.out.println();

        // 6.size();
        System.out.println("Size of LinkedList: " + l.size());
        System.out.println();

        // 7.remove First node
        System.out.println("LinkedList:" + l);
        System.out.println("The  remove first element is: " + l.removeFirst());
        // Displaying the final list
        System.out.println("Final LinkedList:" + l);
        System.out.println();

        // 8.remove last node
        System.out.println("LinkedList:" + l);
        System.out.println("The  remove first element is: " + l.removeLast());
        // Displaying the final list
        System.out.println("Final LinkedList:" + l);
    }
}
