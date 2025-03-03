class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Count_Leaves {
    public static int countLeaves(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return countLeaves(root.left) + countLeaves(root.right);
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(5);
        root.left = new Node(8);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(13);

        System.out.println("Number of leaves: " + countLeaves(root));
    }
}
