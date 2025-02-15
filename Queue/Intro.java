import java.util.*;

class Queue {
    private int[] arr;
    private int front, rear;
    private int size;

    public Queue(int n) {
        arr = new int[n];
        front = -1;
        rear = -1;
        size = n;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Queue Overflow!");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
        }
        arr[rear] = x;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Queue Underflow!");
            return;
        }
        if (front == rear) { // Reset when the last element is removed
            front = rear = -1;
        } else {
            front++;
        }
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

public class Intro {
    public static void main(String[] args) {
        Queue q = new Queue(5); // Creating a queue of size 5
        
        q.push(10);
        q.push(20);
        q.push(30);
        
        System.out.println("Front: " + q.getFront()); // Output: 10
        System.out.println("Rear: " + q.getRear());   // Output: 30

        q.pop();
        System.out.println("Front after pop: " + q.getFront()); // Output: 20
    }
}
