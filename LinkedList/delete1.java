import java.util.*;

class Node {
    int data;
    Node next; // Corrected type of `next`

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class delete1 {
    private Node head; // Reference to the head of the linked list

    // Method to add a node at the end of the linked list
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to display the linked list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Method to delete the first node of the linked list
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is already empty. Nothing to delete.");
            return;
        }
        head = head.next; // Move the head to the next node, effectively deleting the first node
        System.out.println("First node deleted.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        delete1 d1 = new delete1(); // Create an object of the class

        System.out.println("Enter the number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter the data for the nodes:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            d1.addNode(num); // Add nodes to the list
        }

        System.out.println("The linked list is:");
        d1.display(); // Display the linked list

        System.out.println("Deleting the first node...");
        d1.deleteFirst(); // Delete the first node

        System.out.println("The linked list after deletion is:");
        d1.display(); // Display the linked list after deletion
    }
}
