package LinkedList;

public class Doubly {
    private Node head;
    private Node tail;
    private int size;

    public Doubly(){
        this.size = 0;
    }

    class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        
        if(head != null){
            head.prev = node;
        }
        head = node;

        if (tail == null) {
            tail = node;
        }
        size++;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        node.next = null;
        if (tail == null) {
            // If list is empty, reuse insertFirst logic
            insertFirst(value);
            return;
        }
        node.prev = tail;
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }

        Node temp = head;
        for(int i = 0; i < index - 1; i++){
            temp = temp.next;
        }

        Node node = new Node(value);
        node.next = temp.next;
        node.prev = temp;
        temp.next = node;

        if(node.next != null){
            node.next.prev = node;
        }

        size++;
    }

    public int deleteFirst(){
        if(head == null){
            return -1;
        }
        int val = head.value;
        head = head.next;
        if(head != null){
            head.prev = null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(tail == null){
            return -1;
        }
        int val = tail.value;
        tail = tail.prev;
        if(tail != null){
            tail.next = null;
        }
        size--;
        return val;
    }
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size -1){
            return deleteLast();
        }
        
        Node temp = head;
        for(int i = 0; i < index -1; i++){
            temp = temp.next;
        }
        int val = temp.next.value;
        temp.next = temp.next.next;
        if(temp.next != null){
            temp.next.prev = temp;
        }
        size--;
        return val;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void displayRev(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.prev;
        }
        System.out.println("Start");        
    }

    public static void main(String[] args) {
        Doubly DLL = new Doubly();
        DLL.insertFirst(50);
        DLL.insertFirst(60);
        DLL.insertFirst(70);
        DLL.insertFirst(80);
        DLL.insertFirst(90);
        DLL.insertFirst(100);
        DLL.insertLast(130);
        DLL.insert(150, 0);
        DLL.insert(180, 4);
        DLL.display();

        DLL.deleteFirst();
        DLL.display();

        DLL.deleteLast();
        DLL.display();

        DLL.delete(2);
        DLL.display();

        // DLL.display();
        // DLL.displayRev();

    }
}
