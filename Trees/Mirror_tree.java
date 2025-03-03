class Node {
    int data;
    Node left, right;
    
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Mirror_tree {
    // Function to mirror the tree
    public static void Mirror(Node root) {
        if (root == null) {
            return;
        }
        // Swap left and right children
        Node temp = root.right;
        root.right = root.left;
        root.left = temp;
        
        // Recursively mirror left and right subtrees
        Mirror(root.left);
        Mirror(root.right);
    }

    // Function to print inorder traversal of a tree
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        // Constructing the tree
        Node root = new Node(5);
        root.left = new Node(8);
        root.right = new Node(33);
        root.left.left = new Node(10);
        root.left.right = new Node(17);
        root.right.left = new Node(15);
        root.right.right = new Node(20);

        // Print original tree
        System.out.println("Original tree (Inorder Traversal):");
        inorder(root);
        System.out.println();

        // Mirror the tree
        Mirror(root);

        // Print mirrored tree
        System.out.println("Mirrored tree (Inorder Traversal):");
        inorder(root);
    }
}
