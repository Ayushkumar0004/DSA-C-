import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLL {
    Node head;

    // Method to add a node to the linked list
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) { // Traverse until the last node
                temp = temp.next;
            }
            temp.next = newNode; // Add the new node at the end
        }
    }

    // Method to display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLL o1 = new ReverseLL();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            o1.addNode(data); // Add each element to the linked list
        }

        System.out.println("Linked List nodes are: ");
        o1.display(); // Display the linked list

        sc.close();
    }
}
