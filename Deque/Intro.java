import java.util.*;

class Deque {
    private int front, rear, size;
    private int[] arr;

    // Constructor
    public Deque(int n) {
        size = n;
        arr = new int[size];
        front = rear = -1;
    }

    // Check if the deque is empty
    boolean isEmpty() {
        return front == -1;
    }

    // Check if the deque is full
    boolean isFull() {
        return (rear + 1) % size == front;
    }

    // Insert element at the front
    void push_front(int x) {
        if (isFull()) {
            System.out.println("Deque is full! Cannot insert at front.");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            front = (front - 1 + size) % size;
        }
        arr[front] = x;
    }

    // Insert element at the back
    void push_back(int x) {
        if (isFull()) {
            System.out.println("Deque is full! Cannot insert at back.");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % size;
        }
        arr[rear] = x;
    }

    // Remove element from the front
    void pop_front() {
        if (isEmpty()) {
            System.out.println("Deque is empty! Cannot remove from front.");
            return;
        }

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    // Remove element from the back
    void pop_back() {
        if (isEmpty()) {
            System.out.println("Deque is empty! Cannot remove from back.");
            return;
        }

        if (front == rear) {
            front = rear = -1;
        } else {
            rear = (rear - 1 + size) % size;
        }
    }

    // Get front element
    int start() {
        if (isEmpty()) {
            System.out.println("Deque is empty! No front element.");
            return -1;
        }
        return arr[front];
    }

    // Get rear element
    int end() {
        if (isEmpty()) {
            System.out.println("Deque is empty! No rear element.");
            return -1;
        }
        return arr[rear];
    }

    // Display the deque
    void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return;
        }

        System.out.print("Deque elements: ");
        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
}

// Main class
public class Intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize deque of size 5
        Deque dq = new Deque(5);

        // Perform operations
        dq.push_front(10);
        dq.push_back(20);
        dq.push_front(5);
        dq.push_back(30);
        dq.push_back(40); // Will fill the deque
        dq.push_back(50); // Should print "Deque is full!"

        dq.display(); // Show current elements

        System.out.println("Front element: " + dq.start());
        System.out.println("Rear element: " + dq.end());

        dq.pop_front();
        dq.pop_back();

        dq.display(); // Show elements after pop operations

        sc.close();
    }
}