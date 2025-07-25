import java.util.Scanner;

interface Stack {
    int size = 5;  
    
    void push(int item);  
    int pop();  
    void display();  
    boolean overflow();  
    boolean underflow();  

class IntegerStack implements Stack {
    private int[] stack;
    private int top;

    public IntegerStack() {
        stack = new int[size];  
        top = -1;  
    }

    @Override
    public void push(int item) {
        if (overflow()) {
            System.out.println("Stack Overflow! Cannot push " + item);
            return;
        }
        stack[++top] = item;
        System.out.println(item + " pushed onto stack.");
    }

    @Override
    public int pop() {
        if (underflow()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        }
        int item = stack[top--];
        System.out.println(item + " popped from stack.");
        return item;
    }

    @Override
    public void display() {
        if (underflow()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    @Override
    public boolean overflow() {
        return top == size - 1;
    }

    @Override
    public boolean underflow() {
        return top == -1;
    }
}

public class StackTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntegerStack myStack = new IntegerStack();
        int choice, value;

        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = scanner.nextInt();
                    myStack.push(value);
                    break;
                case 2:
                    myStack.pop();
                    break;
                case 3:
                    myStack.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
}
