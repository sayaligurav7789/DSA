package LinkedList;

public class singly {

    private Node head;
    private Node tail;
    private int size;

    public singly() {
        this.size = 0;
    }

    // Inner class for Node
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int value){
        Node node = new Node(value);   //creating node
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;

    }

    public void insertLast(int value){
        if(tail == null){
            insertFirst(value); // If list is empty, treat as first insert
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size - 1){
            insertLast(val);
            return;
        }

        //traverse with temp referece variable of type Node to get the index 
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst(){
        int val = head.value;  //first head value stored in val so that we can remove val
        head = head.next;      //......................
        if(head == null){
            tail = null;       //if single node is there
        }
        size--;
        return val;
    }

    public int deleteLast(){
        // // Find the second last node
        // Node secondLast = head;
        // while (secondLast.next.next != null) {
        //     secondLast = secondLast.next;
        // }

        // // Delete the last node
        // secondLast.next = null;

        // int val = tail.value; // Store the value of the last node
        // tail = secondLast;    // Update the tail to the second last node
        // size--;               // Decrease the size of the list
        // return val;           // Return the value of the deleted node


        if(size <= 1){
            return deleteFirst();
        }

        Node secondlast = get(size - 2); // Get the second last node....................
        int val = tail.value;            // Store the value of the last node
        tail = secondlast;               // Update the tail to the second last node
        tail.next = null;                // Set the next of the new tail to null
        size--;                          // Decrease the size of the list
        return val;                      // Return the value of the deleted node

    }

    public Node get(int index){
        Node node = head;                    //............................
        for(int i = 1; i < index; i++){
            node = node.next; 
        }
        return node;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size - 1){
            return deleteLast();
        }
        Node prev = get (index - 1);      //..........................
        int val = prev.next.value; // Store the value of the node to be deleted
        prev.next = prev.next.next; // Bypass the node to be deleted
        size--; // Decrease the size of the list
        return val; // Return the value of the deleted node
    }

    public Node find(int value){
        Node temp = head;
        while(temp != null){
            if(temp.value == value){
                return temp; // Return the value if found
            }
            temp = temp.next; // Move to the next node
        }
       return null; // Return null if not found

    }
    public void modifyByIndex(int index, int newValue) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds!");
            return;
        }
        Node node = get(index);
        node.value = newValue;
    }

    public int getSize(){
        return size;
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
