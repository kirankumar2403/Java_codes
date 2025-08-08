import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        // Creating an instance of Stack class  
        Stack<Integer> stk = new Stack<>();

        // Checking if stack is empty
        boolean result = stk.empty();
        System.out.println("Is the stack empty? " + result);

        // Pushing elements into stack
        stk.push(78);
        stk.push(113);
        stk.push(90);
        stk.push(120);

        // Printing elements of the stack
        System.out.println("Elements in Stack: " + stk);

        result = stk.empty();
        System.out.println("Is the stack empty? " + result);

        // Retrieving top element
        int a = stk.peek();
        System.out.println("Peek element is: " + a);

        // Popping from stack
        int b = stk.pop();
        System.out.println("Popped element is: " + b);
    }
}
