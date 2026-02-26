
    import java.util.Deque;
import java.util.ArrayDeque;

public class StackDemo {
    public static void main(String[] args) {
        // Declaration using Deque interface and ArrayDeque implementation
        Deque<String> stack = new ArrayDeque<>();

        // Pushing elements onto the stack
        stack.push("20");
        stack.push("30");
        stack.push("40");
        System.out.println("Stack after pushes: " + stack);

        // Peeking at the top element
        String topElement = stack.peek();
        System.out.println("Top element is: " + topElement); // Output: Three

        // Popping elements from the stack (LIFO order)
        System.out.println("Popped element: " + stack.pop()); // Output: Three
        System.out.println("Popped element: " + stack.pop()); // Output: Two
        System.out.println("Stack after pops: " + stack);
        
        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}


