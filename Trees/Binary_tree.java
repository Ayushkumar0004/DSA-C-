import java.util.*;
class Node {
    int data;
    Node left, right;

    // Constructor
    Node(int value) {
        this.data = value;
        this.left = this.right = null;
    }
}

class Binary_tree {
    
    // Function to construct the binary tree recursively
    static Node buildTree(Scanner sc) {
        System.out.print("Enter node value (-1 for NULL): ");
        int x = sc.nextInt();
        
        if (x == -1) { // Base case for recursion
            return null;
        }
        
        Node temp = new Node(x);
        System.out.println("Enter left child of " + x);
        temp.left = buildTree(sc);
        System.out.println("Enter right child of " + x);
        temp.right = buildTree(sc);
        
        return temp;
    }
    
    // Function to print the tree in a tree-like format
    static void printTree(Node root, int level) {
        if (root == null) {
            return;
        }

        // Print right subtree first (so the tree structure is visible)
        printTree(root.right, level + 1);

        // Print current node with indentation
        for (int i = 0; i < level; i++) {
            System.out.print("    "); // Indentation for tree structure
        }
        System.out.println(root.data);

        // Print left subtree
        printTree(root.left, level + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Build tree
        System.out.println("Build your binary tree:");
        Node root = buildTree(sc);
        
        // Print tree in a structured format
        System.out.println("\nTree structure:");
        printTree(root, 0);
        
        sc.close();
    }
}
