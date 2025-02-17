import java.util.Stack;

public class QueueReverse {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int count; // To track number of elements in queue

    // Constructor to initialize the queue
    public QueueReverse(int n) {  // Fixed constructor name
        arr = new int[n];
        front = 0;
        rear = 0;
        size = n;
        count = 0;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return count == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return count == size;
    }

    // Insert an element into the queue
    public void push(int x) {
        if (isFull()) {
            System.out.println("Queue Overflow!");
            return;
        }
        arr[rear] = x;
        rear = (rear + 1) % size; // Circular increment
        count++;
    }

    // Remove an element from the queue
    public void pop() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }
        front = (front + 1) % size; // Circular increment
        count--;
    }

    // Get the front element of the queue
    public int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        return arr[front];
    }

    // Get the rear element of the queue
    public int getRear() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        return arr[(rear - 1 + size) % size]; // Get last inserted element
    }

    public static void main(String[] args) {
        QueueReverse q1 = new QueueReverse(5);
        Stack<Integer> st = new Stack<>();  // Fixed stack initialization

        // Insert elements into the queue
        q1.push(10);
        q1.push(20);
        q1.push(30);
        q1.push(40);
        q1.push(50);

        // Transfer elements from queue to stack
        while (!q1.isEmpty()) {  // Fixed method name
            st.push(q1.getFront());  // Fixed method name
            q1.pop();
        }

        // Transfer elements back to queue (Reversing the queue)
        while (!st.isEmpty()) {  // Fixed method name
            q1.push(st.peek());  // Fixed method name
            st.pop();
        }

        // Printing the reversed queue
        System.out.println("Reversed Queue Elements:");
        while (!q1.isEmpty()) {
            System.out.print(q1.getFront() + " ");
            q1.pop();
        }
    }
}
