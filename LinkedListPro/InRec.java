package LinkedListPro;

public class InRec {
    private Node head;
    private Node tail;
    private int size;

    public InRec(int size){
        this.size = 0;
    }

    // Node class to define each element of the linked list
    class Node {
        private int value;
        private Node next;

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    // Method to insert a value recursively at a given index
    public void insertRec(int value, int index){
        head = insertRec(value, index, head); // Start recursion from the head
    }

    // Recursive method to insert a node at a specific index
    public Node insertRec(int value, int index, Node node){
        // Base case: When index is 0, this is the place to insert the node
        if(index == 0){
            Node temp = new Node(value, node); // Create a new node with the given value, and next pointing to current node
            size++;
            return temp; // Return the new node so it links correctly during recursion unwind
        }

        // Recursive case: move one step forward in the list
        // This is key: we pass `node.next` to move forward in the list.
        // We're not inserting here yet — we are just going deeper.
        // Example when inserting 7 at index 3 in list 3 → 5 → 9 → 1:
        // 1st call: value=7, index=3, node.value=3
        // 2nd call: value=7, index=2, node.value=5
        // 3rd call: value=7, index=1, node.value=9
        // 4th call: value=7, index=0, node.value=1 → insert here
        node.next = insertRec(value, index - 1, node.next);

        // After the insertion, reconnect this node to the updated next node
        return node;
    }

    // Utility method to display the current linked list
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Main method to test the recursive insert
    public static void main(String[] args) {
        InRec RL = new InRec(0);
        RL.insertRec(3, 0); // List: 3
        RL.insertRec(5, 1); // List: 3 → 5
        RL.insertRec(9, 2); // List: 3 → 5 → 9
        RL.insertRec(1, 3); // List: 3 → 5 → 9 → 1
        RL.insertRec(7, 3); // Insert 7 at index 3 → List: 3 → 5 → 9 → 7 → 1
        RL.display();       // Output: 3 -> 5 -> 9 -> 7 -> 1 -> NULL
    }
}
