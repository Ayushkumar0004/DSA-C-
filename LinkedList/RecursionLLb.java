import java.util.*;

class Node {
    int data;
    Node next; // Corrected type for `next`

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RecursionLLb {
    // Recursive function to create a linked list
    public Node CreateLL(int[] arr, int index, int size) {
        if (index == size) { // Base case: if index reaches size
            return null;
        }
        Node temp = new Node(arr[index]); // Create a new node
        temp.next = CreateLL(arr, index + 1, size); // Recursive call for the next node
        return temp; // Return the current node
    }

    public static void main(String[] args) {
        RecursionLLb o1 = new RecursionLLb();
        int[] arr = {5, 7, 8, 9, 11}; // Input array
        Node head = o1.CreateLL(arr, 0, arr.length); // Create linked list

        printLL(head); // Print the linked list
    }

    // Method to print the linked list
    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next; // Move to the next node
        }
        System.out.println("null");
    }
}
