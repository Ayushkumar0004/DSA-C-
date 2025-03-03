import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;
    
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Node_cousin {

    // Function to check if two nodes are cousins
    public static boolean IsCousin(Node root, int a, int b) {
        if (root == null) return false;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            boolean foundA = false, foundB = false;

            for (int i = 0; i < size; i++) {
                Node temp = q.poll();
                
                // Check if `a` or `b` is found at this level
                if (temp.data == a) foundA = true;
                if (temp.data == b) foundB = true;

                // Check if they have the same parent
                if (temp.left != null && temp.right != null) {
                    if ((temp.left.data == a && temp.right.data == b) ||
                        (temp.left.data == b && temp.right.data == a)) {
                        return false; // They are siblings, not cousins
                    }
                }

                // Add children to the queue
                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
            }

            // If both nodes are found at the same level but have different parents, return true
            if (foundA && foundB) return true;
            if (foundA || foundB) return false; // If only one is found at this level, return false
        }
        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Are 4 and 6 cousins? " + IsCousin(root, 4, 6)); // true
        System.out.println("Are 4 and 5 cousins? " + IsCousin(root, 4, 5)); // false (they are siblings)
    }
}
