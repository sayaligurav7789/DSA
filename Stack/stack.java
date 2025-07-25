import java.util.Scanner;

public class stack {
    int size; 
    int[] stk; 
    int top = -1; 

    void push(int ele) {
        if (top == size - 1) {
            System.out.println("Stack is full");
        } else {
            top++;
            stk[top] = ele;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            int ele = stk[top];
            top--;
            System.out.println("Popped element: " + ele);
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stk[i]);
            }
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + stk[top]);
        }
    }

    void isEmpty(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack is not empty");
        }
    }
    void isFull(){
        if(top == size - 1){
            System.out.println("Stack is full");
        }
        else{
            System.out.println("Stack is not full");
        }
    }

    public static void main(String[] args) {
        stack s = new stack();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack:");
        s.size = sc.nextInt();
        s.stk = new int[s.size];

        int choice;
        do {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Top");
            System.out.println("5. Top");
            System.out.println("6. isEmpty");
            System.out.println("7. isFull");
            System.out.println("8. Exit");
            System.out.println("\nEnter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter element to push:");
                    int ele = sc.nextInt();
                    s.push(ele);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    s.peek();
                    break;
                case 5:
                    s.isEmpty();
                    break;
                case 7:
                    s.isFull();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
        sc.close();
    }
}