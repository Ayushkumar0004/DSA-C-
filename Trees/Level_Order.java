import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null; // Initialize children as null
    }
}

public class Level_Order {

    // Level Order Traversal: Uses a Queue (BFS Approach)
    void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();  // Remove and get the front node
            System.out.print(temp.data + " "); // Print current node

            if (temp.left != null) { // If left child exists, add to queue
                q.add(temp.left);
            }
            if (temp.right != null) { // If right child exists, add to queue
                q.add(temp.right);
            }
        }
        System.out.println(); // Print new line after traversal
    }

    // Function to build a tree dynamically from user input
    Node buildTree() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the root node value: ");
        int rootValue = sc.nextInt();
        Node root = new Node(rootValue);

        // Queue to keep track of nodes for adding children
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            // Ask for the left child
            System.out.print("Enter left child of " + current.data + " (-1 for no child): ");
            int leftValue = sc.nextInt();
            if (leftValue != -1) { // If user inputs -1, no left child is created
                current.left = new Node(leftValue);
                queue.add(current.left); // Add left child to queue
            }

            // Ask for the right child
            System.out.print("Enter right child of " + current.data + " (-1 for no child): ");
            int rightValue = sc.nextInt();
            if (rightValue != -1) { // If user inputs -1, no right child is created
                current.right = new Node(rightValue);
                queue.add(current.right); // Add right child to queue
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Level_Order tree = new Level_Order();

        // Step 1: Build the tree
        Node root = tree.buildTree();

        // Step 2: Perform Level Order Traversal
        System.out.print("Level Order Traversal: ");
        tree.levelOrder(root);
    }
}
