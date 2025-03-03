class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Identical_tree {
    public static boolean SameTree(Node r1, Node r2) {
        if (r1 == null && r2 == null) {
            return true;  // Both are null, so they are identical
        }
        if (r1 == null || r2 == null) {
            return false; // One is null, the other is not, so not identical
        }
        if (r1.data != r2.data) {
            return false; // Data mismatch
        }
        return SameTree(r1.left, r2.left) && SameTree(r1.right, r2.right);
    }

    public static void main(String[] args) {
        // Creating two identical binary trees
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);

        // Checking if trees are identical
        if (SameTree(root1, root2)) {
            System.out.println("Both trees are identical.");
        } else {
            System.out.println("Trees are not identical.");
        }
    }
}
