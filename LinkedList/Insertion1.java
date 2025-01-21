import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Insertion1 {
    Node head;

    // Method to insert at the beginning
    public void InsertBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
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
        Insertion1 list = new Insertion1();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of nodes:");
        int n = sc.nextInt();

        System.out.println("Enter the data for the nodes:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.InsertBeginning(num);
        }
        System.out.println("The linked list is:");
        list.display();
        sc.close();
    }
}
