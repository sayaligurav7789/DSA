import java.util.Stack;

public class InBuiltExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();   //used generics which shows the stack stoars only integer values
        stack.push(12);
        stack.push(24);
        stack.push(45);
        stack.push(56);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
