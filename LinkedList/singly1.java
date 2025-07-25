package LinkedList;

public class singly1 {

    private Node head;
    private Node tail;
    private int size;

    public singly1(){
        this.size = 0;
    }

    private class Node{
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
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);
        }
        if(index == size){
            insertLast(value);
        }

        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }
    
    public int deleteFirst(){
        int val = head.value;
        head = head.next;

        if(head == null){
            tail = null;    
        }
        size--;
        return val;
    }
    
    public Node get(int index){  //getting the any index 
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }

    public int deleteLast(){
        if(size <= 1){
           return deleteFirst();
        }
        Node secondlast = get(size - 2);  
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size - 1){
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }
  
    public void insertRec(int value, int index){
        head = insertRec(value, index, head);  

    }
    private Node insertRec(int value, int index, Node node){
        if(index == 0){
            Node temp = new Node(value, node);
            size++;
            return temp;
        }
        node.next = insertRec(value, index-1, node.next);
        return node;
    }

    public Node find(int value){
        Node temp = head;
        while(temp != null){
           if(temp.value == value){
               return temp; 
           }
           temp = temp.next;
        }
        return null;
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
        Node temp = head;                //dont take head directly
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        singly1 LL = new singly1();
        LL.insertFirst(130);
        LL.insertFirst(140);
        LL.insertFirst(150);
        LL.insertFirst(160);

        LL.insertRec(50, 2);
        LL.display();

        LL.insertLast(170);
        LL.display();

        LL.insert(200, 4);
        LL.display();

        LL.deleteFirst();
        LL.display();

        LL.deleteLast();
        LL.display();

        LL.delete(3);
        LL.display();

        LL.modifyByIndex(0, 100);
        LL.display();

        System.out.println("Size of List: " + LL.getSize());

        singly1.Node foundNode = LL.find(130);
        if (foundNode != null) {
            System.out.println("Item 130 found with value: " + foundNode.value);
        } else {
            System.out.println("Item 130 not found in the list.");
        }

    }
}
