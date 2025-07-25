import java.util.Scanner;
package Queue;
class queue{
    int size;
    int[] queue;
    int front = -1;
    int rear = -1;

    queue(int size){
        this.size = size;
        this.queue = new int[size];
    }

    void enqueue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to enqueue:");

        if (rear == size - 1){
            System.out.println("Queue is full");
        } 
	    else{
            int ele = sc.nextInt();
            if (front == -1){
                front = 0;
            }
            rear++;
            queue[rear] = ele;
        }
    }

    void dequeue(){
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } 
	    else{
            int ele = queue[front];
            front++;
            System.out.println("Dequeued element: " + ele);
        }
    }

    void display(){
        if (front == -1 || front > rear){
            System.out.println("Queue is empty");
        } 
	    else{
            System.out.println("Queue elements:");
            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i]);
            }
        }
    }

    void peek(){
        if (front == -1 || front > rear){
            System.out.println("Queue is empty");
        } 
	else{
            System.out.println("Front element: " + queue[front]);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the queue:");
        int size = sc.nextInt();

        queue q = new queue(size);

        while (true){
            System.out.println("Choose an operation: 1. Enqueue 2. Dequeue 3. Display 4. Peek 5. Exit");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    q.enqueue();
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    q.peek();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
