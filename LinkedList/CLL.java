package LinkedList;

public class CLL {
    private Node head;
    private Node tail;
    private int size;

    public CLL(){
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

    public void insertFirst(int value){
        Node node = new Node(value);

        if(head == null){
            head = node;
            tail = node;
            node.next = node;
        }
        node.next = head;
        tail.next = node;
        head = node;
        size++;
    }
    public void insertLast(int value){
        Node node= new Node(value);
        if(head == null){
            head = node;
            tail = node;
            node.next = node;
        }
        tail.next = node;
        node.next = head;
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
        temp.next = node;
        size++;
    }

    public int deleteFirst(){
        int val = head.value;
        if(head == null){
            System.out.println("List is empty");
            return -1;
        }
        head = head.next;
        tail.next = head;
        size--;
        return val;
    }

    public int deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return -1;
        }
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        int val = tail.value;
        tail = temp;
        tail.next = head;
        size--;
        return val;
    }

    public int delete(int index){
        if(head == null){
            System.out.println("List is empty");
            return -1;
        }
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
        size--;
        return val;
        
    }


    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
    
        Node temp = head;
        System.out.print("head->");
        while (true) {
            System.out.print( temp.value + "->");
            temp = temp.next;
            if(temp == head) break;
        }
        System.out.println("null");
    
    }
    
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insertFirst(130);
        list.insertFirst(150);
        list.insertFirst(170);
        list.insertFirst(180);
        list.insertFirst(190);
        list.insertLast(200);
        list.insert(100, 2);
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();

        list.delete(2);
        list.display();
    }
}
