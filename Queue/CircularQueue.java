import java.util.*;

class CircularQ {
    private int[] arr;
    private int front, rear, size, capacity;

    public CircularQ(int n) {  // FIX: Constructor name should match class name
        capacity = n;
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Queue Overflow!");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }
        arr[rear] = x;
        size++;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Queue Underflow!");
            return;
        }
        if (front == rear) { // Reset when last element is removed
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
    }

    public int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        return arr[front];
    }

    public int getRear() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        return arr[rear];
    }
}

public class CircularQueue {
    public static void main(String[] args) {
        CircularQ q = new CircularQ(5);  // FIX: Correct constructor call

        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);

        System.out.println("Front: " + q.getFront()); // Output: 10
        System.out.println("Rear: " + q.getRear());   // Output: 50

        q.pop();
        q.push(60); // Should replace 10 in a circular manner

        System.out.println("Front after pop and push: " + q.getFront()); // Output: 20
        System.out.println("Rear after push: " + q.getRear());   // Output: 60
    }
}
