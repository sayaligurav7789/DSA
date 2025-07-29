package Queue;

public class CircularQ {
    protected int[] queue;
    private static final int DEFAULT_SIZE = 10;

    protected int rear = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQ(){
        this(DEFAULT_SIZE);
    }

    public CircularQ(int size) {
        this.queue = new int[size];
    }

    public boolean isFull() {
        return size == queue.length; // ptr is at last index
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        queue[rear++] = item;
        rear = rear % queue.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        int removed = queue[front++];
        front = front % queue.length;
        size--;
        return removed;
    }

    public int front() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return queue[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(queue[i] + " -> ");
            i++;
            i %= queue.length;
        } while (i != rear);
        System.out.println("END");
    }

}