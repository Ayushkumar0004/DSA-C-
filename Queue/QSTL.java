import java.util.LinkedList;
import java.util.Queue;

public class QSTL {
    public static void main(String[] args) {
        Queue<Integer> Q = new LinkedList<>(); // FIX: Instantiate with LinkedList

        Q.offer(20);  // FIX: Use offer() instead of push()
        Q.offer(54);
        Q.offer(85);

        Q.poll(); // FIX: Use poll() instead of pop()

        System.out.println("Front element: " + Q.peek()); // FIX: Use peek() instead of front()

        // To get the last element, traverse the queue
        Integer back = null;
        for (Integer num : Q) {
            back = num;
        }
        System.out.println("Back element: " + back); // FIX: Get last element manually

        System.out.println("Size of queue: " + Q.size()); // FIX: Use size()
    }
}
