// Pre-Order traversal -> NLR
// In-Order traversal -> LNR
// Post-Order traversal -> LRN
// Time Complexity: O(n)
// Space Complexity: O(n) for the recursion stack

import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null; // Initialize left and right children as null
    }
}

public class Traversal_tree {

    // Preorder Traversal: Root -> Left -> Right
    void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " "); // Visit root
        preOrder(root.left);  // Visit left subtree
        preOrder(root.right); // Visit right subtree
    }

    // Inorder Traversal: Left -> Root -> Right
    void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);   // Visit left subtree
        System.out.print(root.data + " "); // Visit root
        inOrder(root.right);  // Visit right subtree
    }

    // Postorder Traversal: Left -> Right -> Root
    void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);  // Visit left subtree
        postOrder(root.right); // Visit right subtree
        System.out.print(root.data + " "); // Visit root
    }

    // Function to build a tree dynamically from user input
    Node buildTree() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the root node value: ");
        int rootValue = sc.nextInt();
        Node root = new Node(rootValue);

        // Queue to keep track of nodes for adding children
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            // Ask for the left child
            System.out.print("Enter left child of " + current.data + " (-1 for no child): ");
            int leftValue = sc.nextInt();
            if (leftValue != -1) { // If user inputs -1, no left child is created
                current.left = new Node(leftValue);
                queue.offer(current.left); // Add left child to queue
            }

            // Ask for the right child
            System.out.print("Enter right child of " + current.data + " (-1 for no child): ");
            int rightValue = sc.nextInt();
            if (rightValue != -1) { // If user inputs -1, no right child is created
                current.right = new Node(rightValue);
                queue.offer(current.right); // Add right child to queue
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Traversal_tree tree = new Traversal_tree();

        // Step 1: Build the tree
        Node root = tree.buildTree();

        // Step 2: Choose traversal method
        while (true) {
            System.out.println("\nChoose a Traversal Method:");
            System.out.println("1. PreOrder Traversal (Root -> Left -> Right)");
            System.out.println("2. InOrder Traversal (Left -> Root -> Right)");
            System.out.println("3. PostOrder Traversal (Left -> Right -> Root)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("PreOrder Traversal: ");
                    tree.preOrder(root);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("InOrder Traversal: ");
                    tree.inOrder(root);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("PostOrder Traversal: ");
                    tree.postOrder(root);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
