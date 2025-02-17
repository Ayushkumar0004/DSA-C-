import java.util.Stack;

public class Queue_Stack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // Check if queue is empty
    public boolean empty() {
        return s1.empty() && s2.empty();
    }

    // Push an element to the queue
    public void push(int x) {
        s1.push(x);
    }

    // Pop (dequeue) an element from the queue
    public int pop() {
        if (empty()) {
            System.out.println("Queue is empty!");
            return -1; // Return -1 to indicate an empty queue
        }
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop(); // Remove the front element
    }

    // Peek (get front element without removing)
    public int peek() {
        if (empty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek(); // Get the front element without removing
    }

    public static void main(String[] args) {
        Queue_Stack q = new Queue_Stack();
        
        q.push(1);
        q.push(2);
        q.push(3);
        
        System.out.println("Front Element: " + q.peek()); // Output: 1
        System.out.println("Popped: " + q.pop()); // Output: 1
        System.out.println("Popped: " + q.pop()); // Output: 2
        System.out.println("Front Element: " + q.peek()); // Output: 3
        System.out.println("Popped: " + q.pop()); // Output: 3
        System.out.println("Popped: " + q.pop()); // Output: Queue is empty! -1
    }
}
