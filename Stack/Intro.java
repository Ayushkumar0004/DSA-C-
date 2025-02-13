// In stack we use LIFO(Last in fast out)
// Operation:
// 1. Push: Add an element to the stack.
// 2. Pop: Remove an element from the stack.
// 3. Peek: Get the top element from the stack without removing it.
// 4. IsEmpty: Check if the stack is empty or not.
// SIZE, top
// 5. Clear: Remove all elements from the stack.
// 6. Get: Get the element at the specified index from the stack.
// 7. Set: Set the element at the specified index in the stack.
// 8. Remove: Remove the element at the specified index from the stack.

import java.util.Scanner;

class Stack {
    private int[] arr;
    private int size;
    private int top;

    // Constructor
    public Stack(int s) {
        size = s;
        top = -1;
        arr = new int[size]; // Allocate dynamic array based on input size
    }

    // Push operation
    public void push(int val) {
        if (top == size - 1) {
            System.out.println("Stack Overflow!");
        } else {
            top++;
            arr[top] = val;
        }
    }

    // Pop operation
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
        } else {
            top--; // Remove the top element
        }
    }

    // Peek operation (returns top element without removing)
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return arr[top];
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Get stack size (number of elements in stack)
    public int size() {
        return top + 1;
    }

    // Clear the stack
    public void clear() {
        top = -1;
    }

    // Get element at a specific index
    public int get(int index) {
        if (index < 0 || index > top) {
            System.out.println("Invalid index!");
            return -1;
        } else {
            return arr[index];
        }
    }

    // Set an element at a specific index
    public void set(int index, int value) {
        if (index < 0 || index > top) {
            System.out.println("Invalid index!");
        } else {
            arr[index] = value;
        }
    }

    // Remove an element at a specific index
    public void remove(int index) {
        if (index < 0 || index > top) {
            System.out.println("Invalid index!");
        } else {
            for (int i = index; i < top; i++) {
                arr[i] = arr[i + 1]; // Shift elements left
            }
            top--; // Reduce stack size
        }
    }

    // Display stack elements
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

public class Intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Create stack of size 5
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // Output: Stack elements: 10 20 30

        stack.pop();
        stack.display(); // Output: Stack elements: 10 20

        System.out.println("Top element: " + stack.peek()); // Output: Top element: 20

        stack.set(1, 25);
        stack.display(); // Output: Stack elements: 10 25

        stack.remove(0);
        stack.display(); // Output: Stack elements: 25

        stack.clear();
        stack.display(); // Output: Stack is empty!

        sc.close();
    }
}