package LinkedList;

public class Main {
    public static void main(String[] args) {
        singly list = new singly();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.display();

        list.insertLast(130);
        list.display();

        list.insert(100, 3);
        list.display();

        System.out.println("Deleted first element: " + list.deleteFirst());
        list.display();

        System.out.println("Deleted last element: " + list.deleteLast());
        list.display();

        System.out.println("Deleted element at index 2: " + list.delete(2));
        list.display();

        list.modifyByIndex(0, 200);
        list.display();

        System.out.println("Size of List: " + list.getSize());

        // Node foundNode = list.find(130);
        // if (foundNode != null) {
        //     System.out.println("Item 130 found with value: " + foundNode.value);
        // } else {
        //     System.out.println("Item 130 not found in the list.");
        // }
    }
}
