public class MaxHeap {
    int[] heap;
    int size;

    public MaxHeap(int capacity) {
        heap = new int[capacity + 1]; // Indexing starts from 1
        size = 0;
    }

    // Insert an element into the heap
    public void insert(int value) {
        size++;
        int i = size;
        heap[i] = value;

        // Heapify up
        while (i > 1 && heap[i] > heap[i / 2]) {
            int temp = heap[i];
            heap[i] = heap[i / 2];
            heap[i / 2] = temp;
            i = i / 2;
        }
    }

    // Display the heap
    public void printHeap() {
        System.out.print("Max Heap: ");
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);

        int[] data = {23, 55, 46, 35, 10};

        for (int val : data) {
            maxHeap.insert(val);
        }

        maxHeap.printHeap();
    }
}
