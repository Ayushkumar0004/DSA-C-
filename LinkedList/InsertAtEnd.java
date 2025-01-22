import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertAtEnd {
    Node head;

    // Method to insert a node at the end
    public void InsertEnd(int data) {
        Node newNode = new Node(data);

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
            return;
        }

        // If the list is not empty, traverse to the last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;  // Move to the next node
        }

        // Insert the new node at the end
        temp.next = newNode;
    }

    // Method to display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        InsertAtEnd obj = new InsertAtEnd();
        Scanner sc = new Scanner(System.in);

        // Asking for number of nodes
        System.out.println("Enter the number of nodes:");
        int n = sc.nextInt();

        // Inserting nodes
        System.out.println("Enter the data for each node:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            obj.InsertEnd(num);  // Insert each node at the end
        }

        // Display the linked list
        System.out.println("The linked list is:");
        obj.display();

        // Close the scanner
        sc.close();
    }
}