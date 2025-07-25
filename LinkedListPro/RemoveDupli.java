package LinkedListPro;

public class RemoveDupli {
    private Node head;
    private Node tail;
    private int size;

    public RemoveDupli(){
        this.size = 0;
    }

    class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    // Inserts a value at the end (for simplicity, assuming input is sorted)
    public void insert(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    // Removes duplicates from sorted linked list
    public void duplicate(){
        Node node = head;

        while(node != null && node.next != null){
            if(node.value == node.next.value){
                // Skip the duplicate node
                node.next = node.next.next;
                size--;
            } else {
                // Move to the next distinct value
                node = node.next;
            }
        }
        // Update tail reference
        tail = node;
        if(tail != null) tail.next = null;
    }

    // Display linked list
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Main method
    public static void main(String[] args) {
        RemoveDupli list = new RemoveDupli();

        // Insert sorted values with duplicates
        list.insert(1);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(3);
        list.insert(4);

        System.out.println("Original List:");
        list.display();

        // Remove duplicates
        list.duplicate();

        System.out.println("List after removing duplicates:");
        list.display();
    }
}
