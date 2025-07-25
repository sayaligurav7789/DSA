package Queue;
import java.util.Scanner;

public class DequeBeginEndUserInput {
    static int size = 10;
    static int[] deque = new int[size];
    static int front = -1, rear = -1;

    public static void insertAtBeginning(int value) {
        if ((front == 0 && rear == size - 1) || (front == rear + 1)) {
            System.out.println("Deque is Full");
            return;
        }
        if (front == -1) {
            front = rear = 0;
        } else if (front == 0) {
            front = size - 1;
        } else {
            front--;
        }
        deque[front] = value;
    }
    public static void insertAtEnd(int value) {
        if ((front == 0 && rear == size - 1) || (rear == (front - 1 + size) % size)) {
            System.out.println("Deque is Full");
            return;
        }
        if (front == -1) {
            front = rear = 0;
        } else if (rear == size - 1 && front != 0) {
            rear = 0;
        } else {
            rear++;
        }
        deque[rear] = value;
    }

    public static void deleteAtBeginning() {
        if (front == -1) {
            System.out.println("Deque is Empty");
            return;
        }
        System.out.println("Deleted: " + deque[front]);
        if (front == rear) {
            front = rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front++;
        }
    }

    public static void deleteAtEnd() {
        if (front == -1) {
            System.out.println("Deque is Empty");
            return;
        }
        System.out.println("Deleted: " + deque[rear]);
        if (front == rear) {
            front = rear = -1;
        } else if (rear == 0) {
            rear = size - 1;
        } else {
            rear--;
        }
    }

    public static void display() {
        if (front == -1) {
            System.out.println("Deque is Empty");
            return;
        }
        System.out.print("Deque: ");
        int i = front;
        while (true) {
            System.out.print(deque[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\n1. Insert at Beginning");
            System.out.println("2. Delete at End");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    value = sc.nextInt();
                    insertAtBeginning(value);
                    break;
                case 2:
                    deleteAtEnd();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
