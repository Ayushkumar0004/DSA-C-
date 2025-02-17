import java.util.*;
import java.util.Queue;
import java.util.Stack;
public class FirsrkRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the k value: ");
        int k = sc.nextInt();

        Queue<Integer> q1 = new LinkedList<>();  // Fixed Queue Initialization
        Stack<Integer> s1 = new Stack<>();

        // Adding elements to the queue
        q1.offer(5);
        q1.offer(7);
        q1.offer(2);
        q1.offer(4);
        q1.offer(9);
        q1.offer(8);

        // Check if k is valid
        if (k > q1.size() || k <= 0) {
            System.out.println("Invalid k value!");
            return;
        }

        // Push first k elements into stack
        for (int i = 0; i < k; i++) {
            s1.push(q1.poll());  // Polling removes elements from queue
        }

        // Pop stack elements back into queue
        while (!s1.isEmpty()) {
            q1.offer(s1.pop());  // Offer adds elements back
        }

        // Move the remaining elements from front to rear to maintain order
        int remaining = q1.size() - k;
        while (remaining-- > 0) {
            q1.offer(q1.poll());
        }

        // Print the reversed queue
        System.out.println("Queue after reversing first k elements:");
        while (!q1.isEmpty()) {
            System.out.print(q1.poll() + " ");
        }
    }
}
