package Queue;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        System.out.print("Enter how many elements you want to insert: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int val = sc.nextInt();
            pq.add(val);
        }

        System.out.println("\nPriority Queue elements (ascending order):");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());  // retrieves and removes the head
        }
    }
}
