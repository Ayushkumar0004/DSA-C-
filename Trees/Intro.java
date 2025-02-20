import java.util.*;
class Node {
    int data;
    Node left, right;  // No pointers in Java
    public Node(int value) {
        this.data = value;
        this.left = this.right = null;
    }
}
class Intro 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter root value: ");
        int x = sc.nextInt();
        
        Queue<Node> q1 = new LinkedList<>();
        Node root = new Node(x);
        q1.add(root);

        while (!q1.isEmpty()) {
            Node temp = q1.poll();

            System.out.print("Enter left child of " + temp.data + " (-1 for no node): ");
            int first = sc.nextInt();
            if (first != -1) {
                temp.left = new Node(first);
                q1.add(temp.left);
            }

            System.out.print("Enter right child of " + temp.data + " (-1 for no node): ");
            int second = sc.nextInt();
            if (second != -1) {
                temp.right = new Node(second);
                q1.add(temp.right);
            }
        }
        sc.close();
    }
}