import java.util.*;

public class PrintElements {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int count; // To track number of elements in queue

    // Constructor to initialize the queue
    public PrintElements(int n) {
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
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Queue: ");
        int size = sc.nextInt();

        PrintElements q = new PrintElements(size);

        // Taking queue input
        System.out.println("Enter " + size + " elements to push into queue:");
        for (int i = 0; i < size; i++) {
            int value = sc.nextInt();
            q.push(value);
        }

        // Printing elements in circular manner
        System.out.println("Queue elements in circular order:");
        for (int i = 0; i < size; i++) {
            int frontValue = q.getFront();
            System.out.println(frontValue);
            q.pop();
            q.push(frontValue); // Reinsert to maintain circular order
        }

        // Close scanner to prevent resource leak
        sc.close();
    }
}
